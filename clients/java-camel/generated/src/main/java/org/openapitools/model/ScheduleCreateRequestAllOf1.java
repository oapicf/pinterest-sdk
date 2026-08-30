package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ScheduleCreateRequestAllOf1
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleCreateRequestAllOf1 {

  private String entityId;

  private String entityType;

  public ScheduleCreateRequestAllOf1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ScheduleCreateRequestAllOf1(String entityId, String entityType) {
    this.entityId = entityId;
    this.entityType = entityType;
  }

  public ScheduleCreateRequestAllOf1 entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @NotNull @Pattern(regexp = "^[C]?\\d+$") 
  @Schema(name = "entity_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entity_id")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public ScheduleCreateRequestAllOf1 entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Entity type
   * @return entityType
   */
  @NotNull 
  @Schema(name = "entity_type", description = "Entity type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entity_type")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleCreateRequestAllOf1 scheduleCreateRequestAllOf1 = (ScheduleCreateRequestAllOf1) o;
    return Objects.equals(this.entityId, scheduleCreateRequestAllOf1.entityId) &&
        Objects.equals(this.entityType, scheduleCreateRequestAllOf1.entityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleCreateRequestAllOf1 {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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

