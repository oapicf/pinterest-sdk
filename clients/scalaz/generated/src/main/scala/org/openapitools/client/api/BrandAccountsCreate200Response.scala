package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BrandAccountsCreate200Response._

case class BrandAccountsCreate200Response (
  /* id of the newly created brand account */
  brandAccountId: Option[String])

object BrandAccountsCreate200Response {
  import DateTimeCodecs._

  implicit val BrandAccountsCreate200ResponseCodecJson: CodecJson[BrandAccountsCreate200Response] = CodecJson.derive[BrandAccountsCreate200Response]
  implicit val BrandAccountsCreate200ResponseDecoder: EntityDecoder[BrandAccountsCreate200Response] = jsonOf[BrandAccountsCreate200Response]
  implicit val BrandAccountsCreate200ResponseEncoder: EntityEncoder[BrandAccountsCreate200Response] = jsonEncoderOf[BrandAccountsCreate200Response]
}
