package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelCreateItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LabelBulkCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelBulkCreateRequest {

  @Valid
  private List<@Valid LabelCreateItem> labels = new ArrayList<>();

  private String parentId;

  public LabelBulkCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LabelBulkCreateRequest(List<@Valid LabelCreateItem> labels, String parentId) {
    this.labels = labels;
    this.parentId = parentId;
  }

  public LabelBulkCreateRequest labels(List<@Valid LabelCreateItem> labels) {
    this.labels = labels;
    return this;
  }

  public LabelBulkCreateRequest addLabelsItem(LabelCreateItem labelsItem) {
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
  public List<@Valid LabelCreateItem> getLabels() {
    return labels;
  }

  public void setLabels(List<@Valid LabelCreateItem> labels) {
    this.labels = labels;
  }

  public LabelBulkCreateRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   * @return parentId
   */
  @NotNull @Pattern(regexp = "^[C]?\\d+$") 
  @Schema(name = "parent_id", description = "Unique identifier of the asset you are labelling. Currently, you can only label campaigns.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelBulkCreateRequest labelBulkCreateRequest = (LabelBulkCreateRequest) o;
    return Objects.equals(this.labels, labelBulkCreateRequest.labels) &&
        Objects.equals(this.parentId, labelBulkCreateRequest.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelBulkCreateRequest {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

