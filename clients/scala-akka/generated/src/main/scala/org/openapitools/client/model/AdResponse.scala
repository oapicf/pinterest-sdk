/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class AdResponse (
  /* ID of the ad group that contains the ad. */
  adGroupId: Option[String] = None,
  /* Deep link URL for Android devices. */
  androidDeepLink: Option[String] = None,
  /* Comma-separated deep links for the carousel pin on Android. */
  carouselAndroidDeepLinks: Option[Seq[String]] = None,
  /* Comma-separated destination URLs for the carousel pin to promote. */
  carouselDestinationUrls: Option[Seq[String]] = None,
  /* Comma-separated deep links for the carousel pin on iOS. */
  carouselIosDeepLinks: Option[Seq[String]] = None,
  /* Tracking url for the ad clicks. */
  clickTrackingUrl: Option[String] = None,
  creativeType: Option[CreativeType] = None,
  /* Destination URL. */
  destinationUrl: Option[String] = None,
  /* Deep link URL for iOS devices. */
  iosDeepLink: Option[String] = None,
  /* Is original pin deleted? */
  isPinDeleted: Option[Boolean] = None,
  /* Is pin repinnable? */
  isRemovable: Option[Boolean] = None,
  /* Name of the ad - 255 chars max. */
  name: Option[String] = None,
  status: Option[EntityStatus] = None,
  trackingUrls: Option[TrackingUrls] = None,
  /* Tracking URL for ad impressions. */
  viewTrackingUrl: Option[String] = None,
  /* Lead form ID for lead ad generation. */
  leadFormId: Option[String] = None,
  gridClickType: Option[GridClickType] = None,
  /* Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) */
  customizableCtaType: Option[AdResponseEnums.CustomizableCtaType] = None,
  /* Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. */
  quizPinData: Option[QuizPinData] = None,
  /* Pin ID. */
  pinId: Option[String] = None,
  /* The ID of the advertiser that this ad belongs to. */
  adAccountId: Option[String] = None,
  /* ID of the ad campaign that contains this ad. */
  campaignId: Option[String] = None,
  /* Destination URL template for all items within a collections drawer. */
  collectionItemsDestinationUrlTemplate: Option[String] = None,
  /* Pin creation time. Unix timestamp in seconds. */
  createdTime: Option[Int] = None,
  /* The ID of this ad. */
  id: Option[String] = None,
  /* Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
  rejectedReasons: Option[AdResponseEnums.Seq[RejectedReasons]] = None,
  /* Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
  rejectionLabels: Option[Seq[String]] = None,
  /* Ad review status */
  reviewStatus: Option[AdResponseEnums.ReviewStatus] = None,
  /* Always \"ad\". */
  `type`: Option[String] = None,
  /* Last update time. Unix timestamp in seconds. */
  updatedTime: Option[Int] = None,
  /* Ad summary status */
  summaryStatus: Option[PinPromotionSummaryStatus] = None
) extends ApiModel

object AdResponseEnums {

  type CustomizableCtaType = CustomizableCtaType.Value
  type Seq[RejectedReasons] = Seq[RejectedReasons].Value
  type ReviewStatus = ReviewStatus.Value
  object CustomizableCtaType extends Enumeration {
    val GETOFFER = Value("GET_OFFER")
    val LEARNMORE = Value("LEARN_MORE")
    val ORDERNOW = Value("ORDER_NOW")
    val SHOPNOW = Value("SHOP_NOW")
    val SIGNUP = Value("SIGN_UP")
    val SUBSCRIBE = Value("SUBSCRIBE")
    val BUYNOW = Value("BUY_NOW")
    val CONTACTUS = Value("CONTACT_US")
    val GETQUOTE = Value("GET_QUOTE")
    val VISITSITE = Value("VISIT_SITE")
    val APPLYNOW = Value("APPLY_NOW")
    val BOOKNOW = Value("BOOK_NOW")
    val REQUESTDEMO = Value("REQUEST_DEMO")
    val REGISTERNOW = Value("REGISTER_NOW")
    val FINDADEALER = Value("FIND_A_DEALER")
    val ADDTOCART = Value("ADD_TO_CART")
    val WATCHNOW = Value("WATCH_NOW")
    val READMORE = Value("READ_MORE")
  }

  object Seq[RejectedReasons] extends Enumeration {
  }

  object ReviewStatus extends Enumeration {
    val OTHER = Value("OTHER")
    val PENDING = Value("PENDING")
    val REJECTED = Value("REJECTED")
    val APPROVED = Value("APPROVED")
  }

}
