
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class d {
     public static String S(String template) {
        // Regular expression to find placeholders in the form ${variableName}
        Pattern pattern = Pattern.compile("\\$\\{(\\w+)}");
        Matcher matcher = pattern.matcher(template);
        StringBuffer result = new StringBuffer();

        // Replace all placeholders
        while (matcher.find()) {
            String variableName = matcher.group(1); // Get the variable name between ${}
            String variableValue = getVariableValue(variableName); // Get the variable value using reflection

            // If the variable is found, replace it, otherwise leave it blank
            if (variableValue != null) {
                matcher.appendReplacement(result, variableValue);
            } else {
                matcher.appendReplacement(result, "");  // Replace with empty string if variable not found
            }
        }
        matcher.appendTail(result); // Append any remaining part of the string
        return result.toString();
    }

    // Use reflection to find the value of a variable with the given name
    private static String getVariableValue(String variableName) {
        try {
            // Get the calling class (the one that called S())
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String callingClassName = stackTrace[2].getClassName();
            Class<?> callingClass = Class.forName(callingClassName);

            // Search for the field in the calling class
            Field field = callingClass.getDeclaredField(variableName);
            field.setAccessible(true);  // Allow access to private fields

            // Get the value of the field (variable)
            Object value = field.get(null);  // Assuming the field is static
            return value.toString();
        } catch (Exception e) {
            return null;  // Return null if the variable is not found
        }
    }
}
