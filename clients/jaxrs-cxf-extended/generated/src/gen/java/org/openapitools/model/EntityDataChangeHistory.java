package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ChangeHistoryDataType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EntityDataChangeHistory  {
  
 /**
  * A string identifier representing the changed field on the entity
  */
  @ApiModelProperty(value = "A string identifier representing the changed field on the entity")
  private String changedFieldId;

 /**
  * The human readable name of the changed field on the entity
  */
  @ApiModelProperty(value = "The human readable name of the changed field on the entity")
  private String changedFieldName;

 /**
  * Specifies the type of the field's data values
  */
  @ApiModelProperty(value = "Specifies the type of the field's data values")
  @Valid
  private ChangeHistoryDataType dataType;

 /**
  * A string representation of the value of the changed field, after the change
  */
  @ApiModelProperty(value = "A string representation of the value of the changed field, after the change")
  private String newDataValue;

 /**
  * A string representation of the value of the changed field, before the change
  */
  @ApiModelProperty(value = "A string representation of the value of the changed field, before the change")
  private String oldDataValue;
 /**
  * A string identifier representing the changed field on the entity
  * @return changedFieldId
  */
  @JsonProperty("changed_field_id")
  public String getChangedFieldId() {
    return changedFieldId;
  }

  /**
   * Sets the <code>changedFieldId</code> property.
   */
 public void setChangedFieldId(String changedFieldId) {
    this.changedFieldId = changedFieldId;
  }

  /**
   * Sets the <code>changedFieldId</code> property.
   */
  public EntityDataChangeHistory changedFieldId(String changedFieldId) {
    this.changedFieldId = changedFieldId;
    return this;
  }

 /**
  * The human readable name of the changed field on the entity
  * @return changedFieldName
  */
  @JsonProperty("changed_field_name")
  public String getChangedFieldName() {
    return changedFieldName;
  }

  /**
   * Sets the <code>changedFieldName</code> property.
   */
 public void setChangedFieldName(String changedFieldName) {
    this.changedFieldName = changedFieldName;
  }

  /**
   * Sets the <code>changedFieldName</code> property.
   */
  public EntityDataChangeHistory changedFieldName(String changedFieldName) {
    this.changedFieldName = changedFieldName;
    return this;
  }

 /**
  * Specifies the type of the field&#39;s data values
  * @return dataType
  */
  @JsonProperty("data_type")
  public ChangeHistoryDataType getDataType() {
    return dataType;
  }

  /**
   * Sets the <code>dataType</code> property.
   */
 public void setDataType(ChangeHistoryDataType dataType) {
    this.dataType = dataType;
  }

  /**
   * Sets the <code>dataType</code> property.
   */
  public EntityDataChangeHistory dataType(ChangeHistoryDataType dataType) {
    this.dataType = dataType;
    return this;
  }

 /**
  * A string representation of the value of the changed field, after the change
  * @return newDataValue
  */
  @JsonProperty("new_data_value")
  public String getNewDataValue() {
    return newDataValue;
  }

  /**
   * Sets the <code>newDataValue</code> property.
   */
 public void setNewDataValue(String newDataValue) {
    this.newDataValue = newDataValue;
  }

  /**
   * Sets the <code>newDataValue</code> property.
   */
  public EntityDataChangeHistory newDataValue(String newDataValue) {
    this.newDataValue = newDataValue;
    return this;
  }

 /**
  * A string representation of the value of the changed field, before the change
  * @return oldDataValue
  */
  @JsonProperty("old_data_value")
  public String getOldDataValue() {
    return oldDataValue;
  }

  /**
   * Sets the <code>oldDataValue</code> property.
   */
 public void setOldDataValue(String oldDataValue) {
    this.oldDataValue = oldDataValue;
  }

  /**
   * Sets the <code>oldDataValue</code> property.
   */
  public EntityDataChangeHistory oldDataValue(String oldDataValue) {
    this.oldDataValue = oldDataValue;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

