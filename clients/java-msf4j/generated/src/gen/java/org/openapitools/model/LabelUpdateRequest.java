package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelUpdateRequestLabelsInner;

/**
 * LabelUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-31T04:52:33.064583645Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LabelUpdateRequest   {
  @JsonProperty("labels")
  private List<@Valid LabelUpdateRequestLabelsInner> labels = new ArrayList<>();

  public LabelUpdateRequest labels(List<@Valid LabelUpdateRequestLabelsInner> labels) {
    this.labels = labels;
    return this;
  }

  public LabelUpdateRequest addLabelsItem(LabelUpdateRequestLabelsInner labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Labels that you are applying to the campaign.
   * @return labels
  **/
  @ApiModelProperty(required = true, value = "Labels that you are applying to the campaign.")
  public List<@Valid LabelUpdateRequestLabelsInner> getLabels() {
    return labels;
  }

  public void setLabels(List<@Valid LabelUpdateRequestLabelsInner> labels) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

