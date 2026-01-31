package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelCreateRequestLabelsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LabelCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LabelCreateRequest {

  @Valid
  private List<@Valid LabelCreateRequestLabelsInner> labels = new ArrayList<>();

  private String parentId;

  public LabelCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LabelCreateRequest(List<@Valid LabelCreateRequestLabelsInner> labels, String parentId) {
    this.labels = labels;
    this.parentId = parentId;
  }

  public LabelCreateRequest labels(List<@Valid LabelCreateRequestLabelsInner> labels) {
    this.labels = labels;
    return this;
  }

  public LabelCreateRequest addLabelsItem(LabelCreateRequestLabelsInner labelsItem) {
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
  public List<@Valid LabelCreateRequestLabelsInner> getLabels() {
    return labels;
  }

  public void setLabels(List<@Valid LabelCreateRequestLabelsInner> labels) {
    this.labels = labels;
  }

  public LabelCreateRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   * @return parentId
   */
  @NotNull @Pattern(regexp = "^[C]?\\d+$") 
  @Schema(name = "parent_id", example = "626753052072", description = "Unique identifier of the asset you are labelling. Currently, you can only label campaigns.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    LabelCreateRequest labelCreateRequest = (LabelCreateRequest) o;
    return Objects.equals(this.labels, labelCreateRequest.labels) &&
        Objects.equals(this.parentId, labelCreateRequest.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelCreateRequest {\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

