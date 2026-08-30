package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.EntityLabel;
import org.openapitools.vertxweb.server.model.EntityLabelError;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LabeledEntities   {
  
  private List<EntityLabel> entitiesLabels = new ArrayList<>();
  private List<EntityLabelError> errors = new ArrayList<>();

  public LabeledEntities () {

  }

  public LabeledEntities (List<EntityLabel> entitiesLabels, List<EntityLabelError> errors) {
    this.entitiesLabels = entitiesLabels;
    this.errors = errors;
  }

    
  @JsonProperty("entities_labels")
  public List<EntityLabel> getEntitiesLabels() {
    return entitiesLabels;
  }
  public void setEntitiesLabels(List<EntityLabel> entitiesLabels) {
    this.entitiesLabels = entitiesLabels;
  }

    
  @JsonProperty("errors")
  public List<EntityLabelError> getErrors() {
    return errors;
  }
  public void setErrors(List<EntityLabelError> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabeledEntities labeledEntities = (LabeledEntities) o;
    return Objects.equals(entitiesLabels, labeledEntities.entitiesLabels) &&
        Objects.equals(errors, labeledEntities.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitiesLabels, errors);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
