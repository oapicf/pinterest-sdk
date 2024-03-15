package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountsCountryResponseData._

case class AdAccountsCountryResponseData (
  code: Option[AdCountry],
/* Country currency. */
  currency: Option[String],
/* Country index */
  index: Option[BigDecimal],
/* Country name */
  name: Option[String])

object AdAccountsCountryResponseData {
  import DateTimeCodecs._

  implicit val AdAccountsCountryResponseDataCodecJson: CodecJson[AdAccountsCountryResponseData] = CodecJson.derive[AdAccountsCountryResponseData]
  implicit val AdAccountsCountryResponseDataDecoder: EntityDecoder[AdAccountsCountryResponseData] = jsonOf[AdAccountsCountryResponseData]
  implicit val AdAccountsCountryResponseDataEncoder: EntityEncoder[AdAccountsCountryResponseData] = jsonEncoderOf[AdAccountsCountryResponseData]
}
