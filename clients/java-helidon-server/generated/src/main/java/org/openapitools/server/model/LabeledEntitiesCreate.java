package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class LabeledEntitiesCreate   {

    private List<String> entityIds = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LabeledEntitiesCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create LabeledEntitiesCreate.
     *
     * @param entityIds Entity IDs to apply label to.
     */
    public LabeledEntitiesCreate(
        List<String> entityIds
    ) {
        this.entityIds = entityIds;
    }



    /**
     * Entity IDs to apply label to.
     * @return entityIds
     */
    public List<String> getEntityIds() {
        return entityIds;
    }

    public void setEntityIds(List<String> entityIds) {
        this.entityIds = entityIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabeledEntitiesCreate {\n");
        
        sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
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

