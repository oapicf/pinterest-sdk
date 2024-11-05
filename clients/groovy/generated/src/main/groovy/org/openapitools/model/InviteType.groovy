package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum InviteType {

    MEMBER_INVITE("MEMBER_INVITE"),
    
    PARTNER_INVITE("PARTNER_INVITE"),
    
    PARTNER_REQUEST("PARTNER_REQUEST")

    private final String value

    InviteType(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
