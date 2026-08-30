package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountsCountry._

case class AdAccountsCountry (
  code: Country,
/* Country currency. */
  currency: String,
/* Country index */
  index: BigDecimal,
/* Country name */
  name: String)

object AdAccountsCountry {
  import DateTimeCodecs._

  implicit val AdAccountsCountryCodecJson: CodecJson[AdAccountsCountry] = CodecJson.derive[AdAccountsCountry]
  implicit val AdAccountsCountryDecoder: EntityDecoder[AdAccountsCountry] = jsonOf[AdAccountsCountry]
  implicit val AdAccountsCountryEncoder: EntityEncoder[AdAccountsCountry] = jsonEncoderOf[AdAccountsCountry]
}
