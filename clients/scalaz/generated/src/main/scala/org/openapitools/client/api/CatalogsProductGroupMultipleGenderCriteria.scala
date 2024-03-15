package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupMultipleGenderCriteria._

case class CatalogsProductGroupMultipleGenderCriteria (
  values: List[Gender],
negated: Option[Boolean])

object CatalogsProductGroupMultipleGenderCriteria {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupMultipleGenderCriteriaCodecJson: CodecJson[CatalogsProductGroupMultipleGenderCriteria] = CodecJson.derive[CatalogsProductGroupMultipleGenderCriteria]
  implicit val CatalogsProductGroupMultipleGenderCriteriaDecoder: EntityDecoder[CatalogsProductGroupMultipleGenderCriteria] = jsonOf[CatalogsProductGroupMultipleGenderCriteria]
  implicit val CatalogsProductGroupMultipleGenderCriteriaEncoder: EntityEncoder[CatalogsProductGroupMultipleGenderCriteria] = jsonEncoderOf[CatalogsProductGroupMultipleGenderCriteria]
}
