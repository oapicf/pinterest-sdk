
package org.openapitools.client.model


case class AdResponse (
    /* ID of the ad group that contains the ad. */
    _adGroupId: Option[String],
    /* Deep link URL for Android devices. Not currently available. Using this field will generate an error. */
    _androidDeepLink: Option[String],
    /* Comma-separated deep links for the carousel pin on Android. */
    _carouselAndroidDeepLinks: Option[List[String]],
    /* Comma-separated destination URLs for the carousel pin to promote. */
    _carouselDestinationUrls: Option[List[String]],
    /* Comma-separated deep links for the carousel pin on iOS. */
    _carouselIosDeepLinks: Option[List[String]],
    /* Tracking url for the ad clicks. */
    _clickTrackingUrl: Option[String],
    /* Ad creative type enum */
    _creativeType: Option[String],
    /* Destination URL. */
    _destinationUrl: Option[String],
    /* Deep link URL for iOS devices. Not currently available. Using this field will generate an error. */
    _iosDeepLink: Option[String],
    /* Is original pin deleted? */
    _isPinDeleted: Option[Boolean],
    /* Is pin repinnable? */
    _isRemovable: Option[Boolean],
    /* Name of the ad - 255 chars max. */
    _name: Option[String],
    /* Pin ID. */
    _pinId: Option[String],
    _status: Option[EntityStatus],
    _trackingUrls: Option[TrackingUrls],
    /* Tracking URL for ad impressions. */
    _viewTrackingUrl: Option[String],
    /* The ID of the advertiser that this ad belongs to. */
    _adAccountId: Option[String],
    /* ID of the ad campaign that contains this ad. */
    _campaignId: Option[String],
    /* Destination URL template for all items within a collections drawer. */
    _collectionItemsDestinationUrlTemplate: Option[String],
    /* Pin creation time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* The ID of this ad. */
    _id: Option[String],
    /* Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
    _rejectedReasons: Option[List[String]],
    /* Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
    _rejectionLabels: Option[List[String]],
    /* Ad review status */
    _reviewStatus: Option[String],
    /* Always \"ad\". */
    _type: Option[String],
    /* Last update time. Unix timestamp in seconds. */
    _updatedTime: Option[Integer],
    /* Ad summary status */
    _summaryStatus: Option[PinPromotionSummaryStatus]
)
object AdResponse {
    def toStringBody(var_adGroupId: Object, var_androidDeepLink: Object, var_carouselAndroidDeepLinks: Object, var_carouselDestinationUrls: Object, var_carouselIosDeepLinks: Object, var_clickTrackingUrl: Object, var_creativeType: Object, var_destinationUrl: Object, var_iosDeepLink: Object, var_isPinDeleted: Object, var_isRemovable: Object, var_name: Object, var_pinId: Object, var_status: Object, var_trackingUrls: Object, var_viewTrackingUrl: Object, var_adAccountId: Object, var_campaignId: Object, var_collectionItemsDestinationUrlTemplate: Object, var_createdTime: Object, var_id: Object, var_rejectedReasons: Object, var_rejectionLabels: Object, var_reviewStatus: Object, var_type: Object, var_updatedTime: Object, var_summaryStatus: Object) =
        s"""
        | {
        | "adGroupId":$var_adGroupId,"androidDeepLink":$var_androidDeepLink,"carouselAndroidDeepLinks":$var_carouselAndroidDeepLinks,"carouselDestinationUrls":$var_carouselDestinationUrls,"carouselIosDeepLinks":$var_carouselIosDeepLinks,"clickTrackingUrl":$var_clickTrackingUrl,"creativeType":$var_creativeType,"destinationUrl":$var_destinationUrl,"iosDeepLink":$var_iosDeepLink,"isPinDeleted":$var_isPinDeleted,"isRemovable":$var_isRemovable,"name":$var_name,"pinId":$var_pinId,"status":$var_status,"trackingUrls":$var_trackingUrls,"viewTrackingUrl":$var_viewTrackingUrl,"adAccountId":$var_adAccountId,"campaignId":$var_campaignId,"collectionItemsDestinationUrlTemplate":$var_collectionItemsDestinationUrlTemplate,"createdTime":$var_createdTime,"id":$var_id,"rejectedReasons":$var_rejectedReasons,"rejectionLabels":$var_rejectionLabels,"reviewStatus":$var_reviewStatus,"type":$var_type,"updatedTime":$var_updatedTime,"summaryStatus":$var_summaryStatus
        | }
        """.stripMargin
}
