package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.LabelCreateItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * LabelBulkCreateRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelBulkCreateRequest   {
  @JsonProperty("labels")
  
  private List<LabelCreateItem> labels = new ArrayList<>();

  @JsonProperty("parent_id")
  private String parentId;

  public LabelBulkCreateRequest labels(List<LabelCreateItem> labels) {
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
  @ApiModelProperty(required = true, value = "Labels that you are applying to the campaign.")
  public List<LabelCreateItem> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelCreateItem> labels) {
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
  @ApiModelProperty(required = true, value = "Unique identifier of the asset you are labelling. Currently, you can only label campaigns.")
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

