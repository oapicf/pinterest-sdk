package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdResponseAllOf
import org.openapitools.model.AdResponseAllOf1
import org.openapitools.model.EntityStatus
import org.openapitools.model.PinPromotionSummaryStatus
import org.openapitools.model.TrackingUrls
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param adGroupId ID of the ad group that contains the ad.
 * @param androidDeepLink Deep link URL for Android devices. Not currently available. Using this field will generate an error.
 * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
 * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
 * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
 * @param clickTrackingUrl Tracking url for the ad clicks.
 * @param creativeType Ad creative type enum
 * @param destinationUrl Destination URL.
 * @param iosDeepLink Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
 * @param isPinDeleted Is original pin deleted?
 * @param isRemovable Is pin repinnable?
 * @param name Name of the ad - 255 chars max.
 * @param pinId Pin ID.
 * @param status 
 * @param trackingUrls 
 * @param viewTrackingUrl Tracking URL for ad impressions.
 * @param adAccountId The ID of the advertiser that this ad belongs to.
 * @param campaignId ID of the ad campaign that contains this ad.
 * @param collectionItemsDestinationUrlTemplate Destination URL template for all items within a collections drawer.
 * @param createdTime Pin creation time. Unix timestamp in seconds.
 * @param id The ID of this ad.
 * @param rejectedReasons Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
 * @param rejectionLabels Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
 * @param reviewStatus Ad review status
 * @param type Always \"ad\".
 * @param updatedTime Last update time. Unix timestamp in seconds.
 * @param summaryStatus Ad summary status
 */
