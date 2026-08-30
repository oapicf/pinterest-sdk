package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.EntityLabel;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EntityLabelError   {

    private EntityLabel data;
    private List<String> errorMessages = new ArrayList<>();

    /**
     * Default constructor.
     */
    public EntityLabelError() {
    // JSON-B / Jackson
    }

    /**
     * Create EntityLabelError.
     *
     * @param data data
     * @param errorMessages errorMessages
     */
    public EntityLabelError(
        EntityLabel data, 
        List<String> errorMessages
    ) {
        this.data = data;
        this.errorMessages = errorMessages;
    }



    /**
     * Get data
     * @return data
     */
    public EntityLabel getData() {
        return data;
    }

    public void setData(EntityLabel data) {
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
        sb.append("class EntityLabelError {\n");
        
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

