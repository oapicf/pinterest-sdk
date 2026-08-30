package org.openapitools.model;

import org.openapitools.model.ChangeHistoryDataType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class EntityDataChangeHistory implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A string identifier representing the changed field on the entity
   */
  @JsonProperty("changed_field_id")
  private String changedFieldId;

  /**
   * The human readable name of the changed field on the entity
   */
  @JsonProperty("changed_field_name")
  private String changedFieldName;

  /**
   * Specifies the type of the field&#39;s data values
   */
  @JsonProperty("data_type")
  private ChangeHistoryDataType dataType;

  /**
   * A string representation of the value of the changed field, after the change
   */
  @JsonProperty("new_data_value")
  private String newDataValue;

  /**
   * A string representation of the value of the changed field, before the change
   */
  @JsonProperty("old_data_value")
  private String oldDataValue;

  /**
   * A string identifier representing the changed field on the entity
   * @return changedFieldId
   */
  public String getChangedFieldId() {
    return changedFieldId;
  }

  public void setChangedFieldId(String changedFieldId) {
    this.changedFieldId = changedFieldId;
  }

  /**
   * The human readable name of the changed field on the entity
   * @return changedFieldName
   */
  public String getChangedFieldName() {
    return changedFieldName;
  }

  public void setChangedFieldName(String changedFieldName) {
    this.changedFieldName = changedFieldName;
  }

  /**
   * Specifies the type of the field&#39;s data values
   * @return dataType
   */
  public ChangeHistoryDataType getDataType() {
    return dataType;
  }

  public void setDataType(ChangeHistoryDataType dataType) {
    this.dataType = dataType;
  }

  /**
   * A string representation of the value of the changed field, after the change
   * @return newDataValue
   */
  public String getNewDataValue() {
    return newDataValue;
  }

  public void setNewDataValue(String newDataValue) {
    this.newDataValue = newDataValue;
  }

  /**
   * A string representation of the value of the changed field, before the change
   * @return oldDataValue
   */
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
