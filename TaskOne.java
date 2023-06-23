public class TaskOne {
    public static void main(String[] args) {
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String text = json.substring(1, json.length() - 1);
        String[] keyWithValue = text.split(", ");
        StringBuilder res = new StringBuilder();
        boolean flag = true;

        for (String item : keyWithValue) {
            String[] keyValue = item.split(":" );
            String key = keyValue[0].replace("\"", ""); 
            String value = keyValue[1].replace("\"", ""); 
            if (!value.equalsIgnoreCase("null")) {
                if(flag == false)
                res.append(" AND ");
            res.append(key).append(" = ").append(value);
            flag = false; 
            }  
        }
        String sql = "SELECT * FROM students WHERE " + res.toString();
        System.out.println(sql);          
    }
}