package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ChangeHistoryOperationType;
import org.openapitools.server.model.EntityDataChangeHistory;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EntityHistory   {

    private Integer changeTimestamp;
    private List<@Valid EntityDataChangeHistory> dataChanges = new ArrayList<>();
    private String entityId;
    private String entityName;
    private String ldap;
    private ChangeHistoryOperationType operation;
    private String userId;

    /**
     * Default constructor.
     */
    public EntityHistory() {
    // JSON-B / Jackson
    }

    /**
     * Create EntityHistory.
     *
     * @param changeTimestamp A Unix timestamp representing the time of the change in seconds
     * @param dataChanges Properties associated with a particular change to an entity&#39;s data
     * @param entityId The id of the entity that was changed
     * @param entityName The name of the entity that was changed
     * @param ldap The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
     * @param operation The type of operation that caused the change
     * @param userId The id of the user who initiated the change
     */
    public EntityHistory(
        Integer changeTimestamp, 
        List<@Valid EntityDataChangeHistory> dataChanges, 
        String entityId, 
        String entityName, 
        String ldap, 
        ChangeHistoryOperationType operation, 
        String userId
    ) {
        this.changeTimestamp = changeTimestamp;
        this.dataChanges = dataChanges;
        this.entityId = entityId;
        this.entityName = entityName;
        this.ldap = ldap;
        this.operation = operation;
        this.userId = userId;
    }



    /**
     * A Unix timestamp representing the time of the change in seconds
     * @return changeTimestamp
     */
    public Integer getChangeTimestamp() {
        return changeTimestamp;
    }

    public void setChangeTimestamp(Integer changeTimestamp) {
        this.changeTimestamp = changeTimestamp;
    }

    /**
     * Properties associated with a particular change to an entity's data
     * @return dataChanges
     */
    public List<@Valid EntityDataChangeHistory> getDataChanges() {
        return dataChanges;
    }

    public void setDataChanges(List<@Valid EntityDataChangeHistory> dataChanges) {
        this.dataChanges = dataChanges;
    }

    /**
     * The id of the entity that was changed
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * The name of the entity that was changed
     * @return entityName
     */
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    /**
     * The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
     * @return ldap
     */
    public String getLdap() {
        return ldap;
    }

    public void setLdap(String ldap) {
        this.ldap = ldap;
    }

    /**
     * The type of operation that caused the change
     * @return operation
     */
    public ChangeHistoryOperationType getOperation() {
        return operation;
    }

    public void setOperation(ChangeHistoryOperationType operation) {
        this.operation = operation;
    }

    /**
     * The id of the user who initiated the change
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

