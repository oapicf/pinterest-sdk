package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.EntityLabelStatus;
import com.prokarma.pkmst.model.LabelParentType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * EntityLabel
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EntityLabel   {
  @JsonProperty("entity_id")
  private String entityId;

  @JsonProperty("entity_type")
  private LabelParentType entityType;

  @JsonProperty("label_id")
  private String labelId;

  @JsonProperty("status")
  private EntityLabelStatus status;

  public EntityLabel entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Entity ID to apply label to.
   * @return entityId
   */
  @ApiModelProperty(required = true, value = "Entity ID to apply label to.")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public EntityLabel entityType(LabelParentType entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
   */
  @ApiModelProperty(value = "")
  public LabelParentType getEntityType() {
    return entityType;
  }

  public void setEntityType(LabelParentType entityType) {
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
  @ApiModelProperty(required = true, value = "Label ID.")
  public String getLabelId() {
    return labelId;
  }

  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }

  public EntityLabel status(EntityLabelStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public EntityLabelStatus getStatus() {
    return status;
  }

  public void setStatus(EntityLabelStatus status) {
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
        Objects.equals(this.entityType, entityLabel.entityType) &&
        Objects.equals(this.labelId, entityLabel.labelId) &&
        Objects.equals(this.status, entityLabel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, labelId, status);
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

