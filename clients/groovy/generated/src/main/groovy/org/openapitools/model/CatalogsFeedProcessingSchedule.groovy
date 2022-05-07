package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsFeedProcessingSchedule {
    /* A time in format HH:MM with leading 0 (zero) */
    String time
    /* The timezone considered for the processing schedule time. */
    String timezone
}
