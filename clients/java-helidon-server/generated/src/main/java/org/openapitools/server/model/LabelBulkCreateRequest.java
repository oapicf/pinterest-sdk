package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.LabelCreateItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LabelBulkCreateRequest   {

    private List<@Valid LabelCreateItem> labels = new ArrayList<>();
    private String parentId;

    /**
     * Default constructor.
     */
    public LabelBulkCreateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create LabelBulkCreateRequest.
     *
     * @param labels Labels that you are applying to the campaign.
     * @param parentId Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
     */
    public LabelBulkCreateRequest(
        List<@Valid LabelCreateItem> labels, 
        String parentId
    ) {
        this.labels = labels;
        this.parentId = parentId;
    }



    /**
     * Labels that you are applying to the campaign.
     * @return labels
     */
    public List<@Valid LabelCreateItem> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid LabelCreateItem> labels) {
        this.labels = labels;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelBulkCreateRequest {\n");
        
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

