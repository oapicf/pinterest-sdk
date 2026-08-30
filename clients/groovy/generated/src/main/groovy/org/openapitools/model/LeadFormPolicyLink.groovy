package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class LeadFormPolicyLink {
    /* Policy label for an additional policy link. */
    String label
    /* Policy link for an additional policy link. */
    String link
}
