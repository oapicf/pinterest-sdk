package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.DeliveryMetricsResponseItemsItems;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DeliveryMetricsGet200Response   {

    private List<@Valid DeliveryMetricsResponseItemsItems> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public DeliveryMetricsGet200Response() {
    // JSON-B / Jackson
    }

    /**
     * Create DeliveryMetricsGet200Response.
     *
     * @param items items
     */
    public DeliveryMetricsGet200Response(
        List<@Valid DeliveryMetricsResponseItemsItems> items
    ) {
        this.items = items;
    }



    /**
     * Get items
     * @return items
     */
    public List<@Valid DeliveryMetricsResponseItemsItems> getItems() {
        return items;
    }

    public void setItems(List<@Valid DeliveryMetricsResponseItemsItems> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliveryMetricsGet200Response {\n");
        
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

