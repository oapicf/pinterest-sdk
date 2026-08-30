
package org.openapitools.client.model


case class AdUpdateRequest (
    /* The ID of this ad. */
    _id: String,
    /* Pin ID. This field may only be updated for draft ads. */
    _pinId: Option[String],
    /* ID of the ad group that contains the ad. */
    _adGroupId: Option[String],
    /* Deep link URL for Android devices. */
    _androidDeepLink: Option[String],
    /* Comma-separated deep links for the carousel pin on Android. */
    _carouselAndroidDeepLinks: Option[List[String]],
    /* Comma-separated destination URLs for the carousel pin to promote. */
    _carouselDestinationUrls: Option[List[String]],
    /* Comma-separated deep links for the carousel pin on iOS. */
    _carouselIosDeepLinks: Option[List[String]],
    /* Tracking url for the ad clicks. */
    _clickTrackingUrl: Option[String],
    _creativeType: Option[CreativeType],
    _customizableCtaType: Option[CustomizableCTAType],
    /* Destination URL. */
    _destinationUrl: Option[String],
    _disclosureType: Option[DisclosureType],
    /* URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. */
    _disclosureUrl: Option[String],
    _gridClickType: Option[GridClickType],
    /* Deep link URL for iOS devices. */
    _iosDeepLink: Option[String],
    /* Is the ad a carting/WTB ad? */
    _isCarting: Option[Boolean],
    /* Is original pin deleted? */
    _isPinDeleted: Option[Boolean],
    /* Is pin repinnable? */
    _isRemovable: Option[Boolean],
    /* Lead form ID for lead ad generation. */
    _leadFormId: Option[String],
    /* Name of the ad - 255 chars max. */
    _name: Option[String],
    /* Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. */
    _quizPinData: Option[Any],
    _status: Option[EntityStatus],
    _trackingUrls: Option[Any],
    /* Tracking URL for ad impressions. */
    _viewTrackingUrl: Option[String]
)
object AdUpdateRequest {
    def toStringBody(var_id: Object, var_pinId: Object, var_adGroupId: Object, var_androidDeepLink: Object, var_carouselAndroidDeepLinks: Object, var_carouselDestinationUrls: Object, var_carouselIosDeepLinks: Object, var_clickTrackingUrl: Object, var_creativeType: Object, var_customizableCtaType: Object, var_destinationUrl: Object, var_disclosureType: Object, var_disclosureUrl: Object, var_gridClickType: Object, var_iosDeepLink: Object, var_isCarting: Object, var_isPinDeleted: Object, var_isRemovable: Object, var_leadFormId: Object, var_name: Object, var_quizPinData: Object, var_status: Object, var_trackingUrls: Object, var_viewTrackingUrl: Object) =
        s"""
        | {
        | "id":$var_id,"pinId":$var_pinId,"adGroupId":$var_adGroupId,"androidDeepLink":$var_androidDeepLink,"carouselAndroidDeepLinks":$var_carouselAndroidDeepLinks,"carouselDestinationUrls":$var_carouselDestinationUrls,"carouselIosDeepLinks":$var_carouselIosDeepLinks,"clickTrackingUrl":$var_clickTrackingUrl,"creativeType":$var_creativeType,"customizableCtaType":$var_customizableCtaType,"destinationUrl":$var_destinationUrl,"disclosureType":$var_disclosureType,"disclosureUrl":$var_disclosureUrl,"gridClickType":$var_gridClickType,"iosDeepLink":$var_iosDeepLink,"isCarting":$var_isCarting,"isPinDeleted":$var_isPinDeleted,"isRemovable":$var_isRemovable,"leadFormId":$var_leadFormId,"name":$var_name,"quizPinData":$var_quizPinData,"status":$var_status,"trackingUrls":$var_trackingUrls,"viewTrackingUrl":$var_viewTrackingUrl
        | }
        """.stripMargin
}
