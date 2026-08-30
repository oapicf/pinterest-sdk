package org.openapitools.server.model


/**
 * @param id The ID of this ad. for example: ''null''
 * @param pinId Pin ID. This field may only be updated for draft ads. for example: ''null''
 * @param adGroupId ID of the ad group that contains the ad. for example: ''null''
 * @param androidDeepLink Deep link URL for Android devices. for example: ''null''
 * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android. for example: ''null''
 * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote. for example: ''null''
 * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS. for example: ''null''
 * @param clickTrackingUrl Tracking url for the ad clicks. for example: ''null''
 * @param creativeType  for example: ''null''
 * @param customizableCtaType  for example: ''null''
 * @param destinationUrl Destination URL. for example: ''null''
 * @param disclosureType  for example: ''null''
 * @param disclosureUrl URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. for example: ''null''
 * @param gridClickType  for example: ''null''
 * @param iosDeepLink Deep link URL for iOS devices. for example: ''null''
 * @param isCarting Is the ad a carting/WTB ad? for example: ''null''
 * @param isPinDeleted Is original pin deleted? for example: ''false''
 * @param isRemovable Is pin repinnable? for example: ''false''
 * @param leadFormId Lead form ID for lead ad generation. for example: ''null''
 * @param name Name of the ad - 255 chars max. for example: ''null''
 * @param quizPinData Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. for example: ''null''
 * @param status  for example: ''null''
 * @param trackingUrls  for example: ''null''
 * @param viewTrackingUrl Tracking URL for ad impressions. for example: ''null''
*/
final case class AdUpdateRequest (
  id: String,
  pinId: Option[String] = None,
  adGroupId: Option[String] = None,
  androidDeepLink: Option[String] = None,
  carouselAndroidDeepLinks: Option[Seq[String]] = None,
  carouselDestinationUrls: Option[Seq[String]] = None,
  carouselIosDeepLinks: Option[Seq[String]] = None,
  clickTrackingUrl: Option[String] = None,
  creativeType: Option[CreativeType] = None,
  customizableCtaType: Option[CustomizableCTAType] = None,
  destinationUrl: Option[String] = None,
  disclosureType: Option[DisclosureType] = None,
  disclosureUrl: Option[String] = None,
  gridClickType: Option[GridClickType] = None,
  iosDeepLink: Option[String] = None,
  isCarting: Option[Boolean] = None,
  isPinDeleted: Option[Boolean] = None,
  isRemovable: Option[Boolean] = None,
  leadFormId: Option[String] = None,
  name: Option[String] = None,
  quizPinData: Option[Any] = None,
  status: Option[EntityStatus] = None,
  trackingUrls: Option[Any] = None,
  viewTrackingUrl: Option[String] = None
)

