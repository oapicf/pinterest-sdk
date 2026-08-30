package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.NullableLabelStatus;
import org.openapitools.server.model.NullableLabelType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LabelErrorData   {

    private String id;
    private NullableLabelType labelType;
    private NullableLabelStatus status;
    private String value;

    /**
     * Default constructor.
     */
    public LabelErrorData() {
    // JSON-B / Jackson
    }

    /**
     * Create LabelErrorData.
     *
     * @param id Label ID.
     * @param labelType labelType
     * @param status status
     * @param value Label name. 100-character limit.
     */
    public LabelErrorData(
        String id, 
        NullableLabelType labelType, 
        NullableLabelStatus status, 
        String value
    ) {
        this.id = id;
        this.labelType = labelType;
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
     * Get labelType
     * @return labelType
     */
    public NullableLabelType getLabelType() {
        return labelType;
    }

    public void setLabelType(NullableLabelType labelType) {
        this.labelType = labelType;
    }

    /**
     * Get status
     * @return status
     */
    public NullableLabelStatus getStatus() {
        return status;
    }

    public void setStatus(NullableLabelStatus status) {
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
        sb.append("class LabelErrorData {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
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

