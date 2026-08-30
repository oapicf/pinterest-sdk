package org.openapitools.server.model;

import org.openapitools.server.model.BulkUpsertRequestCreate;
import org.openapitools.server.model.BulkUpsertRequestUpdate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 */
public class BulkUpsertRequest   {

    private BulkUpsertRequestCreate create;
    private BulkUpsertRequestUpdate update;

    /**
     * Default constructor.
     */
    public BulkUpsertRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create BulkUpsertRequest.
     *
     * @param create create
     * @param update update
     */
    public BulkUpsertRequest(
        BulkUpsertRequestCreate create, 
        BulkUpsertRequestUpdate update
    ) {
        this.create = create;
        this.update = update;
    }



    /**
     * Get create
     * @return create
     */
    public BulkUpsertRequestCreate getCreate() {
        return create;
    }

    public void setCreate(BulkUpsertRequestCreate create) {
        this.create = create;
    }

    /**
     * Get update
     * @return update
     */
    public BulkUpsertRequestUpdate getUpdate() {
        return update;
    }

    public void setUpdate(BulkUpsertRequestUpdate update) {
        this.update = update;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkUpsertRequest {\n");
        
        sb.append("    create: ").append(toIndentedString(create)).append("\n");
        sb.append("    update: ").append(toIndentedString(update)).append("\n");
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

