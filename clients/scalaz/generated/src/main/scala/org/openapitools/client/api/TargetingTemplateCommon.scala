package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTemplateCommon._

case class TargetingTemplateCommon (
  /* targeting template name */
  name: Option[String],
/* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
  autoTargetingEnabled: Option[Boolean],
targetingAttributes: Option[TargetingSpec],
placementGroup: Option[PlacementGroupType],
keywords: Option[List[TargetingTemplateKeyword]],
trackingUrls: Option[TrackingUrls])

object TargetingTemplateCommon {
  import DateTimeCodecs._

  implicit val TargetingTemplateCommonCodecJson: CodecJson[TargetingTemplateCommon] = CodecJson.derive[TargetingTemplateCommon]
  implicit val TargetingTemplateCommonDecoder: EntityDecoder[TargetingTemplateCommon] = jsonOf[TargetingTemplateCommon]
  implicit val TargetingTemplateCommonEncoder: EntityEncoder[TargetingTemplateCommon] = jsonEncoderOf[TargetingTemplateCommon]
}
