package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.LabelUpdateItem;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LabelUpdateRequest   {
  
  private List<LabelUpdateItem> labels = new ArrayList<>();

  public LabelUpdateRequest () {

  }

  public LabelUpdateRequest (List<LabelUpdateItem> labels) {
    this.labels = labels;
  }

    
  @JsonProperty("labels")
  public List<LabelUpdateItem> getLabels() {
    return labels;
  }
  public void setLabels(List<LabelUpdateItem> labels) {
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
    return Objects.equals(labels, labelUpdateRequest.labels);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
