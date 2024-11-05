package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SharedAudienceResponseCommon._

case class SharedAudienceResponseCommon (
  /* Audience ID that was shared */
  audienceId: Option[String],
permissions: Option[List[Role]])

object SharedAudienceResponseCommon {
  import DateTimeCodecs._

  implicit val SharedAudienceResponseCommonCodecJson: CodecJson[SharedAudienceResponseCommon] = CodecJson.derive[SharedAudienceResponseCommon]
  implicit val SharedAudienceResponseCommonDecoder: EntityDecoder[SharedAudienceResponseCommon] = jsonOf[SharedAudienceResponseCommon]
  implicit val SharedAudienceResponseCommonEncoder: EntityEncoder[SharedAudienceResponseCommon] = jsonEncoderOf[SharedAudienceResponseCommon]
}
