package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OptimizationGoalMetadataConversionTagV3GoalMetadata._

case class OptimizationGoalMetadataConversionTagV3GoalMetadata (
  attributionWindows: Option[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows],
conversionEvent: Option[ConversionEvent],
conversionTagId: Option[String],
cpaGoalValueInMicroCurrency: Option[String],
/* Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>. */
  isRoasOptimized: Option[Boolean],
/* Conversion learning model type */
  learningModeType: Option[LearningModeType],
/* Event name for custom or standard events mapped to an oCPM model */
  reportingEvent: Option[String])

object OptimizationGoalMetadataConversionTagV3GoalMetadata {
  import DateTimeCodecs._
  sealed trait ConversionEvent
  case object PAGEVISIT extends ConversionEvent
  case object SIGNUP extends ConversionEvent
  case object CHECKOUT extends ConversionEvent
  case object CUSTOM extends ConversionEvent
  case object VIEWCATEGORY extends ConversionEvent
  case object SEARCH extends ConversionEvent
  case object ADDTOCART extends ConversionEvent
  case object WATCHVIDEO extends ConversionEvent
  case object LEAD extends ConversionEvent
  case object APPINSTALL extends ConversionEvent

  object ConversionEvent {
    def toConversionEvent(s: String): Option[ConversionEvent] = s match {
      case "PAGEVISIT" => Some(PAGEVISIT)
      case "SIGNUP" => Some(SIGNUP)
      case "CHECKOUT" => Some(CHECKOUT)
      case "CUSTOM" => Some(CUSTOM)
      case "VIEWCATEGORY" => Some(VIEWCATEGORY)
      case "SEARCH" => Some(SEARCH)
      case "ADDTOCART" => Some(ADDTOCART)
      case "WATCHVIDEO" => Some(WATCHVIDEO)
      case "LEAD" => Some(LEAD)
      case "APPINSTALL" => Some(APPINSTALL)
      case _ => None
    }

    def fromConversionEvent(x: ConversionEvent): String = x match {
      case PAGEVISIT => "PAGEVISIT"
      case SIGNUP => "SIGNUP"
      case CHECKOUT => "CHECKOUT"
      case CUSTOM => "CUSTOM"
      case VIEWCATEGORY => "VIEWCATEGORY"
      case SEARCH => "SEARCH"
      case ADDTOCART => "ADDTOCART"
      case WATCHVIDEO => "WATCHVIDEO"
      case LEAD => "LEAD"
      case APPINSTALL => "APPINSTALL"
    }
  }

  implicit val ConversionEventEnumEncoder: EncodeJson[ConversionEvent] =
    EncodeJson[ConversionEvent](is => StringEncodeJson(ConversionEvent.fromConversionEvent(is)))

  implicit val ConversionEventEnumDecoder: DecodeJson[ConversionEvent] =
    DecodeJson.optionDecoder[ConversionEvent](n => n.string.flatMap(jStr => ConversionEvent.toConversionEvent(jStr)), "ConversionEvent failed to de-serialize")
  sealed trait LearningModeType
  case object NOTACTIVE extends LearningModeType
  case object ACTIVE extends LearningModeType

  object LearningModeType {
    def toLearningModeType(s: String): Option[LearningModeType] = s match {
      case "NOTACTIVE" => Some(NOTACTIVE)
      case "ACTIVE" => Some(ACTIVE)
      case _ => None
    }

    def fromLearningModeType(x: LearningModeType): String = x match {
      case NOTACTIVE => "NOTACTIVE"
      case ACTIVE => "ACTIVE"
    }
  }

  implicit val LearningModeTypeEnumEncoder: EncodeJson[LearningModeType] =
    EncodeJson[LearningModeType](is => StringEncodeJson(LearningModeType.fromLearningModeType(is)))

  implicit val LearningModeTypeEnumDecoder: DecodeJson[LearningModeType] =
    DecodeJson.optionDecoder[LearningModeType](n => n.string.flatMap(jStr => LearningModeType.toLearningModeType(jStr)), "LearningModeType failed to de-serialize")

  implicit val OptimizationGoalMetadataConversionTagV3GoalMetadataCodecJson: CodecJson[OptimizationGoalMetadataConversionTagV3GoalMetadata] = CodecJson.derive[OptimizationGoalMetadataConversionTagV3GoalMetadata]
  implicit val OptimizationGoalMetadataConversionTagV3GoalMetadataDecoder: EntityDecoder[OptimizationGoalMetadataConversionTagV3GoalMetadata] = jsonOf[OptimizationGoalMetadataConversionTagV3GoalMetadata]
  implicit val OptimizationGoalMetadataConversionTagV3GoalMetadataEncoder: EntityEncoder[OptimizationGoalMetadataConversionTagV3GoalMetadata] = jsonEncoderOf[OptimizationGoalMetadataConversionTagV3GoalMetadata]
}
