package org.openapitools.server.model


/**
 * @param adGroupId ID of the ad group that contains the ad. for example: ''2680059592705''
 * @param androidDeepLink Deep link URL for Android devices. for example: ''null''
 * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android. for example: ''null''
 * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote. for example: ''null''
 * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS. for example: ''null''
 * @param clickTrackingUrl Tracking url for the ad clicks. for example: ''null''
 * @param creativeType  for example: ''null''
 * @param destinationUrl Destination URL. for example: ''null''
 * @param iosDeepLink Deep link URL for iOS devices. for example: ''null''
 * @param isPinDeleted Is original pin deleted? for example: ''false''
 * @param isRemovable Is pin repinnable? for example: ''false''
 * @param name Name of the ad - 255 chars max. for example: ''null''
 * @param status  for example: ''null''
 * @param trackingUrls  for example: ''null''
 * @param viewTrackingUrl Tracking URL for ad impressions. for example: ''null''
 * @param leadFormId Lead form ID for lead ad generation. for example: ''null''
 * @param gridClickType  for example: ''null''
 * @param customizableCtaType Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) for example: ''LEARN_MORE''
 * @param quizPinData Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. for example: ''null''
 * @param pinId Pin ID. for example: ''394205773611545468''
 * @param adAccountId The ID of the advertiser that this ad belongs to. for example: ''549755885175''
 * @param campaignId ID of the ad campaign that contains this ad. for example: ''626735565838''
 * @param collectionItemsDestinationUrlTemplate Destination URL template for all items within a collections drawer. for example: ''null''
 * @param createdTime Pin creation time. Unix timestamp in seconds. for example: ''1451431341''
 * @param id The ID of this ad. for example: ''687195134316''
 * @param rejectedReasons Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". for example: ''null''
 * @param rejectionLabels Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". for example: ''null''
 * @param reviewStatus Ad review status for example: ''PENDING''
 * @param `type` Always \"ad\". for example: ''pinpromotion''
 * @param updatedTime Last update time. Unix timestamp in seconds. for example: ''1451431341''
 * @param summaryStatus Ad summary status for example: ''null''
*/
final case class AdResponse (
  adGroupId: Option[String] = None,
  androidDeepLink: Option[String] = None,
  carouselAndroidDeepLinks: Option[Seq[String]] = None,
  carouselDestinationUrls: Option[Seq[String]] = None,
  carouselIosDeepLinks: Option[Seq[String]] = None,
  clickTrackingUrl: Option[String] = None,
  creativeType: Option[CreativeType] = None,
  destinationUrl: Option[String] = None,
  iosDeepLink: Option[String] = None,
  isPinDeleted: Option[Boolean] = None,
  isRemovable: Option[Boolean] = None,
  name: Option[String] = None,
  status: Option[EntityStatus] = None,
  trackingUrls: Option[TrackingUrls] = None,
  viewTrackingUrl: Option[String] = None,
  leadFormId: Option[String] = None,
  gridClickType: Option[GridClickType] = None,
  customizableCtaType: Option[String] = None,
  quizPinData: Option[QuizPinData] = None,
  pinId: Option[String] = None,
  adAccountId: Option[String] = None,
  campaignId: Option[String] = None,
  collectionItemsDestinationUrlTemplate: Option[String] = None,
  createdTime: Option[Int] = None,
  id: Option[String] = None,
  rejectedReasons: Option[Seq[String]] = None,
  rejectionLabels: Option[Seq[String]] = None,
  reviewStatus: Option[String] = None,
  `type`: Option[String] = None,
  updatedTime: Option[Int] = None,
  summaryStatus: Option[PinPromotionSummaryStatus] = None
)

