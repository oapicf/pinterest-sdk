package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class SSIOAccountAddress {
    /* Address display */
    String display
    /* Purpose for which the address is used, usually Billing or Businness */
    String purpose
    /* Salesforce id for address */
    String addressId
    /* Legal entity for this insertion order */
    String orderLegalEntity
}
