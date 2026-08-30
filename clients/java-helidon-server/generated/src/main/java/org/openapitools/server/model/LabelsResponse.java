package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.Label;
import org.openapitools.server.model.LabelError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LabelsResponse   {

    private List<@Valid LabelError> errors = new ArrayList<>();
    private List<@Valid Label> labels = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LabelsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create LabelsResponse.
     *
     * @param errors Labels that were not successfully applied.
     * @param labels labels
     */
    public LabelsResponse(
        List<@Valid LabelError> errors, 
        List<@Valid Label> labels
    ) {
        this.errors = errors;
        this.labels = labels;
    }



    /**
     * Labels that were not successfully applied.
     * @return errors
     */
    public List<@Valid LabelError> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid LabelError> errors) {
        this.errors = errors;
    }

    /**
     * Get labels
     * @return labels
     */
    public List<@Valid Label> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid Label> labels) {
        this.labels = labels;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelsResponse {\n");
        
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

