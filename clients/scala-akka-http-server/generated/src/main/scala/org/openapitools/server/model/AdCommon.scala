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
 * @param creativeType  for example: ''null''
 * @param destinationUrl Destination URL. for example: ''null''
 * @param iosDeepLink Deep link URL for iOS devices. Not currently available. Using this field will generate an error. for example: ''null''
 * @param isPinDeleted Is original pin deleted? for example: ''false''
 * @param isRemovable Is pin repinnable? for example: ''false''
 * @param name Name of the ad - 255 chars max. for example: ''null''
 * @param status  for example: ''null''
 * @param trackingUrls  for example: ''null''
 * @param viewTrackingUrl Tracking URL for ad impressions. for example: ''null''
 * @param leadFormId Lead form ID for lead ad generation. for example: ''null''
 * @param gridClickType  for example: ''null''
 * @param customizableCtaType Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) for example: ''LEARN_MORE''
 * @param quizPinData  for example: ''null''
*/
final case class AdCommon (
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
  trackingUrls: Option[AdCommonTrackingUrls] = None,
  viewTrackingUrl: Option[String] = None,
  leadFormId: Option[String] = None,
  gridClickType: Option[GridClickType] = None,
  customizableCtaType: Option[String] = None,
  quizPinData: Option[AdCommonQuizPinData] = None
)

