package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.LabelType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LabelCreateItem   {

    private LabelType labelType;
    private String value;

    /**
     * Default constructor.
     */
    public LabelCreateItem() {
    // JSON-B / Jackson
    }

    /**
     * Create LabelCreateItem.
     *
     * @param labelType labelType
     * @param value Label name. 100-character limit.
     */
    public LabelCreateItem(
        LabelType labelType, 
        String value
    ) {
        this.labelType = labelType;
        this.value = value;
    }



    /**
     * Get labelType
     * @return labelType
     */
    public LabelType getLabelType() {
        return labelType;
    }

    public void setLabelType(LabelType labelType) {
        this.labelType = labelType;
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
        sb.append("class LabelCreateItem {\n");
        
        sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
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

