package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.LabelCreateItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LabelCreateRequest   {

    private List<@Valid LabelCreateItem> labels = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LabelCreateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create LabelCreateRequest.
     *
     * @param labels Labels that you are applying to the campaign.
     */
    public LabelCreateRequest(
        List<@Valid LabelCreateItem> labels
    ) {
        this.labels = labels;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelCreateRequest {\n");
        
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

