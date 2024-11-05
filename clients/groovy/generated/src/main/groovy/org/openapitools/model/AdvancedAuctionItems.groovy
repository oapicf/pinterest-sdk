package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdvancedAuctionItem;

@Canonical
class AdvancedAuctionItems {
    /* Response object of item bid options */
    String catalogId
    /* Array with item bid options */
    List<AdvancedAuctionItem> items = new ArrayList<>()
}
