package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ScheduleUpdateRequestAllOf1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleUpdateRequestAllOf1   {
  private String entityId;
  private String entityType;
  private String id;

  public ScheduleUpdateRequestAllOf1() {
  }

  @JsonCreator
  public ScheduleUpdateRequestAllOf1(
    @JsonProperty(required = true, value = "id") String id
  ) {
    this.id = id;
  }

  /**
   **/
  public ScheduleUpdateRequestAllOf1 entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("entity_id")
   @Pattern(regexp="^[C]?\\d+$")public String getEntityId() {
    return entityId;
  }

  @JsonProperty("entity_id")
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

  @JsonProperty("entity_type")
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
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
