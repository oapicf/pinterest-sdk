package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ChangeHistoryDataType;
import org.springframework.lang.Nullable;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EntityDataChangeHistory {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String changedFieldId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String changedFieldName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ChangeHistoryDataType dataType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String newDataValue;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String oldDataValue;

  public EntityDataChangeHistory changedFieldId(@Nullable String changedFieldId) {
    this.changedFieldId = changedFieldId;
    return this;
  }

  /**
   * A string identifier representing the changed field on the entity
   * @return changedFieldId
   */
  
  @Schema(name = "changed_field_id", description = "A string identifier representing the changed field on the entity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changed_field_id")
  public @Nullable String getChangedFieldId() {
    return changedFieldId;
  }

  @JsonProperty("changed_field_id")
  public void setChangedFieldId(@Nullable String changedFieldId) {
    this.changedFieldId = changedFieldId;
  }

  public EntityDataChangeHistory changedFieldName(@Nullable String changedFieldName) {
    this.changedFieldName = changedFieldName;
    return this;
  }

  /**
   * The human readable name of the changed field on the entity
   * @return changedFieldName
   */
  
  @Schema(name = "changed_field_name", description = "The human readable name of the changed field on the entity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changed_field_name")
  public @Nullable String getChangedFieldName() {
    return changedFieldName;
  }

  @JsonProperty("changed_field_name")
  public void setChangedFieldName(@Nullable String changedFieldName) {
    this.changedFieldName = changedFieldName;
  }

  public EntityDataChangeHistory dataType(@Nullable ChangeHistoryDataType dataType) {
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
  public @Nullable ChangeHistoryDataType getDataType() {
    return dataType;
  }

  @JsonProperty("data_type")
  public void setDataType(@Nullable ChangeHistoryDataType dataType) {
    this.dataType = dataType;
  }

  public EntityDataChangeHistory newDataValue(@Nullable String newDataValue) {
    this.newDataValue = newDataValue;
    return this;
  }

  /**
   * A string representation of the value of the changed field, after the change
   * @return newDataValue
   */
  
  @Schema(name = "new_data_value", description = "A string representation of the value of the changed field, after the change", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_data_value")
  public @Nullable String getNewDataValue() {
    return newDataValue;
  }

  @JsonProperty("new_data_value")
  public void setNewDataValue(@Nullable String newDataValue) {
    this.newDataValue = newDataValue;
  }

  public EntityDataChangeHistory oldDataValue(@Nullable String oldDataValue) {
    this.oldDataValue = oldDataValue;
    return this;
  }

  /**
   * A string representation of the value of the changed field, before the change
   * @return oldDataValue
   */
  
  @Schema(name = "old_data_value", description = "A string representation of the value of the changed field, before the change", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_data_value")
  public @Nullable String getOldDataValue() {
    return oldDataValue;
  }

  @JsonProperty("old_data_value")
  public void setOldDataValue(@Nullable String oldDataValue) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

