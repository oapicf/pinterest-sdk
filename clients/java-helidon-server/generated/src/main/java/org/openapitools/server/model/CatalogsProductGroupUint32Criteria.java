package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.NumericFilterOperatorType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsProductGroupUint32Criteria   {

    private Boolean negated;
    private NumericFilterOperatorType operator;
    private Integer value;

    /**
     * Default constructor.
     */
    public CatalogsProductGroupUint32Criteria() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsProductGroupUint32Criteria.
     *
     * @param negated negated
     * @param operator operator
     * @param value value
     */
    public CatalogsProductGroupUint32Criteria(
        Boolean negated, 
        NumericFilterOperatorType operator, 
        Integer value
    ) {
        this.negated = negated;
        this.operator = operator;
        this.value = value;
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
     * Get operator
     * @return operator
     */
    public NumericFilterOperatorType getOperator() {
        return operator;
    }

    public void setOperator(NumericFilterOperatorType operator) {
        this.operator = operator;
    }

    /**
     * Get value
     * minimum: 0
     * maximum: 4294967295
     * @return value
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsProductGroupUint32Criteria {\n");
        
        sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

