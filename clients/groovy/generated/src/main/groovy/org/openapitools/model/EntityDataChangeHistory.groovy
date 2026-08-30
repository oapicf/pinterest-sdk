package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChangeHistoryDataType;

@Canonical
class EntityDataChangeHistory {
    /* A string identifier representing the changed field on the entity */
    String changedFieldId
    /* The human readable name of the changed field on the entity */
    String changedFieldName
    /* Specifies the type of the field's data values */
    ChangeHistoryDataType dataType
    /* A string representation of the value of the changed field, after the change */
    String newDataValue
    /* A string representation of the value of the changed field, before the change */
    String oldDataValue
}
