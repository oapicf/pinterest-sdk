package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.LabelStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LabelUpdateItem   {

    private String id;
    private LabelStatus status;
    private String value;

    /**
     * Default constructor.
     */
    public LabelUpdateItem() {
    // JSON-B / Jackson
    }

    /**
     * Create LabelUpdateItem.
     *
     * @param id Label ID.
     * @param status status
     * @param value Label name. 100-character limit.
     */
    public LabelUpdateItem(
        String id, 
        LabelStatus status, 
        String value
    ) {
        this.id = id;
        this.status = status;
        this.value = value;
    }



    /**
     * Label ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get status
     * @return status
     */
    public LabelStatus getStatus() {
        return status;
    }

    public void setStatus(LabelStatus status) {
        this.status = status;
    }

    /**
     * Label name. 100-character limit.
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelUpdateItem {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

