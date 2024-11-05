package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdvancedAuctionBidOptions;
import org.openapitools.model.Country;
import org.openapitools.model.Language;

@Canonical
class AdvancedAuctionItem {
    /* The catalog retail item id in the merchant namespace */
    String itemId
    
    Country country
    
    Language language
    
    AdvancedAuctionBidOptions bidOptions
}
