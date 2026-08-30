package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ChangeHistoryOperationType;
import org.openapitools.model.EntityDataChangeHistory;

@Canonical
class EntityHistory {
    /* A Unix timestamp representing the time of the change in seconds */
    Integer changeTimestamp
    /* Properties associated with a particular change to an entity's data */
    List<EntityDataChangeHistory> dataChanges = new ArrayList<>()
    /* The id of the entity that was changed */
    String entityId
    /* The name of the entity that was changed */
    String entityName
    /* The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users */
    String ldap
    /* The type of operation that caused the change */
    ChangeHistoryOperationType operation
    /* The id of the user who initiated the change */
    String userId
}
