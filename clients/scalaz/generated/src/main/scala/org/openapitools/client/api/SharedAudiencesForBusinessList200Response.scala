package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SharedAudiencesForBusinessList200Response._

case class SharedAudiencesForBusinessList200Response (
  bookmark: Option[String],
items: List[Audience])

object SharedAudiencesForBusinessList200Response {
  import DateTimeCodecs._

  implicit val SharedAudiencesForBusinessList200ResponseCodecJson: CodecJson[SharedAudiencesForBusinessList200Response] = CodecJson.derive[SharedAudiencesForBusinessList200Response]
  implicit val SharedAudiencesForBusinessList200ResponseDecoder: EntityDecoder[SharedAudiencesForBusinessList200Response] = jsonOf[SharedAudiencesForBusinessList200Response]
  implicit val SharedAudiencesForBusinessList200ResponseEncoder: EntityEncoder[SharedAudiencesForBusinessList200Response] = jsonEncoderOf[SharedAudiencesForBusinessList200Response]
}
