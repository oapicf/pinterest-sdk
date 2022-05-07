package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.TrackingUrls;

@Canonical
class AdResponseAllOf {
    /* ID of the ad group that contains the ad. */
    String adGroupId
    /* Deep link URL for Android devices. Not currently available. Using this field will generate an error. */
    String androidDeepLink
    /* Comma-separated deep links for the carousel pin on Android. */
    List<String> carouselAndroidDeepLinks = new ArrayList<String>()
    /* Comma-separated destination URLs for the carousel pin to promote. */
    List<String> carouselDestinationUrls = new ArrayList<String>()
    /* Comma-separated deep links for the carousel pin on iOS. */
    List<String> carouselIosDeepLinks = new ArrayList<String>()
    /* Tracking url for the ad clicks. */
    String clickTrackingUrl
    /* Ad creative type enum */
    String creativeType
    /* Destination URL. */
    String destinationUrl
    /* Deep link URL for iOS devices. Not currently available. Using this field will generate an error. */
    String iosDeepLink
    /* Is original pin deleted? */
    Boolean isPinDeleted
    /* Is pin repinnable? */
    Boolean isRemovable
    /* Name of the ad - 255 chars max. */
    String name
    /* Pin ID. */
    String pinId
    
    EntityStatus status
    
    TrackingUrls trackingUrls
    /* Tracking URL for ad impressions. */
    String viewTrackingUrl
}
