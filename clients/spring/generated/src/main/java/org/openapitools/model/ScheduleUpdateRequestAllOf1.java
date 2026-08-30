package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ScheduleUpdateRequestAllOf1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleUpdateRequestAllOf1 {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String entityId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String entityType;

  private String id;

  public ScheduleUpdateRequestAllOf1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ScheduleUpdateRequestAllOf1(String id) {
    this.id = id;
  }

  public ScheduleUpdateRequestAllOf1 entityId(@Nullable String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @Pattern(regexp = "^[C]?\\d+$") 
  @Schema(name = "entity_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity_id")
  public @Nullable String getEntityId() {
    return entityId;
  }

  @JsonProperty("entity_id")
  public void setEntityId(@Nullable String entityId) {
    this.entityId = entityId;
  }

  public ScheduleUpdateRequestAllOf1 entityType(@Nullable String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Entity type
   * @return entityType
   */
  
  @Schema(name = "entity_type", description = "Entity type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity_type")
  public @Nullable String getEntityType() {
    return entityType;
  }

  @JsonProperty("entity_type")
  public void setEntityType(@Nullable String entityType) {
    this.entityType = entityType;
  }

  public ScheduleUpdateRequestAllOf1 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Schedule ID.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Schedule ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleUpdateRequestAllOf1 scheduleUpdateRequestAllOf1 = (ScheduleUpdateRequestAllOf1) o;
    return Objects.equals(this.entityId, scheduleUpdateRequestAllOf1.entityId) &&
        Objects.equals(this.entityType, scheduleUpdateRequestAllOf1.entityType) &&
        Objects.equals(this.id, scheduleUpdateRequestAllOf1.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleUpdateRequestAllOf1 {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

