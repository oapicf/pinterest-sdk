package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountsCountryResponse._

case class AdAccountsCountryResponse (
  items: Option[List[AdAccountsCountryResponseData]])

object AdAccountsCountryResponse {
  import DateTimeCodecs._

  implicit val AdAccountsCountryResponseCodecJson: CodecJson[AdAccountsCountryResponse] = CodecJson.derive[AdAccountsCountryResponse]
  implicit val AdAccountsCountryResponseDecoder: EntityDecoder[AdAccountsCountryResponse] = jsonOf[AdAccountsCountryResponse]
  implicit val AdAccountsCountryResponseEncoder: EntityEncoder[AdAccountsCountryResponse] = jsonEncoderOf[AdAccountsCountryResponse]
}
