package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdvancedAuctionBidOptions;
import org.openapitools.model.AdvancedAuctionItemsSubmitDeleteRecord;
import org.openapitools.model.AdvancedAuctionItemsSubmitUpsertRecord;
import org.openapitools.model.AdvancedAuctionOperation;
import org.openapitools.model.Country;
import org.openapitools.model.Language;
import org.openapitools.model.UpdateMaskBidOptionField;

@Canonical
class AdvancedAuctionItemsSubmitRecord {
    
    AdvancedAuctionOperation operation
    /* The catalog retail item id in the merchant namespace */
    String itemId
    
    Country country
    
    Language language
    
    AdvancedAuctionBidOptions bidOptions
    /* The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`. */
    List<UpdateMaskBidOptionField> updateMask
}
