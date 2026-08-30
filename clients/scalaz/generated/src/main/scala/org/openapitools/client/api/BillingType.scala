package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BillingType._

case class BillingType (
  
object BillingType {
  import DateTimeCodecs._

  implicit val BillingTypeCodecJson: CodecJson[BillingType] = CodecJson.derive[BillingType]
  implicit val BillingTypeDecoder: EntityDecoder[BillingType] = jsonOf[BillingType]
  implicit val BillingTypeEncoder: EntityEncoder[BillingType] = jsonEncoderOf[BillingType]
}
