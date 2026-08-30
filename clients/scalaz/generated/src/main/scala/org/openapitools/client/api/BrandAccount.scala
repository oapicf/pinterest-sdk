package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BrandAccount._

case class BrandAccount (
  brandAccountId: String)

object BrandAccount {
  import DateTimeCodecs._

  implicit val BrandAccountCodecJson: CodecJson[BrandAccount] = CodecJson.derive[BrandAccount]
  implicit val BrandAccountDecoder: EntityDecoder[BrandAccount] = jsonOf[BrandAccount]
  implicit val BrandAccountEncoder: EntityEncoder[BrandAccount] = jsonEncoderOf[BrandAccount]
}
