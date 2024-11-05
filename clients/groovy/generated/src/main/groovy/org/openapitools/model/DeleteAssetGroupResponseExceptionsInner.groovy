package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DeleteAssetGroupResponseExceptionsInner {
    /* Error code associated with the error deleting asset group. */
    Integer code
    /* Error message associated with the error deleting asset group. */
    String message
    /* Asset group id of the exception. */
    String assetGroupId
}
