/*
    Token Class contains: 
        the value of the token,
        what type of token it is, 
        and the code associated with that type
 */
public class Token {
    
    private String value;
    private String type;
    private Integer code;

    public Token(String value, String type, Integer code) {
        this.value = value;
        this.type = type;
        this.code = code;
    }

    public String getValue() {
        return this.value;
    }

    public String getEscapedValue() {
        return this.value.replace("\n", "\\n");
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return this.type; 
    }

    public void setType(String type) {
        this.type = type; 
    }

    public Integer getCode() {
        return this.code; 
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String toJSON() {

        return new StringBuilder()
            .append("{ ")
            .append("\"value\": \"" + this.getEscapedValue() + "\"")
            .append(", ")
            .append("\"type\": \"" + this.type + "\"")
            .append(", ")
            .append("\"code\": \"" + this.code + "\"")
            .append(" }")
            .toString();
    }
}
