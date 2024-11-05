package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class UpdateAssetGroupResponseExceptionsInner {
    /* Error code associated with the error editing asset group. */
    Integer code
    /* Error message associated with the error editing asset group. */
    String message
    /* Asset group id of the exception. */
    String assetGroupId
}
