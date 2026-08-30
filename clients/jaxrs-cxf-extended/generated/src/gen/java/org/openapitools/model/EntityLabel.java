package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EntityLabelStatus;
import org.openapitools.model.LabelParentType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EntityLabel  {
  
 /**
  * Entity ID to apply label to.
  */
  @ApiModelProperty(required = true, value = "Entity ID to apply label to.")
  private String entityId;

  @ApiModelProperty(value = "")
  @Valid
  private LabelParentType entityType;

 /**
  * Label ID.
  */
  @ApiModelProperty(required = true, value = "Label ID.")
  private String labelId;

  @ApiModelProperty(value = "")
  @Valid
  private EntityLabelStatus status;
 /**
  * Entity ID to apply label to.
  * @return entityId
  */
  @JsonProperty("entity_id")
  @NotNull
  public String getEntityId() {
    return entityId;
  }

  /**
   * Sets the <code>entityId</code> property.
   */
 public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  /**
   * Sets the <code>entityId</code> property.
   */
  public EntityLabel entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

 /**
  * Get entityType
  * @return entityType
  */
  @JsonProperty("entity_type")
  public LabelParentType getEntityType() {
    return entityType;
  }

  /**
   * Sets the <code>entityType</code> property.
   */
 public void setEntityType(LabelParentType entityType) {
    this.entityType = entityType;
  }

  /**
   * Sets the <code>entityType</code> property.
   */
  public EntityLabel entityType(LabelParentType entityType) {
    this.entityType = entityType;
    return this;
  }

 /**
  * Label ID.
  * @return labelId
  */
  @JsonProperty("label_id")
  @NotNull
  public String getLabelId() {
    return labelId;
  }

  /**
   * Sets the <code>labelId</code> property.
   */
 public void setLabelId(String labelId) {
    this.labelId = labelId;
  }

  /**
   * Sets the <code>labelId</code> property.
   */
  public EntityLabel labelId(String labelId) {
    this.labelId = labelId;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public EntityLabelStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(EntityLabelStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public EntityLabel status(EntityLabelStatus status) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

