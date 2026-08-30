package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OrderLine;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrderLineMutationError   {

    private OrderLine data;
    private List<String> errorMessages = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OrderLineMutationError() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderLineMutationError.
     *
     * @param data data
     * @param errorMessages Error messages.
     */
    public OrderLineMutationError(
        OrderLine data, 
        List<String> errorMessages
    ) {
        this.data = data;
        this.errorMessages = errorMessages;
    }



    /**
     * Get data
     * @return data
     */
    public OrderLine getData() {
        return data;
    }

    public void setData(OrderLine data) {
        this.data = data;
    }

    /**
     * Error messages.
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
        sb.append("class OrderLineMutationError {\n");
        
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

