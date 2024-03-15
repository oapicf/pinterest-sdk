package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AdsCreditRedeemRequest {
    /* Takes in a SHA256 hash of the offerCode. */
    String offerCodeHash
    /* If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account */
    Boolean validateOnly
}
