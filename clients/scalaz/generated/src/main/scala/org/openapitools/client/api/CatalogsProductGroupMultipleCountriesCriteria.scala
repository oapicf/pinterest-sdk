package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupMultipleCountriesCriteria._

case class CatalogsProductGroupMultipleCountriesCriteria (
  negated: Option[Boolean],
values: List[Country])

object CatalogsProductGroupMultipleCountriesCriteria {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupMultipleCountriesCriteriaCodecJson: CodecJson[CatalogsProductGroupMultipleCountriesCriteria] = CodecJson.derive[CatalogsProductGroupMultipleCountriesCriteria]
  implicit val CatalogsProductGroupMultipleCountriesCriteriaDecoder: EntityDecoder[CatalogsProductGroupMultipleCountriesCriteria] = jsonOf[CatalogsProductGroupMultipleCountriesCriteria]
  implicit val CatalogsProductGroupMultipleCountriesCriteriaEncoder: EntityEncoder[CatalogsProductGroupMultipleCountriesCriteria] = jsonEncoderOf[CatalogsProductGroupMultipleCountriesCriteria]
}
