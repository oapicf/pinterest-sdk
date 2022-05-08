/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model


case class AdResponse (
  // ID of the ad group that contains the ad.
  adGroupId: Option[String] = None,
  // Deep link URL for Android devices. Not currently available. Using this field will generate an error.
  androidDeepLink: Option[String] = None,
  // Comma-separated deep links for the carousel pin on Android.
  carouselAndroidDeepLinks: Option[List[String]] = None,
  // Comma-separated destination URLs for the carousel pin to promote.
  carouselDestinationUrls: Option[List[String]] = None,
  // Comma-separated deep links for the carousel pin on iOS.
  carouselIosDeepLinks: Option[List[String]] = None,
  // Tracking url for the ad clicks.
  clickTrackingUrl: Option[String] = None,
  // Ad creative type enum
  creativeType: Option[String] = None,
  // Destination URL.
  destinationUrl: Option[String] = None,
  // Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
  iosDeepLink: Option[String] = None,
  // Is original pin deleted?
  isPinDeleted: Option[Boolean] = None,
  // Is pin repinnable?
  isRemovable: Option[Boolean] = None,
  // Name of the ad - 255 chars max.
  name: Option[String] = None,
  // Pin ID.
  pinId: Option[String] = None,
  status: Option[EntityStatus] = None,
  trackingUrls: Option[TrackingUrls] = None,
  // Tracking URL for ad impressions.
  viewTrackingUrl: Option[String] = None,
  // The ID of the advertiser that this ad belongs to.
  adAccountId: Option[String] = None,
  // ID of the ad campaign that contains this ad.
  campaignId: Option[String] = None,
  // Destination URL template for all items within a collections drawer.
  collectionItemsDestinationUrlTemplate: Option[String] = None,
  // Pin creation time. Unix timestamp in seconds.
  createdTime: Option[Integer] = None,
  // The ID of this ad.
  id: Option[String] = None,
  // Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  rejectedReasons: Option[List[String]] = None,
  // Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  rejectionLabels: Option[List[String]] = None,
  // Ad review status
  reviewStatus: Option[String] = None,
  // Always \"ad\".
  `type`: Option[String] = None,
  // Last update time. Unix timestamp in seconds.
  updatedTime: Option[Integer] = None,
  // Ad summary status
  summaryStatus: Option[PinPromotionSummaryStatus] = None
)
