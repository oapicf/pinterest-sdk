package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreativeType;
import org.openapitools.model.CustomizableCTAType;
import org.openapitools.model.DisclosureType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import org.openapitools.model.QuizPinData;
import org.openapitools.model.TrackingUrls;

@Canonical
class AdCommon {
    /* ID of the ad group that contains the ad. */
    String adGroupId
    /* Deep link URL for Android devices. */
    String androidDeepLink
    /* Comma-separated deep links for the carousel pin on Android. */
    List<String> carouselAndroidDeepLinks
    /* Comma-separated destination URLs for the carousel pin to promote. */
    List<String> carouselDestinationUrls
    /* Comma-separated deep links for the carousel pin on iOS. */
    List<String> carouselIosDeepLinks
    /* Tracking url for the ad clicks. */
    String clickTrackingUrl
    
    CreativeType creativeType
    
    CustomizableCTAType customizableCtaType
    /* Destination URL. */
    String destinationUrl
    
    DisclosureType disclosureType
    /* URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. */
    String disclosureUrl
    
    GridClickType gridClickType
    /* Deep link URL for iOS devices. */
    String iosDeepLink
    /* Is original pin deleted? */
    Boolean isPinDeleted
    /* Is pin repinnable? */
    Boolean isRemovable
    /* Lead form ID for lead ad generation. */
    String leadFormId
    /* Name of the ad - 255 chars max. */
    String name
    /* Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. */
    QuizPinData quizPinData
    
    EntityStatus status
    
    TrackingUrls trackingUrls
    /* Tracking URL for ad impressions. */
    String viewTrackingUrl
}
