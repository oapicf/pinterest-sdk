package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelCreateRequestLabelsInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LabelCreateRequest  {
  
 /**
  * Labels that you are applying to the campaign.
  */
  @ApiModelProperty(required = true, value = "Labels that you are applying to the campaign.")

  private List<LabelCreateRequestLabelsInner> labels = new ArrayList<>();

 /**
  * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
  */
  @ApiModelProperty(example = "626753052072", required = true, value = "Unique identifier of the asset you are labelling. Currently, you can only label campaigns.")

  private String parentId;
 /**
   * Labels that you are applying to the campaign.
   * @return labels
  **/
  @JsonProperty("labels")
  public List<LabelCreateRequestLabelsInner> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelCreateRequestLabelsInner> labels) {
    this.labels = labels;
  }

  public LabelCreateRequest labels(List<LabelCreateRequestLabelsInner> labels) {
    this.labels = labels;
    return this;
  }

  public LabelCreateRequest addLabelsItem(LabelCreateRequestLabelsInner labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

 /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   * @return parentId
  **/
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public LabelCreateRequest parentId(String parentId) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

