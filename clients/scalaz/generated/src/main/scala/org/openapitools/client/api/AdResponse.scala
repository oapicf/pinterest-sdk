package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdResponse._

case class AdResponse (
  /* ID of the ad group that contains the ad. */
  adGroupId: Option[String],
/* Deep link URL for Android devices. */
  androidDeepLink: Option[String],
/* Comma-separated deep links for the carousel pin on Android. */
  carouselAndroidDeepLinks: Option[List[String]],
/* Comma-separated destination URLs for the carousel pin to promote. */
  carouselDestinationUrls: Option[List[String]],
/* Comma-separated deep links for the carousel pin on iOS. */
  carouselIosDeepLinks: Option[List[String]],
/* Tracking url for the ad clicks. */
  clickTrackingUrl: Option[String],
creativeType: Option[CreativeType],
/* Destination URL. */
  destinationUrl: Option[String],
/* Deep link URL for iOS devices. */
  iosDeepLink: Option[String],
/* Is original pin deleted? */
  isPinDeleted: Option[Boolean],
/* Is pin repinnable? */
  isRemovable: Option[Boolean],
/* Name of the ad - 255 chars max. */
  name: Option[String],
status: Option[EntityStatus],
trackingUrls: Option[TrackingUrls],
/* Tracking URL for ad impressions. */
  viewTrackingUrl: Option[String],
/* Lead form ID for lead ad generation. */
  leadFormId: Option[String],
gridClickType: Option[GridClickType],
/* Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) */
  customizableCtaType: Option[CustomizableCtaType],
/* Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. */
  quizPinData: Option[QuizPinData],
/* Pin ID. */
  pinId: Option[String],
/* The ID of the advertiser that this ad belongs to. */
  adAccountId: Option[String],
/* ID of the ad campaign that contains this ad. */
  campaignId: Option[String],
/* Destination URL template for all items within a collections drawer. */
  collectionItemsDestinationUrlTemplate: Option[String],
/* Pin creation time. Unix timestamp in seconds. */
  createdTime: Option[Integer],
/* The ID of this ad. */
  id: Option[String],
/* Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
  rejectedReasons: Option[List[RejectedReasons]],
/* Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
  rejectionLabels: Option[List[String]],
/* Ad review status */
  reviewStatus: Option[ReviewStatus],
/* Always \"ad\". */
  `type`: Option[String],
/* Last update time. Unix timestamp in seconds. */
  updatedTime: Option[Integer],
/* Ad summary status */
  summaryStatus: Option[PinPromotionSummaryStatus])

object AdResponse {
  import DateTimeCodecs._
  sealed trait CustomizableCtaType
  case object GETOFFER extends CustomizableCtaType
  case object LEARNMORE extends CustomizableCtaType
  case object ORDERNOW extends CustomizableCtaType
  case object SHOPNOW extends CustomizableCtaType
  case object SIGNUP extends CustomizableCtaType
  case object SUBSCRIBE extends CustomizableCtaType
  case object BUYNOW extends CustomizableCtaType
  case object CONTACTUS extends CustomizableCtaType
  case object GETQUOTE extends CustomizableCtaType
  case object VISITSITE extends CustomizableCtaType
  case object APPLYNOW extends CustomizableCtaType
  case object BOOKNOW extends CustomizableCtaType
  case object REQUESTDEMO extends CustomizableCtaType
  case object REGISTERNOW extends CustomizableCtaType
  case object FINDADEALER extends CustomizableCtaType
  case object ADDTOCART extends CustomizableCtaType
  case object WATCHNOW extends CustomizableCtaType
  case object READMORE extends CustomizableCtaType

  object CustomizableCtaType {
    def toCustomizableCtaType(s: String): Option[CustomizableCtaType] = s match {
      case "GETOFFER" => Some(GETOFFER)
      case "LEARNMORE" => Some(LEARNMORE)
      case "ORDERNOW" => Some(ORDERNOW)
      case "SHOPNOW" => Some(SHOPNOW)
      case "SIGNUP" => Some(SIGNUP)
      case "SUBSCRIBE" => Some(SUBSCRIBE)
      case "BUYNOW" => Some(BUYNOW)
      case "CONTACTUS" => Some(CONTACTUS)
      case "GETQUOTE" => Some(GETQUOTE)
      case "VISITSITE" => Some(VISITSITE)
      case "APPLYNOW" => Some(APPLYNOW)
      case "BOOKNOW" => Some(BOOKNOW)
      case "REQUESTDEMO" => Some(REQUESTDEMO)
      case "REGISTERNOW" => Some(REGISTERNOW)
      case "FINDADEALER" => Some(FINDADEALER)
      case "ADDTOCART" => Some(ADDTOCART)
      case "WATCHNOW" => Some(WATCHNOW)
      case "READMORE" => Some(READMORE)
      case _ => None
    }

