package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateAssetAccessRequestErrorMessageInner;

@Canonical
class CreateAssetAccessRequestResponse {
    /* A list of errors associated with the asset access requests. Will be returned if there is an error. */
    List<CreateAssetAccessRequestErrorMessageInner> exceptions
    
    Map<String, String> invites
}
