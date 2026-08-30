package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdAccountEntityType;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleDeltaValue;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;

@Canonical
class Schedule {
    
    ScheduleDeltaValue deltaValue
    /* Schedule end time. Unix timestamp in seconds. */
    Integer endTimestamp
    /* entity ID. */
    String entityId
    /* Specify the entity_type to get summary information */
    AdAccountEntityType entityType
    /* Schedule name. */
    String name
    /* The schedule action. */
    ScheduleAction scheduleAction
    /* Schedule ID. */
    String scheduleId
    /* Schedule status. */
    ScheduleStatus scheduleStatus
    /* The schedule type. */
    ScheduleType scheduleType
    /* Schedule start time. Unix timestamp in seconds. */
    Integer startTimestamp
}
