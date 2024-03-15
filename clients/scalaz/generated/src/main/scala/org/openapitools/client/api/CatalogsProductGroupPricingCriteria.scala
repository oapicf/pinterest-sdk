package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupPricingCriteria._

case class CatalogsProductGroupPricingCriteria (
  inclusion: Option[Boolean],
values: BigDecimal,
negated: Option[Boolean])

object CatalogsProductGroupPricingCriteria {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupPricingCriteriaCodecJson: CodecJson[CatalogsProductGroupPricingCriteria] = CodecJson.derive[CatalogsProductGroupPricingCriteria]
  implicit val CatalogsProductGroupPricingCriteriaDecoder: EntityDecoder[CatalogsProductGroupPricingCriteria] = jsonOf[CatalogsProductGroupPricingCriteria]
  implicit val CatalogsProductGroupPricingCriteriaEncoder: EntityEncoder[CatalogsProductGroupPricingCriteria] = jsonEncoderOf[CatalogsProductGroupPricingCriteria]
}
