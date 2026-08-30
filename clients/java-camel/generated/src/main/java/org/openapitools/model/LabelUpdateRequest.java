package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelUpdateItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LabelUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelUpdateRequest {

  @Valid
  private List<@Valid LabelUpdateItem> labels = new ArrayList<>();

  public LabelUpdateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LabelUpdateRequest(List<@Valid LabelUpdateItem> labels) {
    this.labels = labels;
  }

  public LabelUpdateRequest labels(List<@Valid LabelUpdateItem> labels) {
    this.labels = labels;
    return this;
  }

  public LabelUpdateRequest addLabelsItem(LabelUpdateItem labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Labels that you are applying to the campaign.
   * @return labels
   */
  @NotNull @Valid 
  @Schema(name = "labels", description = "Labels that you are applying to the campaign.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("labels")
  public List<@Valid LabelUpdateItem> getLabels() {
    return labels;
  }

  public void setLabels(List<@Valid LabelUpdateItem> labels) {
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
    LabelUpdateRequest labelUpdateRequest = (LabelUpdateRequest) o;
    return Objects.equals(this.labels, labelUpdateRequest.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelUpdateRequest {\n");
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

