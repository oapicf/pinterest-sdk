package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ScheduleAction;
import org.openapitools.model.ScheduleCommonDeltaValue;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;

@Canonical
class ScheduleCreateRequest {
    
    String entityId
    /* Entity type */
    String entityType
    
    ScheduleCommonDeltaValue deltaValue
    /* Schedule end time. Unix timestamp in seconds. */
    Integer endTimestamp
    
    String name
    
    ScheduleAction scheduleAction
    
    ScheduleStatus scheduleStatus
    
    ScheduleType scheduleType
    /* Schedule start time. Unix timestamp in seconds. */
    Integer startTimestamp
}
