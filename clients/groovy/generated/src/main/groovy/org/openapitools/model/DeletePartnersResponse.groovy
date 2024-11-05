package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class DeletePartnersResponse {
    /* List of partners whose business partnership have been terminated. */
    List<String> deletedPartners = new ArrayList<>()
}
