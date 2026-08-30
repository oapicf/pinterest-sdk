package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Label;
import org.openapitools.model.LabelError;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LabelsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelsResponse {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid LabelError> errors = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid Label> labels = new ArrayList<>();

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
   */
  @Valid 
  @Schema(name = "errors", description = "Labels that were not successfully applied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid LabelError> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
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
   */
  @Valid 
  @Schema(name = "labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labels")
  public List<@Valid Label> getLabels() {
    return labels;
  }

  @JsonProperty("labels")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

