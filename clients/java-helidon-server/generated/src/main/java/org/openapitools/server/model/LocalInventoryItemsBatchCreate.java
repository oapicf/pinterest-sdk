package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.LocalInventoryOperation;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class LocalInventoryItemsBatchCreate   {

    private List<@Valid LocalInventoryOperation> operations = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LocalInventoryItemsBatchCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create LocalInventoryItemsBatchCreate.
     *
     * @param operations Array of inventory operations. Up to 1000 items per request.
     */
    public LocalInventoryItemsBatchCreate(
        List<@Valid LocalInventoryOperation> operations
    ) {
        this.operations = operations;
    }



    /**
     * Array of inventory operations. Up to 1000 items per request.
     * @return operations
     */
    public List<@Valid LocalInventoryOperation> getOperations() {
        return operations;
    }

    public void setOperations(List<@Valid LocalInventoryOperation> operations) {
        this.operations = operations;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalInventoryItemsBatchCreate {\n");
        
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

