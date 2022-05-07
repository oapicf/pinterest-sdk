package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupMultipleStringListCriteria._

case class CatalogsProductGroupMultipleStringListCriteria (
  values: List[List[String]],
negated: Boolean)

object CatalogsProductGroupMultipleStringListCriteria {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupMultipleStringListCriteriaCodecJson: CodecJson[CatalogsProductGroupMultipleStringListCriteria] = CodecJson.derive[CatalogsProductGroupMultipleStringListCriteria]
  implicit val CatalogsProductGroupMultipleStringListCriteriaDecoder: EntityDecoder[CatalogsProductGroupMultipleStringListCriteria] = jsonOf[CatalogsProductGroupMultipleStringListCriteria]
  implicit val CatalogsProductGroupMultipleStringListCriteriaEncoder: EntityEncoder[CatalogsProductGroupMultipleStringListCriteria] = jsonEncoderOf[CatalogsProductGroupMultipleStringListCriteria]
}
