package jpower.idea.config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils {
    public static String getResourceAsString(String path) throws IOException {
        InputStream stream = Utils.class.getClassLoader().getResourceAsStream(path);

        if (stream == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder();

        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        {
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append('\n');
            }
        }

        return builder.toString();
    }
}
