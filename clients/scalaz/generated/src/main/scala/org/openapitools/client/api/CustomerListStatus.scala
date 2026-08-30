package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerListStatus._

case class CustomerListStatus (
  
object CustomerListStatus {
  import DateTimeCodecs._

  implicit val CustomerListStatusCodecJson: CodecJson[CustomerListStatus] = CodecJson.derive[CustomerListStatus]
  implicit val CustomerListStatusDecoder: EntityDecoder[CustomerListStatus] = jsonOf[CustomerListStatus]
  implicit val CustomerListStatusEncoder: EntityEncoder[CustomerListStatus] = jsonEncoderOf[CustomerListStatus]
}
