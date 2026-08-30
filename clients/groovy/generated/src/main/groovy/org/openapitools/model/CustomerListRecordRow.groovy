package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CustomerListRecordRow {
    /* Email address (plain or hashed with SHA1, SHA256, or MD5). */
    String email
    /* External ID identifier (not hashed). */
    String externalId
    /* Hashed phone number (hashed with SHA1, SHA256, or MD5). */
    String hashedPhoneNumber
    /* Hashed pinner ID (hashed with SHA1, SHA256, or MD5). */
    String hashedPinnerId
    /* IP address (not hashed). */
    String ipAddress
    /* LiveRamp envelope identifier (Base64-encoded, not hashed). */
    String liverampEnvelope
    /* Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5). */
    String maid
    /* User agent string (not hashed). */
    String userAgent
}
