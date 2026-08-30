package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class AdvertiserDefinedEventProcessingRecord {
    /* List of exception messages if the operation failed */
    List<String> exceptions = new ArrayList<>()
    /* Name of the advertiser defined event */
    String name
    /* Processing status (success or failure) */
    String status
}
