package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.NonNullableCatalogsCurrency;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A currency filter. This filter cannot be negated
 */
public class CatalogsProductGroupCurrencyCriteria   {

    private Boolean negated;
    private NonNullableCatalogsCurrency values;

    /**
     * Default constructor.
     */
    public CatalogsProductGroupCurrencyCriteria() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsProductGroupCurrencyCriteria.
     *
     * @param negated negated
     * @param values values
     */
    public CatalogsProductGroupCurrencyCriteria(
        Boolean negated, 
        NonNullableCatalogsCurrency values
    ) {
        this.negated = negated;
        this.values = values;
    }



    /**
     * Get negated
     * @return negated
     */
    public Boolean getNegated() {
        return negated;
    }

    public void setNegated(Boolean negated) {
        this.negated = negated;
    }

    /**
     * Get values
     * @return values
     */
    public NonNullableCatalogsCurrency getValues() {
        return values;
    }

    public void setValues(NonNullableCatalogsCurrency values) {
        this.values = values;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsProductGroupCurrencyCriteria {\n");
        
        sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

