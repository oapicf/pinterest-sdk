package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupMultipleStringCriteria._

case class CatalogsProductGroupMultipleStringCriteria (
  values: List[String],
negated: Boolean)

object CatalogsProductGroupMultipleStringCriteria {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupMultipleStringCriteriaCodecJson: CodecJson[CatalogsProductGroupMultipleStringCriteria] = CodecJson.derive[CatalogsProductGroupMultipleStringCriteria]
  implicit val CatalogsProductGroupMultipleStringCriteriaDecoder: EntityDecoder[CatalogsProductGroupMultipleStringCriteria] = jsonOf[CatalogsProductGroupMultipleStringCriteria]
  implicit val CatalogsProductGroupMultipleStringCriteriaEncoder: EntityEncoder[CatalogsProductGroupMultipleStringCriteria] = jsonEncoderOf[CatalogsProductGroupMultipleStringCriteria]
}
