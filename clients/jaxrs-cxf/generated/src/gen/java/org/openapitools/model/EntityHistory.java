package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChangeHistoryOperationType;
import org.openapitools.model.EntityDataChangeHistory;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EntityHistory  {
  
 /**
  * A Unix timestamp representing the time of the change in seconds
  */
  @ApiModelProperty(value = "A Unix timestamp representing the time of the change in seconds")

  private Integer changeTimestamp;

 /**
  * Properties associated with a particular change to an entity's data
  */
  @ApiModelProperty(value = "Properties associated with a particular change to an entity's data")

  @Valid

  private List<@Valid EntityDataChangeHistory> dataChanges = new ArrayList<>();

 /**
  * The id of the entity that was changed
  */
  @ApiModelProperty(value = "The id of the entity that was changed")

  private String entityId;

 /**
  * The name of the entity that was changed
  */
  @ApiModelProperty(value = "The name of the entity that was changed")

  private String entityName;

 /**
  * The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
  */
  @ApiModelProperty(value = "The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users")

  private String ldap;

 /**
  * The type of operation that caused the change
  */
  @ApiModelProperty(value = "The type of operation that caused the change")

  @Valid

  private ChangeHistoryOperationType operation;

 /**
  * The id of the user who initiated the change
  */
  @ApiModelProperty(value = "The id of the user who initiated the change")

  private String userId;
 /**
   * A Unix timestamp representing the time of the change in seconds
   * @return changeTimestamp
  **/
  @JsonProperty("change_timestamp")
  public Integer getChangeTimestamp() {
    return changeTimestamp;
  }

  public void setChangeTimestamp(Integer changeTimestamp) {
    this.changeTimestamp = changeTimestamp;
  }

  public EntityHistory changeTimestamp(Integer changeTimestamp) {
    this.changeTimestamp = changeTimestamp;
    return this;
  }

 /**
   * Properties associated with a particular change to an entity&#39;s data
   * @return dataChanges
  **/
  @JsonProperty("data_changes")
  public List<@Valid EntityDataChangeHistory> getDataChanges() {
    return dataChanges;
  }

  public void setDataChanges(List<@Valid EntityDataChangeHistory> dataChanges) {
    this.dataChanges = dataChanges;
  }

  public EntityHistory dataChanges(List<@Valid EntityDataChangeHistory> dataChanges) {
    this.dataChanges = dataChanges;
    return this;
  }

  public EntityHistory addDataChangesItem(EntityDataChangeHistory dataChangesItem) {
    this.dataChanges.add(dataChangesItem);
    return this;
  }

 /**
   * The id of the entity that was changed
   * @return entityId
  **/
  @JsonProperty("entity_id")
 @Pattern(regexp="^\\d+$")  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public EntityHistory entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

 /**
   * The name of the entity that was changed
   * @return entityName
  **/
  @JsonProperty("entity_name")
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public EntityHistory entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

 /**
   * The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
   * @return ldap
  **/
  @JsonProperty("ldap")
  public String getLdap() {
    return ldap;
  }

  public void setLdap(String ldap) {
    this.ldap = ldap;
  }

  public EntityHistory ldap(String ldap) {
    this.ldap = ldap;
    return this;
  }

 /**
   * The type of operation that caused the change
   * @return operation
  **/
  @JsonProperty("operation")
  public ChangeHistoryOperationType getOperation() {
    return operation;
  }

  public void setOperation(ChangeHistoryOperationType operation) {
    this.operation = operation;
  }

  public EntityHistory operation(ChangeHistoryOperationType operation) {
    this.operation = operation;
    return this;
  }

 /**
   * The id of the user who initiated the change
   * @return userId
  **/
  @JsonProperty("user_id")
 @Pattern(regexp="^\\d+$")  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public EntityHistory userId(String userId) {
    this.userId = userId;
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
    EntityHistory entityHistory = (EntityHistory) o;
    return Objects.equals(this.changeTimestamp, entityHistory.changeTimestamp) &&
        Objects.equals(this.dataChanges, entityHistory.dataChanges) &&
        Objects.equals(this.entityId, entityHistory.entityId) &&
        Objects.equals(this.entityName, entityHistory.entityName) &&
        Objects.equals(this.ldap, entityHistory.ldap) &&
        Objects.equals(this.operation, entityHistory.operation) &&
        Objects.equals(this.userId, entityHistory.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeTimestamp, dataChanges, entityId, entityName, ldap, operation, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityHistory {\n");
    
    sb.append("    changeTimestamp: ").append(toIndentedString(changeTimestamp)).append("\n");
    sb.append("    dataChanges: ").append(toIndentedString(dataChanges)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    ldap: ").append(toIndentedString(ldap)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

