package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.Label;
import org.openapitools.vertxweb.server.model.LabelError;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LabelsResponse   {
  
  private List<LabelError> errors = new ArrayList<>();
  private List<Label> labels = new ArrayList<>();

  public LabelsResponse () {

  }

  public LabelsResponse (List<LabelError> errors, List<Label> labels) {
    this.errors = errors;
    this.labels = labels;
  }

    
  @JsonProperty("errors")
  public List<LabelError> getErrors() {
    return errors;
  }
  public void setErrors(List<LabelError> errors) {
    this.errors = errors;
  }

    
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
