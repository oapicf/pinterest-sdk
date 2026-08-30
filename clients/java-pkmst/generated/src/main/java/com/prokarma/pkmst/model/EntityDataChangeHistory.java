package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ChangeHistoryDataType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * EntityDataChangeHistory
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EntityDataChangeHistory   {
  @JsonProperty("changed_field_id")
  private String changedFieldId;

  @JsonProperty("changed_field_name")
  private String changedFieldName;

  @JsonProperty("data_type")
  private ChangeHistoryDataType dataType;

  @JsonProperty("new_data_value")
  private String newDataValue;

  @JsonProperty("old_data_value")
  private String oldDataValue;

  public EntityDataChangeHistory changedFieldId(String changedFieldId) {
    this.changedFieldId = changedFieldId;
    return this;
  }

  /**
   * A string identifier representing the changed field on the entity
   * @return changedFieldId
   */
  @ApiModelProperty(value = "A string identifier representing the changed field on the entity")
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
  @ApiModelProperty(value = "The human readable name of the changed field on the entity")
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
  @ApiModelProperty(value = "Specifies the type of the field's data values")
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
  @ApiModelProperty(value = "A string representation of the value of the changed field, after the change")
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
  @ApiModelProperty(value = "A string representation of the value of the changed field, before the change")
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

