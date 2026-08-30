package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelCreateItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LabelBulkCreateRequest  {
  
 /**
  * Labels that you are applying to the campaign.
  */
  @ApiModelProperty(required = true, value = "Labels that you are applying to the campaign.")

  @Valid

  private List<@Valid LabelCreateItem> labels = new ArrayList<>();

 /**
  * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
  */
  @ApiModelProperty(required = true, value = "Unique identifier of the asset you are labelling. Currently, you can only label campaigns.")

  private String parentId;
 /**
   * Labels that you are applying to the campaign.
   * @return labels
  **/
  @JsonProperty("labels")
  @NotNull
  public List<@Valid LabelCreateItem> getLabels() {
    return labels;
  }

  public void setLabels(List<@Valid LabelCreateItem> labels) {
    this.labels = labels;
  }

  public LabelBulkCreateRequest labels(List<@Valid LabelCreateItem> labels) {
    this.labels = labels;
    return this;
  }

  public LabelBulkCreateRequest addLabelsItem(LabelCreateItem labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

 /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   * @return parentId
  **/
  @JsonProperty("parent_id")
  @NotNull
 @Pattern(regexp="^[C]?\\d+$")  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public LabelBulkCreateRequest parentId(String parentId) {
    this.parentId = parentId;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

