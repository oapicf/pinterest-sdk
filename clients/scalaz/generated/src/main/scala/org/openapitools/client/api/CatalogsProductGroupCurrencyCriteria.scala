package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupCurrencyCriteria._

case class CatalogsProductGroupCurrencyCriteria (
  values: NonNullableCatalogsCurrency,
negated: Boolean)

object CatalogsProductGroupCurrencyCriteria {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupCurrencyCriteriaCodecJson: CodecJson[CatalogsProductGroupCurrencyCriteria] = CodecJson.derive[CatalogsProductGroupCurrencyCriteria]
  implicit val CatalogsProductGroupCurrencyCriteriaDecoder: EntityDecoder[CatalogsProductGroupCurrencyCriteria] = jsonOf[CatalogsProductGroupCurrencyCriteria]
  implicit val CatalogsProductGroupCurrencyCriteriaEncoder: EntityEncoder[CatalogsProductGroupCurrencyCriteria] = jsonEncoderOf[CatalogsProductGroupCurrencyCriteria]
}
