package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class PinsSaveRequest {
    /* Unique identifier of the board to which the pin will be saved. */
    String boardId
    /* Unique identifier of the board section to which the pin will be saved. */
    String boardSectionId
}
