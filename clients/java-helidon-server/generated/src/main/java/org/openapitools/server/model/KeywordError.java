package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.Keyword;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class KeywordError   {

    private Keyword data;
    private List<String> errorMessages = new ArrayList<>();

    /**
     * Default constructor.
     */
    public KeywordError() {
    // JSON-B / Jackson
    }

    /**
     * Create KeywordError.
     *
     * @param data data
     * @param errorMessages errorMessages
     */
    public KeywordError(
        Keyword data, 
        List<String> errorMessages
    ) {
        this.data = data;
        this.errorMessages = errorMessages;
    }



    /**
     * Get data
     * @return data
     */
    public Keyword getData() {
        return data;
    }

    public void setData(Keyword data) {
        this.data = data;
    }

    /**
     * Get errorMessages
     * @return errorMessages
     */
    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordError {\n");
        
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
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

