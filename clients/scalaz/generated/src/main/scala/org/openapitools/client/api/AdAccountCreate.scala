package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountCreate._

case class AdAccountCreate (
  country: Option[Country],
currency: Option[Currency],
/* Ad account name. */
  name: Option[String],
/* Advertiser's owning user ID. */
  ownerUserId: Option[String])

object AdAccountCreate {
  import DateTimeCodecs._

  implicit val AdAccountCreateCodecJson: CodecJson[AdAccountCreate] = CodecJson.derive[AdAccountCreate]
  implicit val AdAccountCreateDecoder: EntityDecoder[AdAccountCreate] = jsonOf[AdAccountCreate]
  implicit val AdAccountCreateEncoder: EntityEncoder[AdAccountCreate] = jsonEncoderOf[AdAccountCreate]
}
