package org.openapitools.model;

import org.openapitools.model.LabelCreateItem;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class LabelBulkCreateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Labels that you are applying to the campaign.
   */
  @JsonProperty("labels")
  private List<LabelCreateItem> labels = new ArrayList<>();

  /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   */
  @JsonProperty("parent_id")
  private String parentId;

  /**
   * Labels that you are applying to the campaign.
   * @return labels
   */
  public List<LabelCreateItem> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelCreateItem> labels) {
    this.labels = labels;
  }

  /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   * @return parentId
   */
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
