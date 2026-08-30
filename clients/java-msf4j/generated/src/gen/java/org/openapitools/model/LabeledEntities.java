package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EntityLabel;
import org.openapitools.model.EntityLabelError;

/**
 * LabeledEntities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabeledEntities   {
  @JsonProperty("entities_labels")
  private List<@Valid EntityLabel> entitiesLabels = null;

  @JsonProperty("errors")
  private List<@Valid EntityLabelError> errors = null;

   /**
   * Get entitiesLabels
   * @return entitiesLabels
  **/
  @ApiModelProperty(value = "")
  public List<@Valid EntityLabel> getEntitiesLabels() {
    return entitiesLabels;
  }

   /**
   * Labels that were not successfully applied.
   * @return errors
  **/
  @ApiModelProperty(value = "Labels that were not successfully applied.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

