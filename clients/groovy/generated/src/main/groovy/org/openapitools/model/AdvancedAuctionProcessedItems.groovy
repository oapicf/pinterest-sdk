package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdvancedAuctionProcessedItem;

@Canonical
class AdvancedAuctionProcessedItems {
    /* Catalog id pertaining to all items */
    String catalogId
    /* Array of advanced auction processed items */
    List<AdvancedAuctionProcessedItem> items = new ArrayList<>()
}
