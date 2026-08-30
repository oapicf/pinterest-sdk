package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.EntityLabel;
import org.openapitools.server.model.EntityLabelError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LabeledEntities   {

    private List<@Valid EntityLabel> entitiesLabels = new ArrayList<>();
    private List<@Valid EntityLabelError> errors = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LabeledEntities() {
    // JSON-B / Jackson
    }

    /**
     * Create LabeledEntities.
     *
     * @param entitiesLabels entitiesLabels
     * @param errors Labels that were not successfully applied.
     */
    public LabeledEntities(
        List<@Valid EntityLabel> entitiesLabels, 
        List<@Valid EntityLabelError> errors
    ) {
        this.entitiesLabels = entitiesLabels;
        this.errors = errors;
    }



    /**
     * Get entitiesLabels
     * @return entitiesLabels
     */
    public List<@Valid EntityLabel> getEntitiesLabels() {
        return entitiesLabels;
    }

    public void setEntitiesLabels(List<@Valid EntityLabel> entitiesLabels) {
        this.entitiesLabels = entitiesLabels;
    }

    /**
     * Labels that were not successfully applied.
     * @return errors
     */
    public List<@Valid EntityLabelError> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid EntityLabelError> errors) {
        this.errors = errors;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabeledEntities {\n");
        
        sb.append("    entitiesLabels: ").append(toIndentedString(entitiesLabels)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

