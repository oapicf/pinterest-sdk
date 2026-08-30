package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BillingProfileStatus._

case class BillingProfileStatus (
  
object BillingProfileStatus {
  import DateTimeCodecs._

  implicit val BillingProfileStatusCodecJson: CodecJson[BillingProfileStatus] = CodecJson.derive[BillingProfileStatus]
  implicit val BillingProfileStatusDecoder: EntityDecoder[BillingProfileStatus] = jsonOf[BillingProfileStatus]
  implicit val BillingProfileStatusEncoder: EntityEncoder[BillingProfileStatus] = jsonEncoderOf[BillingProfileStatus]
}
