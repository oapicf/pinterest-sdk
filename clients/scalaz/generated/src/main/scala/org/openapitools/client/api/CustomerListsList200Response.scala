package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerListsList200Response._

case class CustomerListsList200Response (
  items: List[CustomerList],
bookmark: Option[String])

object CustomerListsList200Response {
  import DateTimeCodecs._

  implicit val CustomerListsList200ResponseCodecJson: CodecJson[CustomerListsList200Response] = CodecJson.derive[CustomerListsList200Response]
  implicit val CustomerListsList200ResponseDecoder: EntityDecoder[CustomerListsList200Response] = jsonOf[CustomerListsList200Response]
  implicit val CustomerListsList200ResponseEncoder: EntityEncoder[CustomerListsList200Response] = jsonEncoderOf[CustomerListsList200Response]
}
