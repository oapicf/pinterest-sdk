package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AmazonConnectRequest {
    /* The Amazon storefront id */
    String amazonStorefrontId
    /* The Amazon storefront name */
    String amazonStorefrontName
    /* The Amazon storefront url */
    String amazonStorefrontUrl
    /* The Amazon user id */
    String amazonUserId
    /* The Amazon account linking status */
    Boolean isAmazonAccountLinked
    /* The one time passcode for Pinterest-initiated linking requests */
    String oneTimePasscode
    /* The Pinterest user id for Amazon-initiated linking requests */
    String pinterestUserId
}
