package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelCreateItem;

/**
 * LabelCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelCreateRequest   {
  @JsonProperty("labels")
  private List<@Valid LabelCreateItem> labels = new ArrayList<>();

  public LabelCreateRequest labels(List<@Valid LabelCreateItem> labels) {
    this.labels = labels;
    return this;
  }

  public LabelCreateRequest addLabelsItem(LabelCreateItem labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Labels that you are applying to the campaign.
   * @return labels
  **/
  @ApiModelProperty(required = true, value = "Labels that you are applying to the campaign.")
  public List<@Valid LabelCreateItem> getLabels() {
    return labels;
  }

  public void setLabels(List<@Valid LabelCreateItem> labels) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

