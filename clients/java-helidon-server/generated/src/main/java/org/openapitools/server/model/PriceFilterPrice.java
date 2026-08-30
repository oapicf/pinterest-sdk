package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.NonNullableCatalogsCurrency;
import org.openapitools.server.model.NumericFilterOperatorType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PriceFilterPrice   {

    private NonNullableCatalogsCurrency currency;
    private Boolean negated;
    private NumericFilterOperatorType operator;
    private BigDecimal value;

    /**
     * Default constructor.
     */
    public PriceFilterPrice() {
    // JSON-B / Jackson
    }

    /**
     * Create PriceFilterPrice.
     *
     * @param currency currency
     * @param negated negated
     * @param operator operator
     * @param value value
     */
    public PriceFilterPrice(
        NonNullableCatalogsCurrency currency, 
        Boolean negated, 
        NumericFilterOperatorType operator, 
        BigDecimal value
    ) {
        this.currency = currency;
        this.negated = negated;
        this.operator = operator;
        this.value = value;
    }



    /**
     * Get currency
     * @return currency
     */
    public NonNullableCatalogsCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(NonNullableCatalogsCurrency currency) {
        this.currency = currency;
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
     * @return value
     */
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceFilterPrice {\n");
        
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

