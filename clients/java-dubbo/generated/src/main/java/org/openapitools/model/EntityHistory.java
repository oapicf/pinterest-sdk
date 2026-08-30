package org.openapitools.model;

import org.openapitools.model.ChangeHistoryOperationType;
import org.openapitools.model.EntityDataChangeHistory;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class EntityHistory implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A Unix timestamp representing the time of the change in seconds
   */
  @JsonProperty("change_timestamp")
  private Integer changeTimestamp;

  /**
   * Properties associated with a particular change to an entity&#39;s data
   */
  @JsonProperty("data_changes")
  private List<EntityDataChangeHistory> dataChanges = new ArrayList<>();

  /**
   * The id of the entity that was changed
   */
  @JsonProperty("entity_id")
  private String entityId;

  /**
   * The name of the entity that was changed
   */
  @JsonProperty("entity_name")
  private String entityName;

  /**
   * The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
   */
  @JsonProperty("ldap")
  private String ldap;

  /**
   * The type of operation that caused the change
   */
  @JsonProperty("operation")
  private ChangeHistoryOperationType operation;

  /**
   * The id of the user who initiated the change
   */
  @JsonProperty("user_id")
  private String userId;

  /**
   * A Unix timestamp representing the time of the change in seconds
   * @return changeTimestamp
   */
  public Integer getChangeTimestamp() {
    return changeTimestamp;
  }

  public void setChangeTimestamp(Integer changeTimestamp) {
    this.changeTimestamp = changeTimestamp;
  }

  /**
   * Properties associated with a particular change to an entity&#39;s data
   * @return dataChanges
   */
  public List<EntityDataChangeHistory> getDataChanges() {
    return dataChanges;
  }

  public void setDataChanges(List<EntityDataChangeHistory> dataChanges) {
    this.dataChanges = dataChanges;
  }

  /**
   * The id of the entity that was changed
   * @return entityId
   */
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  /**
   * The name of the entity that was changed
   * @return entityName
   */
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  /**
   * The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
   * @return ldap
   */
  public String getLdap() {
    return ldap;
  }

  public void setLdap(String ldap) {
    this.ldap = ldap;
  }

  /**
   * The type of operation that caused the change
   * @return operation
   */
  public ChangeHistoryOperationType getOperation() {
    return operation;
  }

  public void setOperation(ChangeHistoryOperationType operation) {
    this.operation = operation;
  }

  /**
   * The id of the user who initiated the change
   * @return userId
   */
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
