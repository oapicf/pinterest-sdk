package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTemplate._

case class TargetingTemplate (
  /* The ID of the advertiser that this targeting template belongs to. */
  adAccountId: Option[String],
/* Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting). */
  autoTargetingEnabled: Option[Boolean],
/* Targeting template created time. Unix timestamp in seconds. */
  createdTime: Option[Integer],
/* Targeting template ID. */
  id: Option[String],
keywords: Option[List[TargetingTemplateKeyword]],
/* targeting template name */
  name: String,
placementGroup: Option[PlacementGroupType],
sizing: Option[TargetingTemplateAudienceSizing],
/* Indicate targeting template is active or Deleted */
  status: Option[TargetingTemplateStatus],
/* targeting profile attributes */
  targetingAttributes: TargetingSpecOptimal,
trackingUrls: Option[TrackingUrls],
/* Targeting template updated time.Unix timestamp in seconds. */
  updatedTime: Option[Integer],
/* Inform if the targeting template is valid (ex. would be false if has revoked audience) */
  valid: Option[Boolean])

object TargetingTemplate {
  import DateTimeCodecs._

  implicit val TargetingTemplateCodecJson: CodecJson[TargetingTemplate] = CodecJson.derive[TargetingTemplate]
  implicit val TargetingTemplateDecoder: EntityDecoder[TargetingTemplate] = jsonOf[TargetingTemplate]
  implicit val TargetingTemplateEncoder: EntityEncoder[TargetingTemplate] = jsonEncoderOf[TargetingTemplate]
}
