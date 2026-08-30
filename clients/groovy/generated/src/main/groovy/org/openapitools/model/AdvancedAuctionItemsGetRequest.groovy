package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdvancedAuctionKey;

@Canonical
class AdvancedAuctionItemsGetRequest {
    /* Catalog id pertaining to the retail item */
    String catalogId
    /* A list of retail catalog items to fetch bid options for */
    List<AdvancedAuctionKey> items = new ArrayList<>()
}
