package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTemplateCreate._

case class TargetingTemplateCreate (
  /* Name of targeting template. */
  name: String,
/* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
  autoTargetingEnabled: Option[Boolean],
targetingAttributes: TargetingSpec,
placementGroup: Option[PlacementGroupType],
keywords: Option[List[TargetingTemplateKeyword]],
trackingUrls: Option[TrackingUrls])

object TargetingTemplateCreate {
  import DateTimeCodecs._

  implicit val TargetingTemplateCreateCodecJson: CodecJson[TargetingTemplateCreate] = CodecJson.derive[TargetingTemplateCreate]
  implicit val TargetingTemplateCreateDecoder: EntityDecoder[TargetingTemplateCreate] = jsonOf[TargetingTemplateCreate]
  implicit val TargetingTemplateCreateEncoder: EntityEncoder[TargetingTemplateCreate] = jsonEncoderOf[TargetingTemplateCreate]
}
