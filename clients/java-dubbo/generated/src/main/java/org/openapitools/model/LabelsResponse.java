package org.openapitools.model;

import org.openapitools.model.Label;
import org.openapitools.model.LabelError;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class LabelsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Labels that were not successfully applied.
   */
  @JsonProperty("errors")
  private List<LabelError> errors = new ArrayList<>();

  @JsonProperty("labels")
  private List<Label> labels = new ArrayList<>();

  /**
   * Labels that were not successfully applied.
   * @return errors
   */
  public List<LabelError> getErrors() {
    return errors;
  }

  public void setErrors(List<LabelError> errors) {
    this.errors = errors;
  }

  /**
   * 
   * @return labels
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
