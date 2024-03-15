package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class UserWebsiteVerificationCode {
    /* Code to check against the user claiming the website */
    String verificationCode
    /* DNS TXT record to check against for the website to be claimed */
    String dnsTxtRecord
    /* Metatag the verification process searchs for the website to be claimed */
    String metatag
    /* File expected to find on the website being claimed */
    String filename
    /* A full html file to upload to the website in order for it to be claimed */
    String fileContent
}
