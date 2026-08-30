package apimodels;

import apimodels.ChangeHistoryDataType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EntityDataChangeHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EntityDataChangeHistory   {
  @JsonProperty("changed_field_id")
  
  private String changedFieldId;

  @JsonProperty("changed_field_name")
  
  private String changedFieldName;

  @JsonProperty("data_type")
  @Valid

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

