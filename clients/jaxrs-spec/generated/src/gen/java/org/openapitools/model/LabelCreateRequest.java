package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelCreateRequestLabelsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LabelCreateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LabelCreateRequest   {
  private @Valid List<@Valid LabelCreateRequestLabelsInner> labels = new ArrayList<>();
  private String parentId;

  public LabelCreateRequest() {
  }

  @JsonCreator
  public LabelCreateRequest(
    @JsonProperty(required = true, value = "labels") List<@Valid LabelCreateRequestLabelsInner> labels,
    @JsonProperty(required = true, value = "parent_id") String parentId
  ) {
    this.labels = labels;
    this.parentId = parentId;
  }

  /**
   * Labels that you are applying to the campaign.
   **/
  public LabelCreateRequest labels(List<@Valid LabelCreateRequestLabelsInner> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Labels that you are applying to the campaign.")
  @JsonProperty(required = true, value = "labels")
  @NotNull @Valid public List<@Valid LabelCreateRequestLabelsInner> getLabels() {
    return labels;
  }

  @JsonProperty(required = true, value = "labels")
  public void setLabels(List<@Valid LabelCreateRequestLabelsInner> labels) {
    this.labels = labels;
  }

  public LabelCreateRequest addLabelsItem(LabelCreateRequestLabelsInner labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }

    this.labels.add(labelsItem);
    return this;
  }

  public LabelCreateRequest removeLabelsItem(LabelCreateRequestLabelsInner labelsItem) {
    if (labelsItem != null && this.labels != null) {
      this.labels.remove(labelsItem);
    }

    return this;
  }
  /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   **/
  public LabelCreateRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(example = "626753052072", required = true, value = "Unique identifier of the asset you are labelling. Currently, you can only label campaigns.")
  @JsonProperty(required = true, value = "parent_id")
  @NotNull  @Pattern(regexp="^[C]?\\d+$")public String getParentId() {
    return parentId;
  }

  @JsonProperty(required = true, value = "parent_id")
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

