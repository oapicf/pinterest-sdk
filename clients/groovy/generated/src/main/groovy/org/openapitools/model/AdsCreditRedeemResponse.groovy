package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class AdsCreditRedeemResponse {
    /* Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true). */
    Boolean success
    /* Error code type if error occurs */
    Integer errorCode
    /* Reason for failure */
    String errorMessage
}
