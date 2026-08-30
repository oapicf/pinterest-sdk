package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ChangeHistoryDataType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EntityDataChangeHistory   {

    private String changedFieldId;
    private String changedFieldName;
    private ChangeHistoryDataType dataType;
    private String newDataValue;
    private String oldDataValue;

    /**
     * Default constructor.
     */
    public EntityDataChangeHistory() {
    // JSON-B / Jackson
    }

    /**
     * Create EntityDataChangeHistory.
     *
     * @param changedFieldId A string identifier representing the changed field on the entity
     * @param changedFieldName The human readable name of the changed field on the entity
     * @param dataType Specifies the type of the field&#39;s data values
     * @param newDataValue A string representation of the value of the changed field, after the change
     * @param oldDataValue A string representation of the value of the changed field, before the change
     */
    public EntityDataChangeHistory(
        String changedFieldId, 
        String changedFieldName, 
        ChangeHistoryDataType dataType, 
        String newDataValue, 
        String oldDataValue
    ) {
        this.changedFieldId = changedFieldId;
        this.changedFieldName = changedFieldName;
        this.dataType = dataType;
        this.newDataValue = newDataValue;
        this.oldDataValue = oldDataValue;
    }



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
     * Specifies the type of the field's data values
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

    /**
      * Create a string representation of this pojo.
    **/
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

