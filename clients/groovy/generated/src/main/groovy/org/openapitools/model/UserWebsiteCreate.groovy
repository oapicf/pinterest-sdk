package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.WebsiteVerificationMethod;

@Canonical
class UserWebsiteCreate {
    /* Method used to verify website ownership. */
    WebsiteVerificationMethod verificationMethod
    /* Website with path or domain only */
    String website
}
