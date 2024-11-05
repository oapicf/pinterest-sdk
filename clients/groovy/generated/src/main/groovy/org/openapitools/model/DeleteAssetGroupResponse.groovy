package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DeleteAssetGroupResponseExceptionsInner;

@Canonical
class DeleteAssetGroupResponse {
    /* A list of ids of successfully deleted asset groups. */
    List<String> deletedAssetGroups = new ArrayList<>()
    /* A list of errors associated with the asset groups. Will be returned if there is an error. */
    List<DeleteAssetGroupResponseExceptionsInner> exceptions
}
