package apimodels;

import apimodels.ChangeHistoryOperationType;
import apimodels.EntityDataChangeHistory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EntityHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EntityHistory   {
  @JsonProperty("change_timestamp")
  
  private Integer changeTimestamp;

  @JsonProperty("data_changes")
  @Valid

  private List<@Valid EntityDataChangeHistory> dataChanges = null;

  @JsonProperty("entity_id")
  @Pattern(regexp="^\\d+$")

  private String entityId;

  @JsonProperty("entity_name")
  
  private String entityName;

  @JsonProperty("ldap")
  
  private String ldap;

  @JsonProperty("operation")
  @Valid

  private ChangeHistoryOperationType operation;

  @JsonProperty("user_id")
  @Pattern(regexp="^\\d+$")

  private String userId;

  public EntityHistory changeTimestamp(Integer changeTimestamp) {
    this.changeTimestamp = changeTimestamp;
    return this;
  }

   /**
   * A Unix timestamp representing the time of the change in seconds
   * @return changeTimestamp
  **/
  public Integer getChangeTimestamp() {
    return changeTimestamp;
  }

  public void setChangeTimestamp(Integer changeTimestamp) {
    this.changeTimestamp = changeTimestamp;
  }

  public EntityHistory dataChanges(List<@Valid EntityDataChangeHistory> dataChanges) {
    this.dataChanges = dataChanges;
    return this;
  }

  public EntityHistory addDataChangesItem(EntityDataChangeHistory dataChangesItem) {
    if (this.dataChanges == null) {
      this.dataChanges = new ArrayList<>();
    }
    this.dataChanges.add(dataChangesItem);
    return this;
  }

   /**
   * Properties associated with a particular change to an entity's data
   * @return dataChanges
  **/
  public List<@Valid EntityDataChangeHistory> getDataChanges() {
    return dataChanges;
  }

  public void setDataChanges(List<@Valid EntityDataChangeHistory> dataChanges) {
    this.dataChanges = dataChanges;
  }

  public EntityHistory entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * The id of the entity that was changed
   * @return entityId
  **/
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public EntityHistory entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

   /**
   * The name of the entity that was changed
   * @return entityName
  **/
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public EntityHistory ldap(String ldap) {
    this.ldap = ldap;
    return this;
  }

   /**
   * The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
   * @return ldap
  **/
  public String getLdap() {
    return ldap;
  }

  public void setLdap(String ldap) {
    this.ldap = ldap;
  }

  public EntityHistory operation(ChangeHistoryOperationType operation) {
    this.operation = operation;
    return this;
  }

   /**
   * The type of operation that caused the change
   * @return operation
  **/
  public ChangeHistoryOperationType getOperation() {
    return operation;
  }

  public void setOperation(ChangeHistoryOperationType operation) {
    this.operation = operation;
  }

  public EntityHistory userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user who initiated the change
   * @return userId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

