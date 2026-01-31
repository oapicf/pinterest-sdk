package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelCreateRequestLabelsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LabelCreateRequest  {
  
 /**
  * Labels that you are applying to the campaign.
  */
  @ApiModelProperty(required = true, value = "Labels that you are applying to the campaign.")
  @Valid
  private List<@Valid LabelCreateRequestLabelsInner> labels = new ArrayList<>();

 /**
  * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
  */
  @ApiModelProperty(example = "626753052072", required = true, value = "Unique identifier of the asset you are labelling. Currently, you can only label campaigns.")
  private String parentId;
 /**
  * Labels that you are applying to the campaign.
  * @return labels
  */
  @JsonProperty("labels")
  @NotNull
  public List<@Valid LabelCreateRequestLabelsInner> getLabels() {
    return labels;
  }

  /**
   * Sets the <code>labels</code> property.
   */
 public void setLabels(List<@Valid LabelCreateRequestLabelsInner> labels) {
    this.labels = labels;
  }

  /**
   * Sets the <code>labels</code> property.
   */
  public LabelCreateRequest labels(List<@Valid LabelCreateRequestLabelsInner> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Adds a new item to the <code>labels</code> list.
   */
  public LabelCreateRequest addLabelsItem(LabelCreateRequestLabelsInner labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

 /**
  * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
  * @return parentId
  */
  @JsonProperty("parent_id")
  @NotNull
 @Pattern(regexp="^[C]?\\d+$")  public String getParentId() {
    return parentId;
  }

  /**
   * Sets the <code>parentId</code> property.
   */
 public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * Sets the <code>parentId</code> property.
   */
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

