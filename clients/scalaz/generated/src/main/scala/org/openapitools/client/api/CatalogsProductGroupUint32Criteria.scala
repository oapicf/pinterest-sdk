package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupUint32Criteria._

case class CatalogsProductGroupUint32Criteria (
  negated: Option[Boolean],
operator: NumericFilterOperatorType,
value: Integer)

object CatalogsProductGroupUint32Criteria {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupUint32CriteriaCodecJson: CodecJson[CatalogsProductGroupUint32Criteria] = CodecJson.derive[CatalogsProductGroupUint32Criteria]
  implicit val CatalogsProductGroupUint32CriteriaDecoder: EntityDecoder[CatalogsProductGroupUint32Criteria] = jsonOf[CatalogsProductGroupUint32Criteria]
  implicit val CatalogsProductGroupUint32CriteriaEncoder: EntityEncoder[CatalogsProductGroupUint32Criteria] = jsonEncoderOf[CatalogsProductGroupUint32Criteria]
}
