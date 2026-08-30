package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BudgetDurationType._

case class BudgetDurationType (
  
object BudgetDurationType {
  import DateTimeCodecs._

  implicit val BudgetDurationTypeCodecJson: CodecJson[BudgetDurationType] = CodecJson.derive[BudgetDurationType]
  implicit val BudgetDurationTypeDecoder: EntityDecoder[BudgetDurationType] = jsonOf[BudgetDurationType]
  implicit val BudgetDurationTypeEncoder: EntityEncoder[BudgetDurationType] = jsonEncoderOf[BudgetDurationType]
}
