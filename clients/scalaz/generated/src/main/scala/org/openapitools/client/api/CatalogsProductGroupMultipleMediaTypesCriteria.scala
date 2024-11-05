package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupMultipleMediaTypesCriteria._

case class CatalogsProductGroupMultipleMediaTypesCriteria (
  values: List[MediaType],
negated: Option[Boolean])

object CatalogsProductGroupMultipleMediaTypesCriteria {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupMultipleMediaTypesCriteriaCodecJson: CodecJson[CatalogsProductGroupMultipleMediaTypesCriteria] = CodecJson.derive[CatalogsProductGroupMultipleMediaTypesCriteria]
  implicit val CatalogsProductGroupMultipleMediaTypesCriteriaDecoder: EntityDecoder[CatalogsProductGroupMultipleMediaTypesCriteria] = jsonOf[CatalogsProductGroupMultipleMediaTypesCriteria]
  implicit val CatalogsProductGroupMultipleMediaTypesCriteriaEncoder: EntityEncoder[CatalogsProductGroupMultipleMediaTypesCriteria] = jsonEncoderOf[CatalogsProductGroupMultipleMediaTypesCriteria]
}
