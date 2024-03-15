package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConditionFilter._

case class ConditionFilter (
  CONDITION: CatalogsProductGroupMultipleStringCriteria)

object ConditionFilter {
  import DateTimeCodecs._

  implicit val ConditionFilterCodecJson: CodecJson[ConditionFilter] = CodecJson.derive[ConditionFilter]
  implicit val ConditionFilterDecoder: EntityDecoder[ConditionFilter] = jsonOf[ConditionFilter]
  implicit val ConditionFilterEncoder: EntityEncoder[ConditionFilter] = jsonEncoderOf[ConditionFilter]
}
