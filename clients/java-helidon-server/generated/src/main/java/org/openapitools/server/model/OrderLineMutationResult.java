package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OrderLine;
import org.openapitools.server.model.OrderLineMutationError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrderLineMutationResult   {

    private List<@Valid OrderLineMutationError> errors = new ArrayList<>();
    private List<@Valid OrderLine> orderLine = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OrderLineMutationResult() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderLineMutationResult.
     *
     * @param errors Error list if update(s) fail.
     * @param orderLine Order Line object array.
     */
    public OrderLineMutationResult(
        List<@Valid OrderLineMutationError> errors, 
        List<@Valid OrderLine> orderLine
    ) {
        this.errors = errors;
        this.orderLine = orderLine;
    }



    /**
     * Error list if update(s) fail.
     * @return errors
     */
    public List<@Valid OrderLineMutationError> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid OrderLineMutationError> errors) {
        this.errors = errors;
    }

    /**
     * Order Line object array.
     * @return orderLine
     */
    public List<@Valid OrderLine> getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(List<@Valid OrderLine> orderLine) {
        this.orderLine = orderLine;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderLineMutationResult {\n");
        
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    orderLine: ").append(toIndentedString(orderLine)).append("\n");
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

