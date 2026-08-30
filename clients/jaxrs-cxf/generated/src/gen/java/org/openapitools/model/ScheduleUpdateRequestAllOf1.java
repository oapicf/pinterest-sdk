package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ScheduleUpdateRequestAllOf1  {
  
  @ApiModelProperty(value = "")

  private String entityId;

 /**
  * Entity type
  */
  @ApiModelProperty(value = "Entity type")

  private String entityType;

 /**
  * Schedule ID.
  */
  @ApiModelProperty(required = true, value = "Schedule ID.")

  private String id;
 /**
   * Get entityId
   * @return entityId
  **/
  @JsonProperty("entity_id")
 @Pattern(regexp="^[C]?\\d+$")  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public ScheduleUpdateRequestAllOf1 entityId(String entityId) {
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

  public ScheduleUpdateRequestAllOf1 entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

 /**
   * Schedule ID.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ScheduleUpdateRequestAllOf1 id(String id) {
    this.id = id;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

