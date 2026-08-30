package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountCountriesGet200Response._

case class AdAccountCountriesGet200Response (
  items: List[AdAccountsCountry])

object AdAccountCountriesGet200Response {
  import DateTimeCodecs._

  implicit val AdAccountCountriesGet200ResponseCodecJson: CodecJson[AdAccountCountriesGet200Response] = CodecJson.derive[AdAccountCountriesGet200Response]
  implicit val AdAccountCountriesGet200ResponseDecoder: EntityDecoder[AdAccountCountriesGet200Response] = jsonOf[AdAccountCountriesGet200Response]
  implicit val AdAccountCountriesGet200ResponseEncoder: EntityEncoder[AdAccountCountriesGet200Response] = jsonEncoderOf[AdAccountCountriesGet200Response]
}
