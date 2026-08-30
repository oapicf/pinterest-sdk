package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignBidOptionsUpdate;
import org.openapitools.model.IntendedPromotionType;
import org.openapitools.model.ObjectiveType;

@Canonical
class CampaignUpdateRequestAllOf2 {
    
    CampaignBidOptionsUpdate bidOptions
    
    IntendedPromotionType intendedPromotionType
    /* Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. */
    Boolean isLtvOptimized
    /* Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field. */
    Boolean isPerformancePlus
    /* Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. */
    Boolean isTopOfSearch
    
    ObjectiveType objectiveType
}
