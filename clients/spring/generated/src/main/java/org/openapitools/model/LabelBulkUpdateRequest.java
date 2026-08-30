package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.LabelStatusBulkUpdate;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LabelBulkUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelBulkUpdateRequest {

  private String id;

  private String parentId;

  private LabelStatusBulkUpdate status;

  public LabelBulkUpdateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LabelBulkUpdateRequest(String id, String parentId, LabelStatusBulkUpdate status) {
    this.id = id;
    this.parentId = parentId;
    this.status = status;
  }

  public LabelBulkUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Label ID.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Label ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public LabelBulkUpdateRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   * @return parentId
   */
  @NotNull 
  @Schema(name = "parent_id", description = "Unique identifier of the asset you are labelling. Currently, you can only label campaigns.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }

  @JsonProperty("parent_id")
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public LabelBulkUpdateRequest status(LabelStatusBulkUpdate status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public LabelStatusBulkUpdate getStatus() {
    return status;
  }

  @JsonProperty("status")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

