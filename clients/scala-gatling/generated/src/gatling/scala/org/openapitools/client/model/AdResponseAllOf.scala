
package org.openapitools.client.model


case class AdResponseAllOf (
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
    _viewTrackingUrl: Option[String]
)
object AdResponseAllOf {
    def toStringBody(var_adGroupId: Object, var_androidDeepLink: Object, var_carouselAndroidDeepLinks: Object, var_carouselDestinationUrls: Object, var_carouselIosDeepLinks: Object, var_clickTrackingUrl: Object, var_creativeType: Object, var_destinationUrl: Object, var_iosDeepLink: Object, var_isPinDeleted: Object, var_isRemovable: Object, var_name: Object, var_pinId: Object, var_status: Object, var_trackingUrls: Object, var_viewTrackingUrl: Object) =
        s"""
        | {
        | "adGroupId":$var_adGroupId,"androidDeepLink":$var_androidDeepLink,"carouselAndroidDeepLinks":$var_carouselAndroidDeepLinks,"carouselDestinationUrls":$var_carouselDestinationUrls,"carouselIosDeepLinks":$var_carouselIosDeepLinks,"clickTrackingUrl":$var_clickTrackingUrl,"creativeType":$var_creativeType,"destinationUrl":$var_destinationUrl,"iosDeepLink":$var_iosDeepLink,"isPinDeleted":$var_isPinDeleted,"isRemovable":$var_isRemovable,"name":$var_name,"pinId":$var_pinId,"status":$var_status,"trackingUrls":$var_trackingUrls,"viewTrackingUrl":$var_viewTrackingUrl
        | }
        """.stripMargin
}
