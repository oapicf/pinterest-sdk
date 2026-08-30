package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AdBatchItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdBatchWriteResponseModel   {

    private List<@Valid AdBatchItem> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AdBatchWriteResponseModel() {
    // JSON-B / Jackson
    }

    /**
     * Create AdBatchWriteResponseModel.
     *
     * @param items items
     */
    public AdBatchWriteResponseModel(
        List<@Valid AdBatchItem> items
    ) {
        this.items = items;
    }



    /**
     * Get items
     * @return items
     */
    public List<@Valid AdBatchItem> getItems() {
        return items;
    }

    public void setItems(List<@Valid AdBatchItem> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdBatchWriteResponseModel {\n");
        
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

