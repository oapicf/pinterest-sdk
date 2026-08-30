package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EntityLabel;
import org.openapitools.model.EntityLabelError;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class LabeledEntities   {
  
  private List<@Valid EntityLabel> entitiesLabels = new ArrayList<>();

  private List<@Valid EntityLabelError> errors = new ArrayList<>();

  /**
   **/
  public LabeledEntities entitiesLabels(List<@Valid EntityLabel> entitiesLabels) {
    this.entitiesLabels = entitiesLabels;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("entities_labels")
  public List<@Valid EntityLabel> getEntitiesLabels() {
    return entitiesLabels;
  }
  public void setEntitiesLabels(List<@Valid EntityLabel> entitiesLabels) {
    this.entitiesLabels = entitiesLabels;
  }

  public LabeledEntities addEntitiesLabelsItem(EntityLabel entitiesLabelsItem) {
    if (this.entitiesLabels == null) {
      this.entitiesLabels = new ArrayList<>();
    }
    this.entitiesLabels.add(entitiesLabelsItem);
    return this;
  }


  /**
   * Labels that were not successfully applied.
   **/
  public LabeledEntities errors(List<@Valid EntityLabelError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Labels that were not successfully applied.")
  @JsonProperty("errors")
  public List<@Valid EntityLabelError> getErrors() {
    return errors;
  }
  public void setErrors(List<@Valid EntityLabelError> errors) {
    this.errors = errors;
  }

  public LabeledEntities addErrorsItem(EntityLabelError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
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

