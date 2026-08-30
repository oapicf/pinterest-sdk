package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChangeHistoryDataType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  /**
   * A string identifier representing the changed field on the entity
   **/
  public EntityDataChangeHistory changedFieldId(String changedFieldId) {
    this.changedFieldId = changedFieldId;
    return this;
  }

  
  @ApiModelProperty(value = "A string identifier representing the changed field on the entity")
  @JsonProperty("changed_field_id")
  public String getChangedFieldId() {
    return changedFieldId;
  }
  public void setChangedFieldId(String changedFieldId) {
    this.changedFieldId = changedFieldId;
  }

  /**
   * The human readable name of the changed field on the entity
   **/
  public EntityDataChangeHistory changedFieldName(String changedFieldName) {
    this.changedFieldName = changedFieldName;
    return this;
  }

  
  @ApiModelProperty(value = "The human readable name of the changed field on the entity")
  @JsonProperty("changed_field_name")
  public String getChangedFieldName() {
    return changedFieldName;
  }
  public void setChangedFieldName(String changedFieldName) {
    this.changedFieldName = changedFieldName;
  }

  /**
   * Specifies the type of the field's data values
   **/
  public EntityDataChangeHistory dataType(ChangeHistoryDataType dataType) {
    this.dataType = dataType;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies the type of the field's data values")
  @JsonProperty("data_type")
  public ChangeHistoryDataType getDataType() {
    return dataType;
  }
  public void setDataType(ChangeHistoryDataType dataType) {
    this.dataType = dataType;
  }

  /**
   * A string representation of the value of the changed field, after the change
   **/
  public EntityDataChangeHistory newDataValue(String newDataValue) {
    this.newDataValue = newDataValue;
    return this;
  }

  
  @ApiModelProperty(value = "A string representation of the value of the changed field, after the change")
  @JsonProperty("new_data_value")
  public String getNewDataValue() {
    return newDataValue;
  }
  public void setNewDataValue(String newDataValue) {
    this.newDataValue = newDataValue;
  }

  /**
   * A string representation of the value of the changed field, before the change
   **/
  public EntityDataChangeHistory oldDataValue(String oldDataValue) {
    this.oldDataValue = oldDataValue;
    return this;
  }

  
  @ApiModelProperty(value = "A string representation of the value of the changed field, before the change")
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
    return Objects.equals(changedFieldId, entityDataChangeHistory.changedFieldId) &&
        Objects.equals(changedFieldName, entityDataChangeHistory.changedFieldName) &&
        Objects.equals(dataType, entityDataChangeHistory.dataType) &&
        Objects.equals(newDataValue, entityDataChangeHistory.newDataValue) &&
        Objects.equals(oldDataValue, entityDataChangeHistory.oldDataValue);
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

