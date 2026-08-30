package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChangeHistoryOperationType;
import org.openapitools.model.EntityDataChangeHistory;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EntityHistory
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EntityHistory {

  private Integer changeTimestamp;

  @Valid
  private List<@Valid EntityDataChangeHistory> dataChanges = new ArrayList<>();

  private String entityId;

  private String entityName;

  private String ldap;

  private ChangeHistoryOperationType operation;

  private String userId;

  public EntityHistory changeTimestamp(Integer changeTimestamp) {
    this.changeTimestamp = changeTimestamp;
    return this;
  }

  /**
   * A Unix timestamp representing the time of the change in seconds
   * @return changeTimestamp
   */
  
  @Schema(name = "change_timestamp", description = "A Unix timestamp representing the time of the change in seconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("change_timestamp")
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
   */
  @Valid 
  @Schema(name = "data_changes", description = "Properties associated with a particular change to an entity's data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data_changes")
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
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "entity_id", description = "The id of the entity that was changed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity_id")
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
   */
  
  @Schema(name = "entity_name", description = "The name of the entity that was changed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity_name")
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
   */
  
  @Schema(name = "ldap", description = "The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ldap")
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
   */
  @Valid 
  @Schema(name = "operation", description = "The type of operation that caused the change", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operation")
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
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "user_id", description = "The id of the user who initiated the change", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