data class AdResponse(
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("ad_group_id") val adGroupId: kotlin.String? = null,

    @field:JsonProperty("android_deep_link") val androidDeepLink: kotlin.String? = null,

    @field:JsonProperty("carousel_android_deep_links") val carouselAndroidDeepLinks: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("carousel_destination_urls") val carouselDestinationUrls: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("carousel_ios_deep_links") val carouselIosDeepLinks: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("click_tracking_url") val clickTrackingUrl: kotlin.String? = null,

    @field:JsonProperty("creative_type") val creativeType: AdResponse.CreativeType? = null,

    @field:JsonProperty("destination_url") val destinationUrl: kotlin.String? = null,

    @field:JsonProperty("ios_deep_link") val iosDeepLink: kotlin.String? = null,

    @field:JsonProperty("is_pin_deleted") val isPinDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("is_removable") val isRemovable: kotlin.Boolean? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("pin_id") val pinId: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("status") val status: EntityStatus? = null,

    @field:Valid
    @field:JsonProperty("tracking_urls") val trackingUrls: TrackingUrls? = null,

    @field:JsonProperty("view_tracking_url") val viewTrackingUrl: kotlin.String? = null,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("campaign_id") val campaignId: kotlin.String? = null,

    @field:JsonProperty("collection_items_destination_url_template") val collectionItemsDestinationUrlTemplate: kotlin.String? = null,

    @field:JsonProperty("created_time") val createdTime: kotlin.Int? = null,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("id") val id: kotlin.String? = null,

    @field:JsonProperty("rejected_reasons") val rejectedReasons: kotlin.collections.List<AdResponse.RejectedReasons>? = null,

    @field:JsonProperty("rejection_labels") val rejectionLabels: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("review_status") val reviewStatus: AdResponse.ReviewStatus? = null,

    @field:JsonProperty("type") val type: kotlin.String? = null,

    @field:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null,

    @field:Valid
    @field:JsonProperty("summary_status") val summaryStatus: PinPromotionSummaryStatus? = null
) {

    /**
    * Ad creative type enum
    * Values: rEGULAR,vIDEO,sHOPPING,cAROUSEL,mAXVIDEO,sHOPTHEPIN,sTORY
    */
    enum class CreativeType(val value: kotlin.String) {
    
        @JsonProperty("REGULAR") rEGULAR("REGULAR"),
    
        @JsonProperty("VIDEO") vIDEO("VIDEO"),
    
        @JsonProperty("SHOPPING") sHOPPING("SHOPPING"),
    
        @JsonProperty("CAROUSEL") cAROUSEL("CAROUSEL"),
    
        @JsonProperty("MAX_VIDEO") mAXVIDEO("MAX_VIDEO"),
    
        @JsonProperty("SHOP_THE_PIN") sHOPTHEPIN("SHOP_THE_PIN"),
    
        @JsonProperty("STORY") sTORY("STORY");
    
    }

    /**
    * Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
    * Values: hASHTAGS,pROMOTIONSANDPRICES,tARGETING,lANDINGPAGE,cAPSANDSYMBOLS,sHOCKING,wEIGHTLOSS,pROHIBITEDPRODUCT,aUTHENTICITY,nUDITY,cONFUSINGDESIGN,uRGENCY,rATINGS,aPP,aLCOHOL,cONTESTS,pOLITICAL,oTHER,iMAGE,nAR,iNCONSISTENT,cLICKBAIT,nODESCRIPTION,lOWQUALITY,eXAGGERATEDCLAIMS,pINTERESTBRAND,aLCOHOLNOSALE,lANDINGPAGESPEED,lANDINGPAGEHARDWALL,lANDINGPAGEBROKEN,lANDINGPAGEQUALITY,oUTOFSTOCK,iMAGELOWQUALITY,iMAGEBUSY,iMAGEPOORLYEDITED,iMAGEBEFOREAFTER,uGC,fAKEBUTTONS,wEAPONS,sENSITIVE,uNACCEPTABLEBUSINESS,sUSPICIOUSCLAIMS,pHARMA,sUSPICIOUSSUPPLEMENTS,iLLEGALRECREATIONALDRUG,lOWQUALITYLANDINGPAGE,rESTRICTEDHEALTHCARE,iNCONSISTENTLANGFR
    */
    enum class RejectedReasons(val value: kotlin.String) {
    
        @JsonProperty("HASHTAGS") hASHTAGS("HASHTAGS"),
    
        @JsonProperty("PROMOTIONS_AND_PRICES") pROMOTIONSANDPRICES("PROMOTIONS_AND_PRICES"),
    
        @JsonProperty("TARGETING") tARGETING("TARGETING"),
    
        @JsonProperty("LANDING_PAGE") lANDINGPAGE("LANDING_PAGE"),
    
        @JsonProperty("CAPS_AND_SYMBOLS") cAPSANDSYMBOLS("CAPS_AND_SYMBOLS"),
    
        @JsonProperty("SHOCKING") sHOCKING("SHOCKING"),
    
        @JsonProperty("WEIGHT_LOSS") wEIGHTLOSS("WEIGHT_LOSS"),
    
        @JsonProperty("PROHIBITED_PRODUCT") pROHIBITEDPRODUCT("PROHIBITED_PRODUCT"),
    
        @JsonProperty("AUTHENTICITY") aUTHENTICITY("AUTHENTICITY"),
    
        @JsonProperty("NUDITY") nUDITY("NUDITY"),
    
        @JsonProperty("CONFUSING_DESIGN") cONFUSINGDESIGN("CONFUSING_DESIGN"),
    
        @JsonProperty("URGENCY") uRGENCY("URGENCY"),
    
        @JsonProperty("RATINGS") rATINGS("RATINGS"),
    
        @JsonProperty("APP") aPP("APP"),
    
        @JsonProperty("ALCOHOL") aLCOHOL("ALCOHOL"),
    
        @JsonProperty("CONTESTS") cONTESTS("CONTESTS"),
    
        @JsonProperty("POLITICAL") pOLITICAL("POLITICAL"),
    
        @JsonProperty("OTHER") oTHER("OTHER"),
    
        @JsonProperty("IMAGE") iMAGE("IMAGE"),
    
        @JsonProperty("NAR") nAR("NAR"),
    
        @JsonProperty("INCONSISTENT") iNCONSISTENT("INCONSISTENT"),
    
        @JsonProperty("CLICKBAIT") cLICKBAIT("CLICKBAIT"),
    
        @JsonProperty("NO_DESCRIPTION") nODESCRIPTION("NO_DESCRIPTION"),
    
        @JsonProperty("LOW_QUALITY") lOWQUALITY("LOW_QUALITY"),
    
        @JsonProperty("EXAGGERATED_CLAIMS") eXAGGERATEDCLAIMS("EXAGGERATED_CLAIMS"),
    
        @JsonProperty("PINTEREST_BRAND") pINTERESTBRAND("PINTEREST_BRAND"),
    
        @JsonProperty("ALCOHOL_NO_SALE") aLCOHOLNOSALE("ALCOHOL_NO_SALE"),
    
        @JsonProperty("LANDING_PAGE_SPEED") lANDINGPAGESPEED("LANDING_PAGE_SPEED"),
    
        @JsonProperty("LANDING_PAGE_HARDWALL") lANDINGPAGEHARDWALL("LANDING_PAGE_HARDWALL"),
    
        @JsonProperty("LANDING_PAGE_BROKEN") lANDINGPAGEBROKEN("LANDING_PAGE_BROKEN"),
    
        @JsonProperty("LANDING_PAGE_QUALITY") lANDINGPAGEQUALITY("LANDING_PAGE_QUALITY"),
    
        @JsonProperty("OUT_OF_STOCK") oUTOFSTOCK("OUT_OF_STOCK"),
    
        @JsonProperty("IMAGE_LOW_QUALITY") iMAGELOWQUALITY("IMAGE_LOW_QUALITY"),
    
        @JsonProperty("IMAGE_BUSY") iMAGEBUSY("IMAGE_BUSY"),
    
        @JsonProperty("IMAGE_POORLY_EDITED") iMAGEPOORLYEDITED("IMAGE_POORLY_EDITED"),
    
        @JsonProperty("IMAGE_BEFORE_AFTER") iMAGEBEFOREAFTER("IMAGE_BEFORE_AFTER"),
    
        @JsonProperty("UGC") uGC("UGC"),
    
        @JsonProperty("FAKE_BUTTONS") fAKEBUTTONS("FAKE_BUTTONS"),
    
        @JsonProperty("WEAPONS") wEAPONS("WEAPONS"),
    
        @JsonProperty("SENSITIVE") sENSITIVE("SENSITIVE"),
    
        @JsonProperty("UNACCEPTABLE_BUSINESS") uNACCEPTABLEBUSINESS("UNACCEPTABLE_BUSINESS"),
    
        @JsonProperty("SUSPICIOUS_CLAIMS") sUSPICIOUSCLAIMS("SUSPICIOUS_CLAIMS"),
    
        @JsonProperty("PHARMA") pHARMA("PHARMA"),
    
        @JsonProperty("SUSPICIOUS_SUPPLEMENTS") sUSPICIOUSSUPPLEMENTS("SUSPICIOUS_SUPPLEMENTS"),
    
        @JsonProperty("ILLEGAL_RECREATIONAL_DRUG") iLLEGALRECREATIONALDRUG("ILLEGAL_RECREATIONAL_DRUG"),
    
        @JsonProperty("LOW_QUALITY_LANDING_PAGE") lOWQUALITYLANDINGPAGE("LOW_QUALITY_LANDING_PAGE"),
    
        @JsonProperty("RESTRICTED_HEALTHCARE") rESTRICTEDHEALTHCARE("RESTRICTED_HEALTHCARE"),
    
        @JsonProperty("INCONSISTENT_LANG_FR") iNCONSISTENTLANGFR("INCONSISTENT_LANG_FR");
    
    }

    /**
    * Ad review status
    * Values: oTHER,pENDING,rEJECTED,aPPROVED
    */
    enum class ReviewStatus(val value: kotlin.String) {
    
        @JsonProperty("OTHER") oTHER("OTHER"),
    
        @JsonProperty("PENDING") pENDING("PENDING"),
    
        @JsonProperty("REJECTED") rEJECTED("REJECTED"),
    
        @JsonProperty("APPROVED") aPPROVED("APPROVED");
    
    }

}

