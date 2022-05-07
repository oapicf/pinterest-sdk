package org.openapitools.server.model


/**
 * Creation fields
 *
 * @param adGroupId ID of the ad group that contains the ad. for example: ''2680059592705''
 * @param androidDeepLink Deep link URL for Android devices. Not currently available. Using this field will generate an error. for example: ''null''
 * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android. for example: ''null''
 * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote. for example: ''null''
 * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS. for example: ''null''
 * @param clickTrackingUrl Tracking url for the ad clicks. for example: ''null''
 * @param creativeType Ad creative type enum for example: ''REGULAR''
 * @param destinationUrl Destination URL. for example: ''null''
 * @param iosDeepLink Deep link URL for iOS devices. Not currently available. Using this field will generate an error. for example: ''null''
 * @param isPinDeleted Is original pin deleted? for example: ''false''
 * @param isRemovable Is pin repinnable? for example: ''false''
 * @param name Name of the ad - 255 chars max. for example: ''null''
 * @param pinId Pin ID. for example: ''394205773611545468''
 * @param status  for example: ''null''
 * @param trackingUrls  for example: ''null''
 * @param viewTrackingUrl Tracking URL for ad impressions. for example: ''null''
*/
final case class AdResponseAllOf (
  adGroupId: Option[String],
  androidDeepLink: Option[String],
  carouselAndroidDeepLinks: Option[Seq[String]],
  carouselDestinationUrls: Option[Seq[String]],
  carouselIosDeepLinks: Option[Seq[String]],
  clickTrackingUrl: Option[String],
  creativeType: Option[String],
  destinationUrl: Option[String],
  iosDeepLink: Option[String],
  isPinDeleted: Option[Boolean],
  isRemovable: Option[Boolean],
  name: Option[String],
  pinId: Option[String],
  status: Option[EntityStatus],
  trackingUrls: Option[TrackingUrls],
  viewTrackingUrl: Option[String]
)

