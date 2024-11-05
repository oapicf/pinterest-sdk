package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTemplateResponseData._

case class TargetingTemplateResponseData (
  /* targeting template name */
  name: Option[String],
/* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
  autoTargetingEnabled: Option[Boolean],
targetingAttributes: Option[TargetingSpec],
placementGroup: Option[PlacementGroupType],
keywords: Option[List[TargetingTemplateKeyword]],
trackingUrls: Option[TrackingUrls],
/* Targeting template ID. */
  id: Option[String],
/* Targeting template created time. Unix timestamp in seconds. */
  createdTime: Option[Integer],
/* Targeting template updated time.Unix timestamp in seconds. */
  updatedTime: Option[Integer],
/* The ID of the advertiser that this targeting template belongs to. */
  adAccountId: Option[String],
/* Indicate targeting template is active or Deleted */
  status: Option[Status],
sizing: Option[TargetingTemplateAudienceSizing])

object TargetingTemplateResponseData {
  import DateTimeCodecs._
  sealed trait Status
  case object ACTIVE extends Status
  case object DELETED extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "ACTIVE" => Some(ACTIVE)
      case "DELETED" => Some(DELETED)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case ACTIVE => "ACTIVE"
      case DELETED => "DELETED"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val TargetingTemplateResponseDataCodecJson: CodecJson[TargetingTemplateResponseData] = CodecJson.derive[TargetingTemplateResponseData]
  implicit val TargetingTemplateResponseDataDecoder: EntityDecoder[TargetingTemplateResponseData] = jsonOf[TargetingTemplateResponseData]
  implicit val TargetingTemplateResponseDataEncoder: EntityEncoder[TargetingTemplateResponseData] = jsonEncoderOf[TargetingTemplateResponseData]
}
