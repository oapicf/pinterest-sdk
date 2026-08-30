/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Label;
import org.openapitools.model.LabelError;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelsResponse   {
  
  private List<LabelError> errors = new ArrayList<>();
  private List<Label> labels = new ArrayList<>();

  /**
   * Labels that were not successfully applied.
   */
  public LabelsResponse errors(List<LabelError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Labels that were not successfully applied.")
  @JsonProperty("errors")
  public List<LabelError> getErrors() {
    return errors;
  }
  public void setErrors(List<LabelError> errors) {
    this.errors = errors;
  }

  /**
   */
  public LabelsResponse labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("labels")
  public List<Label> getLabels() {
    return labels;
  }
  public void setLabels(List<Label> labels) {
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
    return Objects.equals(errors, labelsResponse.errors) &&
        Objects.equals(labels, labelsResponse.labels);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

