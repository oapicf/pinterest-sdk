package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.LabelStatusBulkUpdate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LabelBulkUpdateRequest   {

    private String id;
    private String parentId;
    private LabelStatusBulkUpdate status;

    /**
     * Default constructor.
     */
    public LabelBulkUpdateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create LabelBulkUpdateRequest.
     *
     * @param id Label ID.
     * @param parentId Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
     * @param status status
     */
    public LabelBulkUpdateRequest(
        String id, 
        String parentId, 
        LabelStatusBulkUpdate status
    ) {
        this.id = id;
        this.parentId = parentId;
        this.status = status;
    }



    /**
     * Label ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * Get status
     * @return status
     */
    public LabelStatusBulkUpdate getStatus() {
        return status;
    }

    public void setStatus(LabelStatusBulkUpdate status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelBulkUpdateRequest {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

