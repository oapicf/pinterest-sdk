package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SharedAudienceCommon._

case class SharedAudienceCommon (
  /* Unique identifier of an audience */
  audienceId: Option[String],
operationType: Option[OperationType])

object SharedAudienceCommon {
  import DateTimeCodecs._

  implicit val SharedAudienceCommonCodecJson: CodecJson[SharedAudienceCommon] = CodecJson.derive[SharedAudienceCommon]
  implicit val SharedAudienceCommonDecoder: EntityDecoder[SharedAudienceCommon] = jsonOf[SharedAudienceCommon]
  implicit val SharedAudienceCommonEncoder: EntityEncoder[SharedAudienceCommon] = jsonEncoderOf[SharedAudienceCommon]
}
