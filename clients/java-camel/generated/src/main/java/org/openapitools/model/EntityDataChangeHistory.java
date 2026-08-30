package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ChangeHistoryDataType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EntityDataChangeHistory
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EntityDataChangeHistory {

  private String changedFieldId;

  private String changedFieldName;

  private ChangeHistoryDataType dataType;

  private String newDataValue;

  private String oldDataValue;

  public EntityDataChangeHistory changedFieldId(String changedFieldId) {
    this.changedFieldId = changedFieldId;
    return this;
  }

  /**
   * A string identifier representing the changed field on the entity
   * @return changedFieldId
   */
  
  @Schema(name = "changed_field_id", description = "A string identifier representing the changed field on the entity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changed_field_id")
  public String getChangedFieldId() {
    return changedFieldId;
  }

  public void setChangedFieldId(String changedFieldId) {
    this.changedFieldId = changedFieldId;
  }

  public EntityDataChangeHistory changedFieldName(String changedFieldName) {
    this.changedFieldName = changedFieldName;
    return this;
  }

  /**
   * The human readable name of the changed field on the entity
   * @return changedFieldName
   */
  
  @Schema(name = "changed_field_name", description = "The human readable name of the changed field on the entity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changed_field_name")
  public String getChangedFieldName() {
    return changedFieldName;
  }

  public void setChangedFieldName(String changedFieldName) {
    this.changedFieldName = changedFieldName;
  }

  public EntityDataChangeHistory dataType(ChangeHistoryDataType dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Specifies the type of the field's data values
   * @return dataType
   */
  @Valid 
  @Schema(name = "data_type", description = "Specifies the type of the field's data values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data_type")
  public ChangeHistoryDataType getDataType() {
    return dataType;
  }

  public void setDataType(ChangeHistoryDataType dataType) {
    this.dataType = dataType;
  }

  public EntityDataChangeHistory newDataValue(String newDataValue) {
    this.newDataValue = newDataValue;
    return this;
  }

  /**
   * A string representation of the value of the changed field, after the change
   * @return newDataValue
   */
  
  @Schema(name = "new_data_value", description = "A string representation of the value of the changed field, after the change", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_data_value")
  public String getNewDataValue() {
    return newDataValue;
  }

  public void setNewDataValue(String newDataValue) {
    this.newDataValue = newDataValue;
  }

  public EntityDataChangeHistory oldDataValue(String oldDataValue) {
    this.oldDataValue = oldDataValue;
    return this;
  }

  /**
   * A string representation of the value of the changed field, before the change
   * @return oldDataValue
   */
  
  @Schema(name = "old_data_value", description = "A string representation of the value of the changed field, before the change", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_data_value")
  public String getOldDataValue() {
    return oldDataValue;
  }

  public void setOldDataValue(String oldDataValue) {
    this.oldDataValue = oldDataValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityDataChangeHistory entityDataChangeHistory = (EntityDataChangeHistory) o;
    return Objects.equals(this.changedFieldId, entityDataChangeHistory.changedFieldId) &&
        Objects.equals(this.changedFieldName, entityDataChangeHistory.changedFieldName) &&
        Objects.equals(this.dataType, entityDataChangeHistory.dataType) &&
        Objects.equals(this.newDataValue, entityDataChangeHistory.newDataValue) &&
        Objects.equals(this.oldDataValue, entityDataChangeHistory.oldDataValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedFieldId, changedFieldName, dataType, newDataValue, oldDataValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityDataChangeHistory {\n");
    sb.append("    changedFieldId: ").append(toIndentedString(changedFieldId)).append("\n");
    sb.append("    changedFieldName: ").append(toIndentedString(changedFieldName)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    newDataValue: ").append(toIndentedString(newDataValue)).append("\n");
    sb.append("    oldDataValue: ").append(toIndentedString(oldDataValue)).append("\n");
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

