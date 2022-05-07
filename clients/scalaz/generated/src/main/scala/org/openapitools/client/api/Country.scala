package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Country._

case class Country (
  
object Country {
  import DateTimeCodecs._

  implicit val CountryCodecJson: CodecJson[Country] = CodecJson.derive[Country]
  implicit val CountryDecoder: EntityDecoder[Country] = jsonOf[Country]
  implicit val CountryEncoder: EntityEncoder[Country] = jsonEncoderOf[Country]
}
