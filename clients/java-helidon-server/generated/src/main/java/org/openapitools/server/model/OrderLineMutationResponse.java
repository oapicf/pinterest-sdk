package org.openapitools.server.model;

import org.openapitools.server.model.OrderLineMutationResult;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrderLineMutationResponse   {

    private OrderLineMutationResult data;

    /**
     * Default constructor.
     */
    public OrderLineMutationResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderLineMutationResponse.
     *
     * @param data data
     */
    public OrderLineMutationResponse(
        OrderLineMutationResult data
    ) {
        this.data = data;
    }



    /**
     * Get data
     * @return data
     */
    public OrderLineMutationResult getData() {
        return data;
    }

    public void setData(OrderLineMutationResult data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderLineMutationResponse {\n");
        
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