    def fromCustomizableCtaType(x: CustomizableCtaType): String = x match {
      case GETOFFER => "GETOFFER"
      case LEARNMORE => "LEARNMORE"
      case ORDERNOW => "ORDERNOW"
      case SHOPNOW => "SHOPNOW"
      case SIGNUP => "SIGNUP"
      case SUBSCRIBE => "SUBSCRIBE"
      case BUYNOW => "BUYNOW"
      case CONTACTUS => "CONTACTUS"
      case GETQUOTE => "GETQUOTE"
      case VISITSITE => "VISITSITE"
      case APPLYNOW => "APPLYNOW"
      case BOOKNOW => "BOOKNOW"
      case REQUESTDEMO => "REQUESTDEMO"
      case REGISTERNOW => "REGISTERNOW"
      case FINDADEALER => "FINDADEALER"
      case ADDTOCART => "ADDTOCART"
      case WATCHNOW => "WATCHNOW"
      case READMORE => "READMORE"
    }
  }

  implicit val CustomizableCtaTypeEnumEncoder: EncodeJson[CustomizableCtaType] =
    EncodeJson[CustomizableCtaType](is => StringEncodeJson(CustomizableCtaType.fromCustomizableCtaType(is)))

  implicit val CustomizableCtaTypeEnumDecoder: DecodeJson[CustomizableCtaType] =
    DecodeJson.optionDecoder[CustomizableCtaType](n => n.string.flatMap(jStr => CustomizableCtaType.toCustomizableCtaType(jStr)), "CustomizableCtaType failed to de-serialize")
  sealed trait List[RejectedReasons]

  object List[RejectedReasons] {
    def toList[RejectedReasons](s: String): Option[List[RejectedReasons]] = s match {
      case _ => None
    }

    def fromList[RejectedReasons](x: List[RejectedReasons]): String = x match {
    }
  }

  implicit val List[RejectedReasons]EnumEncoder: EncodeJson[List[RejectedReasons]] =
    EncodeJson[List[RejectedReasons]](is => StringEncodeJson(List[RejectedReasons].fromList[RejectedReasons](is)))

  implicit val List[RejectedReasons]EnumDecoder: DecodeJson[List[RejectedReasons]] =
    DecodeJson.optionDecoder[List[RejectedReasons]](n => n.string.flatMap(jStr => List[RejectedReasons].toList[RejectedReasons](jStr)), "List[RejectedReasons] failed to de-serialize")
  sealed trait ReviewStatus
  case object OTHER extends ReviewStatus
  case object PENDING extends ReviewStatus
  case object REJECTED extends ReviewStatus
  case object APPROVED extends ReviewStatus

  object ReviewStatus {
    def toReviewStatus(s: String): Option[ReviewStatus] = s match {
      case "OTHER" => Some(OTHER)
      case "PENDING" => Some(PENDING)
      case "REJECTED" => Some(REJECTED)
      case "APPROVED" => Some(APPROVED)
      case _ => None
    }

    def fromReviewStatus(x: ReviewStatus): String = x match {
      case OTHER => "OTHER"
      case PENDING => "PENDING"
      case REJECTED => "REJECTED"
      case APPROVED => "APPROVED"
    }
  }

  implicit val ReviewStatusEnumEncoder: EncodeJson[ReviewStatus] =
    EncodeJson[ReviewStatus](is => StringEncodeJson(ReviewStatus.fromReviewStatus(is)))

  implicit val ReviewStatusEnumDecoder: DecodeJson[ReviewStatus] =
    DecodeJson.optionDecoder[ReviewStatus](n => n.string.flatMap(jStr => ReviewStatus.toReviewStatus(jStr)), "ReviewStatus failed to de-serialize")

  implicit val AdResponseCodecJson: CodecJson[AdResponse] = CodecJson.derive[AdResponse]
  implicit val AdResponseDecoder: EntityDecoder[AdResponse] = jsonOf[AdResponse]
  implicit val AdResponseEncoder: EntityEncoder[AdResponse] = jsonEncoderOf[AdResponse]
}
