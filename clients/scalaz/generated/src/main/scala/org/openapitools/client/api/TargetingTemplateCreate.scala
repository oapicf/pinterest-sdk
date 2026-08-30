package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTemplateCreate._

case class TargetingTemplateCreate (
  /* Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting). */
  autoTargetingEnabled: Option[Boolean],
keywords: Option[List[TargetingTemplateKeyword]],
/* targeting template name */
  name: String,
placementGroup: Option[PlacementGroupType],
/* targeting profile attributes */
  targetingAttributes: TargetingSpecOptimal,
trackingUrls: Option[TrackingUrls])

object TargetingTemplateCreate {
  import DateTimeCodecs._

  implicit val TargetingTemplateCreateCodecJson: CodecJson[TargetingTemplateCreate] = CodecJson.derive[TargetingTemplateCreate]
  implicit val TargetingTemplateCreateDecoder: EntityDecoder[TargetingTemplateCreate] = jsonOf[TargetingTemplateCreate]
  implicit val TargetingTemplateCreateEncoder: EntityEncoder[TargetingTemplateCreate] = jsonEncoderOf[TargetingTemplateCreate]
}
