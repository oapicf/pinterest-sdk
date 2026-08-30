package org.openapitools.model;

import org.openapitools.model.EntityLabel;
import org.openapitools.model.EntityLabelError;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class LabeledEntities implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("entities_labels")
  private List<EntityLabel> entitiesLabels = new ArrayList<>();

  /**
   * Labels that were not successfully applied.
   */
  @JsonProperty("errors")
  private List<EntityLabelError> errors = new ArrayList<>();

  /**
   * 
   * @return entitiesLabels
   */
  public List<EntityLabel> getEntitiesLabels() {
    return entitiesLabels;
  }

  public void setEntitiesLabels(List<EntityLabel> entitiesLabels) {
    this.entitiesLabels = entitiesLabels;
  }

  /**
   * Labels that were not successfully applied.
   * @return errors
   */
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
    return Objects.equals(this.entitiesLabels, labeledEntities.entitiesLabels) &&
        Objects.equals(this.errors, labeledEntities.errors);
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
