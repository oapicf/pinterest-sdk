package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EntityLabel;
import org.openapitools.model.EntityLabelError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LabeledEntities  {
  
  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid EntityLabel> entitiesLabels = new ArrayList<>();

 /**
  * Labels that were not successfully applied.
  */
  @ApiModelProperty(value = "Labels that were not successfully applied.")

  @Valid

  private List<@Valid EntityLabelError> errors = new ArrayList<>();
 /**
   * Get entitiesLabels
   * @return entitiesLabels
  **/
  @JsonProperty("entities_labels")
  public List<@Valid EntityLabel> getEntitiesLabels() {
    return entitiesLabels;
  }


 /**
   * Labels that were not successfully applied.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<@Valid EntityLabelError> getErrors() {
    return errors;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

