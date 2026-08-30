package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ChangeHistoryDataType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityDataChangeHistory   {
  
  private String changedFieldId;
  private String changedFieldName;
  private ChangeHistoryDataType dataType;
  private String newDataValue;
  private String oldDataValue;

  public EntityDataChangeHistory () {

  }

  public EntityDataChangeHistory (String changedFieldId, String changedFieldName, ChangeHistoryDataType dataType, String newDataValue, String oldDataValue) {
    this.changedFieldId = changedFieldId;
    this.changedFieldName = changedFieldName;
    this.dataType = dataType;
    this.newDataValue = newDataValue;
    this.oldDataValue = oldDataValue;
  }

    
  @JsonProperty("changed_field_id")
  public String getChangedFieldId() {
    return changedFieldId;
  }
  public void setChangedFieldId(String changedFieldId) {
    this.changedFieldId = changedFieldId;
  }

    
  @JsonProperty("changed_field_name")
  public String getChangedFieldName() {
    return changedFieldName;
  }
  public void setChangedFieldName(String changedFieldName) {
    this.changedFieldName = changedFieldName;
  }

    
  @JsonProperty("data_type")
  public ChangeHistoryDataType getDataType() {
    return dataType;
  }
  public void setDataType(ChangeHistoryDataType dataType) {
    this.dataType = dataType;
  }

    
  @JsonProperty("new_data_value")
  public String getNewDataValue() {
    return newDataValue;
  }
  public void setNewDataValue(String newDataValue) {
    this.newDataValue = newDataValue;
  }

    
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
