package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RecordCounts {
    /* Number of invalid records processed */
    Integer invalid
    /* Number of records processed */
    Integer processed
    /* Number of valid records processed */
    Integer valid
}
