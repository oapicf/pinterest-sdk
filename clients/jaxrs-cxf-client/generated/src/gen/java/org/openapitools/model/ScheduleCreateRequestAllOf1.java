package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ScheduleCreateRequestAllOf1  {
  
  @ApiModelProperty(required = true, value = "")

  private String entityId;

 /**
  * Entity type
  */
  @ApiModelProperty(required = true, value = "Entity type")

  private String entityType;
 /**
   * Get entityId
   * @return entityId
  **/
  @JsonProperty("entity_id")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public ScheduleCreateRequestAllOf1 entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

 /**
   * Entity type
   * @return entityType
  **/
  @JsonProperty("entity_type")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public ScheduleCreateRequestAllOf1 entityType(String entityType) {
    this.entityType = entityType;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

