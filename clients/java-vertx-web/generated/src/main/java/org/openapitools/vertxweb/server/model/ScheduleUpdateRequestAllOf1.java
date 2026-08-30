package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScheduleUpdateRequestAllOf1   {
  
  private String entityId;
  private String entityType;
  private String id;

  public ScheduleUpdateRequestAllOf1 () {

  }

  public ScheduleUpdateRequestAllOf1 (String entityId, String entityType, String id) {
    this.entityId = entityId;
    this.entityType = entityType;
    this.id = id;
  }

    
  @JsonProperty("entity_id")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

    
  @JsonProperty("entity_type")
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

    
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
