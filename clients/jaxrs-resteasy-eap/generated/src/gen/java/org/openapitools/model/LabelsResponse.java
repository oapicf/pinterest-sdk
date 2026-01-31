package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Label;
import org.openapitools.model.LabelError;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-31T04:55:11.834541491Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LabelsResponse   {
  
  private List<@Valid LabelError> errors = new ArrayList<>();
  private List<@Valid Label> labels = new ArrayList<>();

  /**
   * Labels that were not successfully applied.
   **/
  
  @ApiModelProperty(value = "Labels that were not successfully applied.")
  @JsonProperty("errors")
  public List<@Valid LabelError> getErrors() {
    return errors;
  }
  public void setErrors(List<@Valid LabelError> errors) {
    this.errors = errors;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("labels")
  public List<@Valid Label> getLabels() {
    return labels;
  }
  public void setLabels(List<@Valid Label> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelsResponse labelsResponse = (LabelsResponse) o;
    return Objects.equals(this.errors, labelsResponse.errors) &&
        Objects.equals(this.labels, labelsResponse.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, labels);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

