package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdCreateRequest._

case class AdCreateRequest (
  /* ID of the ad group that contains the ad. */
  adGroupId: String,
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
creativeType: CreativeType,
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
  pinId: String)

object AdCreateRequest {
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

  implicit val AdCreateRequestCodecJson: CodecJson[AdCreateRequest] = CodecJson.derive[AdCreateRequest]
  implicit val AdCreateRequestDecoder: EntityDecoder[AdCreateRequest] = jsonOf[AdCreateRequest]
  implicit val AdCreateRequestEncoder: EntityEncoder[AdCreateRequest] = jsonEncoderOf[AdCreateRequest]
}
