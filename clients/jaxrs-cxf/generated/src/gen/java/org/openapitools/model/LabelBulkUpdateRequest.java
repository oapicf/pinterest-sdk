package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.LabelStatusBulkUpdate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LabelBulkUpdateRequest  {
  
 /**
  * Label ID.
  */
  @ApiModelProperty(required = true, value = "Label ID.")

  private String id;

 /**
  * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
  */
  @ApiModelProperty(required = true, value = "Unique identifier of the asset you are labelling. Currently, you can only label campaigns.")

  private String parentId;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private LabelStatusBulkUpdate status;
 /**
   * Label ID.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LabelBulkUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   * @return parentId
  **/
  @JsonProperty("parent_id")
  @NotNull
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public LabelBulkUpdateRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public LabelStatusBulkUpdate getStatus() {
    return status;
  }

  public void setStatus(LabelStatusBulkUpdate status) {
    this.status = status;
  }

  public LabelBulkUpdateRequest status(LabelStatusBulkUpdate status) {
    this.status = status;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

