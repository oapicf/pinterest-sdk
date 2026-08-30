package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleUpdateRequestAllOf1   {
  @JsonProperty("entity_id")
  private String entityId;

  @JsonProperty("entity_type")
  private String entityType;

  @JsonProperty("id")
  private String id;

  /**
   **/
  public ScheduleUpdateRequestAllOf1 entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("entity_id")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  /**
   * Entity type
   **/
  public ScheduleUpdateRequestAllOf1 entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  
  @ApiModelProperty(value = "Entity type")
  @JsonProperty("entity_type")
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  /**
   * Schedule ID.
   **/
  public ScheduleUpdateRequestAllOf1 id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Schedule ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
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
    return Objects.equals(entityId, scheduleUpdateRequestAllOf1.entityId) &&
        Objects.equals(entityType, scheduleUpdateRequestAllOf1.entityType) &&
        Objects.equals(id, scheduleUpdateRequestAllOf1.id);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

