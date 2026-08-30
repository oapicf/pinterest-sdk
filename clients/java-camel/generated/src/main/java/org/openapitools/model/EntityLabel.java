package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EntityLabelStatus;
import org.openapitools.model.LabelParentType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EntityLabel
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EntityLabel {

  private String entityId;

  private JsonNullable<LabelParentType> entityType = JsonNullable.<LabelParentType>undefined();

  private String labelId;

  private JsonNullable<EntityLabelStatus> status = JsonNullable.<EntityLabelStatus>undefined();

  public EntityLabel() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EntityLabel(String entityId, String labelId) {
    this.entityId = entityId;
    this.labelId = labelId;
  }

  public EntityLabel entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Entity ID to apply label to.
   * @return entityId
   */
  @NotNull 
  @Schema(name = "entity_id", description = "Entity ID to apply label to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entity_id")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public EntityLabel entityType(LabelParentType entityType) {
    this.entityType = JsonNullable.of(entityType);
    return this;
  }

  /**
   * Get entityType
   * @return entityType
   */
  @Valid 
  @Schema(name = "entity_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity_type")
  public JsonNullable<LabelParentType> getEntityType() {
    return entityType;
  }

  public void setEntityType(JsonNullable<LabelParentType> entityType) {
    this.entityType = entityType;
  }

  public EntityLabel labelId(String labelId) {
    this.labelId = labelId;
    return this;
  }

  /**
   * Label ID.
   * @return labelId
   */
  @NotNull 
  @Schema(name = "label_id", description = "Label ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("label_id")
  public String getLabelId() {
    return labelId;
  }

  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }

  public EntityLabel status(EntityLabelStatus status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public JsonNullable<EntityLabelStatus> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<EntityLabelStatus> status) {
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
    EntityLabel entityLabel = (EntityLabel) o;
    return Objects.equals(this.entityId, entityLabel.entityId) &&
        equalsNullable(this.entityType, entityLabel.entityType) &&
        Objects.equals(this.labelId, entityLabel.labelId) &&
        equalsNullable(this.status, entityLabel.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, hashCodeNullable(entityType), labelId, hashCodeNullable(status));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityLabel {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
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

