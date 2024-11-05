package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdvancedAuctionItemsSubmitRecord;

@Canonical
class AdvancedAuctionItemsSubmitRequest {
    /* Catalog id pertaining to all items */
    String catalogId
    /* Array of item bid option operations */
    List<AdvancedAuctionItemsSubmitRecord> items = new ArrayList<>()
}
