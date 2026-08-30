package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EntityLabelStatus;
import org.openapitools.model.LabelParentType;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class EntityLabel   {
  
  private String entityId;

  private LabelParentType entityType;

  private String labelId;

  private EntityLabelStatus status;

  /**
   * Entity ID to apply label to.
   **/
  public EntityLabel entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Entity ID to apply label to.")
  @JsonProperty("entity_id")
  @NotNull
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  /**
   **/
  public EntityLabel entityType(LabelParentType entityType) {
    this.entityType = entityType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("entity_type")
  public LabelParentType getEntityType() {
    return entityType;
  }
  public void setEntityType(LabelParentType entityType) {
    this.entityType = entityType;
  }


  /**
   * Label ID.
   **/
  public EntityLabel labelId(String labelId) {
    this.labelId = labelId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Label ID.")
  @JsonProperty("label_id")
  @NotNull
  public String getLabelId() {
    return labelId;
  }
  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }


  /**
   **/
  public EntityLabel status(EntityLabelStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
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

