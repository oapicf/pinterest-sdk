package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupFilterOperatorTypeCriteria._

case class CatalogsProductGroupFilterOperatorTypeCriteria (
  filterOperatorType: Option[FilterOperatorType],
negated: Option[Boolean],
values: List[String])

object CatalogsProductGroupFilterOperatorTypeCriteria {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupFilterOperatorTypeCriteriaCodecJson: CodecJson[CatalogsProductGroupFilterOperatorTypeCriteria] = CodecJson.derive[CatalogsProductGroupFilterOperatorTypeCriteria]
  implicit val CatalogsProductGroupFilterOperatorTypeCriteriaDecoder: EntityDecoder[CatalogsProductGroupFilterOperatorTypeCriteria] = jsonOf[CatalogsProductGroupFilterOperatorTypeCriteria]
  implicit val CatalogsProductGroupFilterOperatorTypeCriteriaEncoder: EntityEncoder[CatalogsProductGroupFilterOperatorTypeCriteria] = jsonEncoderOf[CatalogsProductGroupFilterOperatorTypeCriteria]
}
