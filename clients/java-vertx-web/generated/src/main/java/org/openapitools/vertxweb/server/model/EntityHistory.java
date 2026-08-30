package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ChangeHistoryOperationType;
import org.openapitools.vertxweb.server.model.EntityDataChangeHistory;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityHistory   {
  
  private Integer changeTimestamp;
  private List<EntityDataChangeHistory> dataChanges = new ArrayList<>();
  private String entityId;
  private String entityName;
  private String ldap;
  private ChangeHistoryOperationType operation;
  private String userId;

  public EntityHistory () {

  }

  public EntityHistory (Integer changeTimestamp, List<EntityDataChangeHistory> dataChanges, String entityId, String entityName, String ldap, ChangeHistoryOperationType operation, String userId) {
    this.changeTimestamp = changeTimestamp;
    this.dataChanges = dataChanges;
    this.entityId = entityId;
    this.entityName = entityName;
    this.ldap = ldap;
    this.operation = operation;
    this.userId = userId;
  }

    
  @JsonProperty("change_timestamp")
  public Integer getChangeTimestamp() {
    return changeTimestamp;
  }
  public void setChangeTimestamp(Integer changeTimestamp) {
    this.changeTimestamp = changeTimestamp;
  }

    
  @JsonProperty("data_changes")
  public List<EntityDataChangeHistory> getDataChanges() {
    return dataChanges;
  }
  public void setDataChanges(List<EntityDataChangeHistory> dataChanges) {
    this.dataChanges = dataChanges;
  }

    
  @JsonProperty("entity_id")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

    
  @JsonProperty("entity_name")
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

    
  @JsonProperty("ldap")
  public String getLdap() {
    return ldap;
  }
  public void setLdap(String ldap) {
    this.ldap = ldap;
  }

    
  @JsonProperty("operation")
  public ChangeHistoryOperationType getOperation() {
    return operation;
  }
  public void setOperation(ChangeHistoryOperationType operation) {
    this.operation = operation;
  }

    
  @JsonProperty("user_id")
  public String getUserId() {
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
    return Objects.equals(changeTimestamp, entityHistory.changeTimestamp) &&
        Objects.equals(dataChanges, entityHistory.dataChanges) &&
        Objects.equals(entityId, entityHistory.entityId) &&
        Objects.equals(entityName, entityHistory.entityName) &&
        Objects.equals(ldap, entityHistory.ldap) &&
        Objects.equals(operation, entityHistory.operation) &&
        Objects.equals(userId, entityHistory.userId);
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
