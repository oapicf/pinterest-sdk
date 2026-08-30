package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.EntityLabel;
import com.prokarma.pkmst.model.EntityLabelError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * LabeledEntities
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabeledEntities   {
  @JsonProperty("entities_labels")
  
  private List<EntityLabel> entitiesLabels = null;

  @JsonProperty("errors")
  
  private List<EntityLabelError> errors = null;

  public LabeledEntities entitiesLabels(List<EntityLabel> entitiesLabels) {
    this.entitiesLabels = entitiesLabels;
    return this;
  }

  public LabeledEntities addEntitiesLabelsItem(EntityLabel entitiesLabelsItem) {
    if (this.entitiesLabels == null) {
      this.entitiesLabels = new ArrayList<>();
    }
    this.entitiesLabels.add(entitiesLabelsItem);
    return this;
  }

  /**
   * Get entitiesLabels
   * @return entitiesLabels
   */
  @ApiModelProperty(readOnly = true, value = "")
  public List<EntityLabel> getEntitiesLabels() {
    return entitiesLabels;
  }

  public void setEntitiesLabels(List<EntityLabel> entitiesLabels) {
    this.entitiesLabels = entitiesLabels;
  }

  public LabeledEntities errors(List<EntityLabelError> errors) {
    this.errors = errors;
    return this;
  }

  public LabeledEntities addErrorsItem(EntityLabelError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Labels that were not successfully applied.
   * @return errors
   */
  @ApiModelProperty(readOnly = true, value = "Labels that were not successfully applied.")
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

