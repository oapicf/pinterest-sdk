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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelCreateRequest   {
  @JsonProperty("labels")
  private List<LabelCreateItem> labels = new ArrayList<>();

  /**
   * Labels that you are applying to the campaign.
   **/
  public LabelCreateRequest labels(List<LabelCreateItem> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Labels that you are applying to the campaign.")
  @JsonProperty("labels")
  public List<LabelCreateItem> getLabels() {
    return labels;
  }
  public void setLabels(List<LabelCreateItem> labels) {
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
    return Objects.equals(labels, labelCreateRequest.labels);
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

