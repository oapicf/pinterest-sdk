package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountCreateRequest._

case class AdAccountCreateRequest (
  country: Option[Country],
/* Ad Account name. */
  name: Option[String],
/* Advertiser's owning user ID. */
  ownerUserId: Option[String])

object AdAccountCreateRequest {
  import DateTimeCodecs._

  implicit val AdAccountCreateRequestCodecJson: CodecJson[AdAccountCreateRequest] = CodecJson.derive[AdAccountCreateRequest]
  implicit val AdAccountCreateRequestDecoder: EntityDecoder[AdAccountCreateRequest] = jsonOf[AdAccountCreateRequest]
  implicit val AdAccountCreateRequestEncoder: EntityEncoder[AdAccountCreateRequest] = jsonEncoderOf[AdAccountCreateRequest]
}
