package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.NullableCatalogsItemFieldType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsItemValidationDetails   {

    private NullableCatalogsItemFieldType attributeName;
    private String providedValue;

    /**
     * Default constructor.
     */
    public CatalogsItemValidationDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsItemValidationDetails.
     *
     * @param attributeName Attribute that has a validation issue.
     * @param providedValue Provided value that caused the validation issue.
     */
    public CatalogsItemValidationDetails(
        NullableCatalogsItemFieldType attributeName, 
        String providedValue
    ) {
        this.attributeName = attributeName;
        this.providedValue = providedValue;
    }



    /**
     * Attribute that has a validation issue.
     * @return attributeName
     */
    public NullableCatalogsItemFieldType getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(NullableCatalogsItemFieldType attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * Provided value that caused the validation issue.
     * @return providedValue
     */
    public String getProvidedValue() {
        return providedValue;
    }

    public void setProvidedValue(String providedValue) {
        this.providedValue = providedValue;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsItemValidationDetails {\n");
        
        sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
        sb.append("    providedValue: ").append(toIndentedString(providedValue)).append("\n");
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

