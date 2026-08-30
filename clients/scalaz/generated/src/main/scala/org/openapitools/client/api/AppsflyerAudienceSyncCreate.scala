package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AppsflyerAudienceSyncCreate._

case class AppsflyerAudienceSyncCreate (
  /* The container ID of the audience */
  containerId: String,
/* The pre-signed URL for SHA256 hashed GAID/IDFA file */
  urlAdidSha256: Option[String],
/* The pre-signed URL for SHA256 hashed email file */
  urlEmailSha256: Option[String])

object AppsflyerAudienceSyncCreate {
  import DateTimeCodecs._

  implicit val AppsflyerAudienceSyncCreateCodecJson: CodecJson[AppsflyerAudienceSyncCreate] = CodecJson.derive[AppsflyerAudienceSyncCreate]
  implicit val AppsflyerAudienceSyncCreateDecoder: EntityDecoder[AppsflyerAudienceSyncCreate] = jsonOf[AppsflyerAudienceSyncCreate]
  implicit val AppsflyerAudienceSyncCreateEncoder: EntityEncoder[AppsflyerAudienceSyncCreate] = jsonEncoderOf[AppsflyerAudienceSyncCreate]
}
