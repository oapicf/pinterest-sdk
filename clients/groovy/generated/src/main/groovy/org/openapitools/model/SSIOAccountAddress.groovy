package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class SSIOAccountAddress {
    /* Salesforce id for address */
    String addressId
    /* Address display */
    String display
    /* Legal entity for this insertion order */
    String orderLegalEntity
    /* Purpose for which the address is used, usually Billing or Businness */
    String purpose
}
