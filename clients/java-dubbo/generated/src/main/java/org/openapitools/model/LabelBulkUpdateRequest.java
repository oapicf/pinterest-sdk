package org.openapitools.model;

import org.openapitools.model.LabelStatusBulkUpdate;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class LabelBulkUpdateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Label ID.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   */
  @JsonProperty("parent_id")
  private String parentId;

  @JsonProperty("status")
  private LabelStatusBulkUpdate status;

  /**
   * Label ID.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  /**
   * 
   * @return status
   */
  public LabelStatusBulkUpdate getStatus() {
    return status;
  }

  public void setStatus(LabelStatusBulkUpdate status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelBulkUpdateRequest labelBulkUpdateRequest = (LabelBulkUpdateRequest) o;
    return Objects.equals(this.id, labelBulkUpdateRequest.id) &&
        Objects.equals(this.parentId, labelBulkUpdateRequest.parentId) &&
        Objects.equals(this.status, labelBulkUpdateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelBulkUpdateRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
