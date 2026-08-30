package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignAdPreview;
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInnerDataOneOf;
import org.openapitools.model.PinterestLibError;

@Canonical
class CampaignAdPreviewCreate200ResponseInnerData {
    /* Advertiser ID for this preview. */
    String adAccountId
    /* Ad group ID to create a preview record for. */
    String adGroupId
    /* Client ID that created preview. */
    Integer clientId
    /* Unix timestamp in milliseconds for preview expiration. */
    Integer expiresAt
    /* Whether preview link is active. */
    Boolean isActive
    /* Pin ID for pin promotion preview. */
    Integer pinId
    /* Pin promotion ID for this preview. */
    Integer pinPromotionId
    /* Promoted product group ID for catalog previews. */
    Integer promotedProductGroupId
    /* Campaign ad preview URL. */
    String url
    /* User ID that created preview. */
    Integer userId
    /* Pin promotion preview key. */
    String uuid
    
    PinterestLibError exceptions
}
