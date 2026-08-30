package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LabelStatusBulkUpdate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LabelBulkUpdateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelBulkUpdateRequest   {
  private String id;
  private String parentId;
  private LabelStatusBulkUpdate status;

  public LabelBulkUpdateRequest() {
  }

  @JsonCreator
  public LabelBulkUpdateRequest(
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "parent_id") String parentId,
    @JsonProperty(required = true, value = "status") LabelStatusBulkUpdate status
  ) {
    this.id = id;
    this.parentId = parentId;
    this.status = status;
  }

  /**
   * Label ID.
   **/
  public LabelBulkUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Label ID.")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   **/
  public LabelBulkUpdateRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of the asset you are labelling. Currently, you can only label campaigns.")
  @JsonProperty(required = true, value = "parent_id")
  @NotNull public String getParentId() {
    return parentId;
  }

  @JsonProperty(required = true, value = "parent_id")
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   **/
  public LabelBulkUpdateRequest status(LabelStatusBulkUpdate status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "status")
  @NotNull public LabelStatusBulkUpdate getStatus() {
    return status;
  }

  @JsonProperty(required = true, value = "status")
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
