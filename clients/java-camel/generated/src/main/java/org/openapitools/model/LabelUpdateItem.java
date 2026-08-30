package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.LabelStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LabelUpdateItem
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelUpdateItem {

  private String id;

  private LabelStatus status;

  private String value;

  public LabelUpdateItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LabelUpdateItem(String id) {
    this.id = id;
  }

  public LabelUpdateItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Label ID.
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "1106385754497", description = "Label ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LabelUpdateItem status(LabelStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public LabelStatus getStatus() {
    return status;
  }

  public void setStatus(LabelStatus status) {
    this.status = status;
  }

  public LabelUpdateItem value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Label name. 100-character limit.
   * @return value
   */
  @Size(max = 100) 
  @Schema(name = "value", description = "Label name. 100-character limit.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelUpdateItem labelUpdateItem = (LabelUpdateItem) o;
    return Objects.equals(this.id, labelUpdateItem.id) &&
        Objects.equals(this.status, labelUpdateItem.status) &&
        Objects.equals(this.value, labelUpdateItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelUpdateItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

