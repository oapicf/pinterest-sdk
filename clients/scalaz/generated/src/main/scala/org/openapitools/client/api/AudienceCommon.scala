package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceCommon._

case class AudienceCommon (
  /* Ad account ID. */
  adAccountId: Option[String],
/* Audience name. */
  name: Option[String],
rule: Option[AudienceRule])

object AudienceCommon {
  import DateTimeCodecs._

  implicit val AudienceCommonCodecJson: CodecJson[AudienceCommon] = CodecJson.derive[AudienceCommon]
  implicit val AudienceCommonDecoder: EntityDecoder[AudienceCommon] = jsonOf[AudienceCommon]
  implicit val AudienceCommonEncoder: EntityEncoder[AudienceCommon] = jsonEncoderOf[AudienceCommon]
}
