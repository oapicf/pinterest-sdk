package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.EntityStatus
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
 * Creation fields
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
 */
data class AdResponseAllOf(
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("ad_group_id") val adGroupId: kotlin.String? = null,

    @field:JsonProperty("android_deep_link") val androidDeepLink: kotlin.String? = null,

    @field:JsonProperty("carousel_android_deep_links") val carouselAndroidDeepLinks: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("carousel_destination_urls") val carouselDestinationUrls: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("carousel_ios_deep_links") val carouselIosDeepLinks: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("click_tracking_url") val clickTrackingUrl: kotlin.String? = null,

    @field:JsonProperty("creative_type") val creativeType: AdResponseAllOf.CreativeType? = null,

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

    @field:JsonProperty("view_tracking_url") val viewTrackingUrl: kotlin.String? = null
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

}

