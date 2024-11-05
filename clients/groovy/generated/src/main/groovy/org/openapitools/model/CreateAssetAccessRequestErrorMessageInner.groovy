package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class CreateAssetAccessRequestErrorMessageInner {
    /* Error code associated with the error in requesting asset access. */
    Integer code
    
    List<String> messages = new ArrayList<>()
}
