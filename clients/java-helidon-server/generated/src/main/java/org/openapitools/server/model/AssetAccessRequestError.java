package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AssetAccessRequestError   {

    private Integer code;
    private List<String> messages = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AssetAccessRequestError() {
    // JSON-B / Jackson
    }

    /**
     * Create AssetAccessRequestError.
     *
     * @param code Error code associated with the error in requesting asset access.
     * @param messages messages
     */
    public AssetAccessRequestError(
        Integer code, 
        List<String> messages
    ) {
        this.code = code;
        this.messages = messages;
    }



    /**
     * Error code associated with the error in requesting asset access.
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Get messages
     * @return messages
     */
    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetAccessRequestError {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

