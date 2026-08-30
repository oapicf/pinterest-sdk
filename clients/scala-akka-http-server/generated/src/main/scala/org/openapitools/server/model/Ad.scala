package org.openapitools.server.model


/**
 * @param adAccountId The ID of the advertiser that this ad belongs to. for example: ''null''
 * @param adGroupId ID of the ad group that contains the ad. for example: ''null''
 * @param androidDeepLink Deep link URL for Android devices. for example: ''null''
 * @param campaignId ID of the ad campaign that contains this ad. for example: ''null''
 * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android. for example: ''null''
 * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote. for example: ''null''
 * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS. for example: ''null''
 * @param cartingPlatformType The vendor platform type of the carting/WTB ad. for example: ''null''
 * @param cartingProducts Array of carting/WTB products for the ad. for example: ''null''
 * @param clickTrackingUrl Tracking url for the ad clicks. for example: ''null''
 * @param collectionItemsDestinationUrlTemplate Destination URL template for all items within a collections drawer. for example: ''null''
 * @param collectionsHeaderType  for example: ''null''
 * @param createdTime Pin creation time. Unix timestamp in seconds. for example: ''null''
 * @param creativeType  for example: ''null''
 * @param customizableCtaType  for example: ''null''
 * @param destinationUrl Destination URL. for example: ''null''
 * @param disclosureType  for example: ''null''
 * @param disclosureUrl URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. for example: ''null''
 * @param gridClickType  for example: ''null''
 * @param id The ID of this ad. for example: ''null''
 * @param iosDeepLink Deep link URL for iOS devices. for example: ''null''
 * @param isCarting Is the ad a carting/WTB ad? for example: ''null''
 * @param isCollageAcceptedTerms Whether the advertiser has accepted the terms and conditions for collage ad. for example: ''null''
 * @param isCollageSingleDestination Whether the collage ad has a single destination url override. for example: ''null''
 * @param isPinDeleted Is original pin deleted? for example: ''null''
 * @param isRemovable Is pin repinnable? for example: ''null''
 * @param leadFormId Lead form ID for lead ad generation. for example: ''null''
 * @param name Name of the ad - 255 chars max. for example: ''null''
 * @param pinId Pin ID. This field may only be updated for draft ads. for example: ''null''
 * @param quizPinData Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. for example: ''null''
 * @param rejectedReasons Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\". for example: ''null''
 * @param rejectionLabels Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\". for example: ''null''
 * @param reviewStatus Ad review status for example: ''null''
 * @param status  for example: ''null''
 * @param summaryStatus Ad summary status for example: ''null''
 * @param trackingUrls  for example: ''null''
 * @param `type` Always \"ad\". for example: ''null''
 * @param updatedTime Last update time. Unix timestamp in seconds. for example: ''null''
 * @param viewTrackingUrl Tracking URL for ad impressions. for example: ''null''
*/
final case class Ad (
  adAccountId: String,
  adGroupId: String,
  androidDeepLink: Option[String] = None,
  campaignId: String,
  carouselAndroidDeepLinks: Option[Seq[String]] = None,
  carouselDestinationUrls: Option[Seq[String]] = None,
  carouselIosDeepLinks: Option[Seq[String]] = None,
  cartingPlatformType: Option[Int] = None,
  cartingProducts: Option[Seq[CartingProduct]] = None,
  clickTrackingUrl: Option[String] = None,
  collectionItemsDestinationUrlTemplate: Option[String] = None,
  collectionsHeaderType: Option[AdCollectionsHeaderType] = None,
  createdTime: Option[Int] = None,
  creativeType: CreativeType,
  customizableCtaType: Option[CustomizableCTAType] = None,
  destinationUrl: Option[String] = None,
  disclosureType: Option[DisclosureType] = None,
  disclosureUrl: Option[String] = None,
  gridClickType: Option[GridClickType] = None,
  id: String,
  iosDeepLink: Option[String] = None,
  isCarting: Option[Boolean] = None,
  isCollageAcceptedTerms: Option[Boolean] = None,
  isCollageSingleDestination: Option[Boolean] = None,
  isPinDeleted: Option[Boolean] = None,
  isRemovable: Option[Boolean] = None,
  leadFormId: Option[String] = None,
  name: Option[String] = None,
  pinId: String,
  quizPinData: Option[QuizPinData] = None,
  rejectedReasons: Seq[AdDisapprovalReasons],
  rejectionLabels: Seq[String],
  reviewStatus: AdReviewStatus,
  status: Option[EntityStatus] = None,
  summaryStatus: PinPromotionSummaryStatus,
  trackingUrls: Option[TrackingUrls] = None,
  `type`: String,
  updatedTime: Option[Int] = None,
  viewTrackingUrl: Option[String] = None
)

