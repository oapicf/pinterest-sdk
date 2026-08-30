package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Label;
import org.openapitools.model.LabelError;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LabelsResponse  {
  
 /**
  * Labels that were not successfully applied.
  */
  @ApiModelProperty(value = "Labels that were not successfully applied.")

  private List<LabelError> errors = new ArrayList<>();

  @ApiModelProperty(value = "")

  private List<Label> labels = new ArrayList<>();
 /**
   * Labels that were not successfully applied.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<LabelError> getErrors() {
    return errors;
  }

  public void setErrors(List<LabelError> errors) {
    this.errors = errors;
  }

  public LabelsResponse errors(List<LabelError> errors) {
    this.errors = errors;
    return this;
  }

  public LabelsResponse addErrorsItem(LabelError errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * Get labels
   * @return labels
  **/
  @JsonProperty("labels")
  public List<Label> getLabels() {
    return labels;
  }

  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }

  public LabelsResponse labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  public LabelsResponse addLabelsItem(Label labelsItem) {
    this.labels.add(labelsItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

