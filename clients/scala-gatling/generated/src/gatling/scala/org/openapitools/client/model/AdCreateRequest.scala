
package org.openapitools.client.model


case class AdCreateRequest (
    /* ID of the ad group that contains the ad. */
    _adGroupId: String,
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
    _creativeType: CreativeType,
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
    _status: Option[EntityStatus],
    _trackingUrls: Option[AdCommonTrackingUrls],
    /* Tracking URL for ad impressions. */
    _viewTrackingUrl: Option[String],
    /* Lead form ID for lead ad generation. */
    _leadFormId: Option[String],
    _gridClickType: Option[GridClickType],
    /* Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) */
    _customizableCtaType: Option[String],
    _quizPinData: Option[AdCommonQuizPinData],
    /* Pin ID. */
    _pinId: String
)
object AdCreateRequest {
    def toStringBody(var_adGroupId: Object, var_androidDeepLink: Object, var_carouselAndroidDeepLinks: Object, var_carouselDestinationUrls: Object, var_carouselIosDeepLinks: Object, var_clickTrackingUrl: Object, var_creativeType: Object, var_destinationUrl: Object, var_iosDeepLink: Object, var_isPinDeleted: Object, var_isRemovable: Object, var_name: Object, var_status: Object, var_trackingUrls: Object, var_viewTrackingUrl: Object, var_leadFormId: Object, var_gridClickType: Object, var_customizableCtaType: Object, var_quizPinData: Object, var_pinId: Object) =
        s"""
        | {
        | "adGroupId":$var_adGroupId,"androidDeepLink":$var_androidDeepLink,"carouselAndroidDeepLinks":$var_carouselAndroidDeepLinks,"carouselDestinationUrls":$var_carouselDestinationUrls,"carouselIosDeepLinks":$var_carouselIosDeepLinks,"clickTrackingUrl":$var_clickTrackingUrl,"creativeType":$var_creativeType,"destinationUrl":$var_destinationUrl,"iosDeepLink":$var_iosDeepLink,"isPinDeleted":$var_isPinDeleted,"isRemovable":$var_isRemovable,"name":$var_name,"status":$var_status,"trackingUrls":$var_trackingUrls,"viewTrackingUrl":$var_viewTrackingUrl,"leadFormId":$var_leadFormId,"gridClickType":$var_gridClickType,"customizableCtaType":$var_customizableCtaType,"quizPinData":$var_quizPinData,"pinId":$var_pinId
        | }
        """.stripMargin
}
