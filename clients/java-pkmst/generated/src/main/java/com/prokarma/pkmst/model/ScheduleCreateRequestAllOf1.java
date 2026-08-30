package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ScheduleCreateRequestAllOf1
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleCreateRequestAllOf1   {
  @JsonProperty("entity_id")
  private String entityId;

  @JsonProperty("entity_type")
  private String entityType;

  public ScheduleCreateRequestAllOf1 entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "Entity type")
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

