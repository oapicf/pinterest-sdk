package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChangeHistoryOperationType;
import org.openapitools.model.EntityDataChangeHistory;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class EntityHistory   {
  
  private Integer changeTimestamp;

  private List<@Valid EntityDataChangeHistory> dataChanges = new ArrayList<>();

  private String entityId;

  private String entityName;

  private String ldap;

  private ChangeHistoryOperationType operation;

  private String userId;

  /**
   * A Unix timestamp representing the time of the change in seconds
   **/
  public EntityHistory changeTimestamp(Integer changeTimestamp) {
    this.changeTimestamp = changeTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "A Unix timestamp representing the time of the change in seconds")
  @JsonProperty("change_timestamp")
  public Integer getChangeTimestamp() {
    return changeTimestamp;
  }
  public void setChangeTimestamp(Integer changeTimestamp) {
    this.changeTimestamp = changeTimestamp;
  }


  /**
   * Properties associated with a particular change to an entity&#39;s data
   **/
  public EntityHistory dataChanges(List<@Valid EntityDataChangeHistory> dataChanges) {
    this.dataChanges = dataChanges;
    return this;
  }

  
  @ApiModelProperty(value = "Properties associated with a particular change to an entity's data")
  @JsonProperty("data_changes")
  public List<@Valid EntityDataChangeHistory> getDataChanges() {
    return dataChanges;
  }
  public void setDataChanges(List<@Valid EntityDataChangeHistory> dataChanges) {
    this.dataChanges = dataChanges;
  }

  public EntityHistory addDataChangesItem(EntityDataChangeHistory dataChangesItem) {
    if (this.dataChanges == null) {
      this.dataChanges = new ArrayList<>();
    }
    this.dataChanges.add(dataChangesItem);
    return this;
  }


  /**
   * The id of the entity that was changed
   **/
  public EntityHistory entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  
  @ApiModelProperty(value = "The id of the entity that was changed")
  @JsonProperty("entity_id")
 @Pattern(regexp="^\\d+$")  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  /**
   * The name of the entity that was changed
   **/
  public EntityHistory entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the entity that was changed")
  @JsonProperty("entity_name")
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  /**
   * The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
   **/
  public EntityHistory ldap(String ldap) {
    this.ldap = ldap;
    return this;
  }

  
  @ApiModelProperty(value = "The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users")
  @JsonProperty("ldap")
  public String getLdap() {
    return ldap;
  }
  public void setLdap(String ldap) {
    this.ldap = ldap;
  }


  /**
   * The type of operation that caused the change
   **/
  public EntityHistory operation(ChangeHistoryOperationType operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(value = "The type of operation that caused the change")
  @JsonProperty("operation")
  public ChangeHistoryOperationType getOperation() {
    return operation;
  }
  public void setOperation(ChangeHistoryOperationType operation) {
    this.operation = operation;
  }


  /**
   * The id of the user who initiated the change
   **/
  public EntityHistory userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "The id of the user who initiated the change")
  @JsonProperty("user_id")
 @Pattern(regexp="^\\d+$")  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

