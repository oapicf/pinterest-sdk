
package org.openapitools.client.model


case class Ad (
    /* The ID of the advertiser that this ad belongs to. */
    _adAccountId: String,
    /* ID of the ad group that contains the ad. */
    _adGroupId: String,
    /* Deep link URL for Android devices. */
    _androidDeepLink: Option[String],
    /* ID of the ad campaign that contains this ad. */
    _campaignId: String,
    /* Comma-separated deep links for the carousel pin on Android. */
    _carouselAndroidDeepLinks: Option[List[String]],
    /* Comma-separated destination URLs for the carousel pin to promote. */
    _carouselDestinationUrls: Option[List[String]],
    /* Comma-separated deep links for the carousel pin on iOS. */
    _carouselIosDeepLinks: Option[List[String]],
    /* The vendor platform type of the carting/WTB ad. */
    _cartingPlatformType: Option[Integer],
    /* Array of carting/WTB products for the ad. */
    _cartingProducts: Option[List[CartingProduct]],
    /* Tracking url for the ad clicks. */
    _clickTrackingUrl: Option[String],
    /* Destination URL template for all items within a collections drawer. */
    _collectionItemsDestinationUrlTemplate: Option[String],
    _collectionsHeaderType: Option[AdCollectionsHeaderType],
    /* Pin creation time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    _creativeType: CreativeType,
    _customizableCtaType: Option[CustomizableCTAType],
    /* Destination URL. */
    _destinationUrl: Option[String],
    _disclosureType: Option[DisclosureType],
    /* URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. */
    _disclosureUrl: Option[String],
    _gridClickType: Option[GridClickType],
    /* The ID of this ad. */
    _id: String,
    /* Deep link URL for iOS devices. */
    _iosDeepLink: Option[String],
    /* Is the ad a carting/WTB ad? */
    _isCarting: Option[Boolean],
    /* Whether the advertiser has accepted the terms and conditions for collage ad. */
    _isCollageAcceptedTerms: Option[Boolean],
    /* Whether the collage ad has a single destination url override. */
    _isCollageSingleDestination: Option[Boolean],
    /* Is original pin deleted? */
    _isPinDeleted: Option[Boolean],
    /* Is pin repinnable? */
    _isRemovable: Option[Boolean],
    /* Lead form ID for lead ad generation. */
    _leadFormId: Option[String],
    /* Name of the ad - 255 chars max. */
    _name: Option[String],
    /* Pin ID. This field may only be updated for draft ads. */
    _pinId: String,
    /* Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. */
    _quizPinData: Option[QuizPinData],
    /* Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\". */
    _rejectedReasons: List[AdDisapprovalReasons],
    /* Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\". */
    _rejectionLabels: List[String],
    /* Ad review status */
    _reviewStatus: AdReviewStatus,
    _status: Option[EntityStatus],
    /* Ad summary status */
    _summaryStatus: PinPromotionSummaryStatus,
    _trackingUrls: Option[TrackingUrls],
    /* Always \"ad\". */
    _type: String,
    /* Last update time. Unix timestamp in seconds. */
    _updatedTime: Option[Integer],
    /* Tracking URL for ad impressions. */
    _viewTrackingUrl: Option[String]
)
object Ad {
    def toStringBody(var_adAccountId: Object, var_adGroupId: Object, var_androidDeepLink: Object, var_campaignId: Object, var_carouselAndroidDeepLinks: Object, var_carouselDestinationUrls: Object, var_carouselIosDeepLinks: Object, var_cartingPlatformType: Object, var_cartingProducts: Object, var_clickTrackingUrl: Object, var_collectionItemsDestinationUrlTemplate: Object, var_collectionsHeaderType: Object, var_createdTime: Object, var_creativeType: Object, var_customizableCtaType: Object, var_destinationUrl: Object, var_disclosureType: Object, var_disclosureUrl: Object, var_gridClickType: Object, var_id: Object, var_iosDeepLink: Object, var_isCarting: Object, var_isCollageAcceptedTerms: Object, var_isCollageSingleDestination: Object, var_isPinDeleted: Object, var_isRemovable: Object, var_leadFormId: Object, var_name: Object, var_pinId: Object, var_quizPinData: Object, var_rejectedReasons: Object, var_rejectionLabels: Object, var_reviewStatus: Object, var_status: Object, var_summaryStatus: Object, var_trackingUrls: Object, var_type: Object, var_updatedTime: Object, var_viewTrackingUrl: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"adGroupId":$var_adGroupId,"androidDeepLink":$var_androidDeepLink,"campaignId":$var_campaignId,"carouselAndroidDeepLinks":$var_carouselAndroidDeepLinks,"carouselDestinationUrls":$var_carouselDestinationUrls,"carouselIosDeepLinks":$var_carouselIosDeepLinks,"cartingPlatformType":$var_cartingPlatformType,"cartingProducts":$var_cartingProducts,"clickTrackingUrl":$var_clickTrackingUrl,"collectionItemsDestinationUrlTemplate":$var_collectionItemsDestinationUrlTemplate,"collectionsHeaderType":$var_collectionsHeaderType,"createdTime":$var_createdTime,"creativeType":$var_creativeType,"customizableCtaType":$var_customizableCtaType,"destinationUrl":$var_destinationUrl,"disclosureType":$var_disclosureType,"disclosureUrl":$var_disclosureUrl,"gridClickType":$var_gridClickType,"id":$var_id,"iosDeepLink":$var_iosDeepLink,"isCarting":$var_isCarting,"isCollageAcceptedTerms":$var_isCollageAcceptedTerms,"isCollageSingleDestination":$var_isCollageSingleDestination,"isPinDeleted":$var_isPinDeleted,"isRemovable":$var_isRemovable,"leadFormId":$var_leadFormId,"name":$var_name,"pinId":$var_pinId,"quizPinData":$var_quizPinData,"rejectedReasons":$var_rejectedReasons,"rejectionLabels":$var_rejectionLabels,"reviewStatus":$var_reviewStatus,"status":$var_status,"summaryStatus":$var_summaryStatus,"trackingUrls":$var_trackingUrls,"type":$var_type,"updatedTime":$var_updatedTime,"viewTrackingUrl":$var_viewTrackingUrl
        | }
        """.stripMargin
}
