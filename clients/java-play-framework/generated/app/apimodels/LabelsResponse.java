package apimodels;

import apimodels.Label;
import apimodels.LabelError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LabelsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LabelsResponse   {
  @JsonProperty("errors")
  @Valid

  private List<@Valid LabelError> errors = null;

  @JsonProperty("labels")
  @Valid

  private List<@Valid Label> labels = null;

  public LabelsResponse errors(List<@Valid LabelError> errors) {
    this.errors = errors;
    return this;
  }

  public LabelsResponse addErrorsItem(LabelError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Labels that were not successfully applied.
   * @return errors
  **/
  public List<@Valid LabelError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid LabelError> errors) {
    this.errors = errors;
  }

  public LabelsResponse labels(List<@Valid Label> labels) {
    this.labels = labels;
    return this;
  }

  public LabelsResponse addLabelsItem(Label labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
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
    return Objects.equals(errors, labelsResponse.errors) &&
        Objects.equals(labels, labelsResponse.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, labels);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

