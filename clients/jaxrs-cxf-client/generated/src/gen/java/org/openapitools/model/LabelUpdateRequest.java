package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelUpdateItem;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LabelUpdateRequest  {
  
 /**
  * Labels that you are applying to the campaign.
  */
  @ApiModelProperty(required = true, value = "Labels that you are applying to the campaign.")

  private List<LabelUpdateItem> labels = new ArrayList<>();
 /**
   * Labels that you are applying to the campaign.
   * @return labels
  **/
  @JsonProperty("labels")
  public List<LabelUpdateItem> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelUpdateItem> labels) {
    this.labels = labels;
  }

  public LabelUpdateRequest labels(List<LabelUpdateItem> labels) {
    this.labels = labels;
    return this;
  }

  public LabelUpdateRequest addLabelsItem(LabelUpdateItem labelsItem) {
    this.labels.add(labelsItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

