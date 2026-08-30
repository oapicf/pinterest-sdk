package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelCreateItem;
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
  private List<@Valid LabelCreateItem> labels = new ArrayList<>();
 /**
  * Labels that you are applying to the campaign.
  * @return labels
  */
  @JsonProperty("labels")
  @NotNull
  public List<@Valid LabelCreateItem> getLabels() {
    return labels;
  }

  /**
   * Sets the <code>labels</code> property.
   */
 public void setLabels(List<@Valid LabelCreateItem> labels) {
    this.labels = labels;
  }

  /**
   * Sets the <code>labels</code> property.
   */
  public LabelCreateRequest labels(List<@Valid LabelCreateItem> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Adds a new item to the <code>labels</code> list.
   */
  public LabelCreateRequest addLabelsItem(LabelCreateItem labelsItem) {
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
    LabelCreateRequest labelCreateRequest = (LabelCreateRequest) o;
    return Objects.equals(this.labels, labelCreateRequest.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelCreateRequest {\n");
    
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

