package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.PinPromotionSummaryStatus
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
data class AdResponseAllOf1(
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("campaign_id") val campaignId: kotlin.String? = null,

    @field:JsonProperty("collection_items_destination_url_template") val collectionItemsDestinationUrlTemplate: kotlin.String? = null,

    @field:JsonProperty("created_time") val createdTime: kotlin.Int? = null,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("id") val id: kotlin.String? = null,

    @field:JsonProperty("rejected_reasons") val rejectedReasons: kotlin.collections.List<AdResponseAllOf1.RejectedReasons>? = null,

    @field:JsonProperty("rejection_labels") val rejectionLabels: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("review_status") val reviewStatus: AdResponseAllOf1.ReviewStatus? = null,

    @field:JsonProperty("type") val type: kotlin.String? = null,

    @field:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null,

    @field:Valid
    @field:JsonProperty("summary_status") val summaryStatus: PinPromotionSummaryStatus? = null
) {

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

