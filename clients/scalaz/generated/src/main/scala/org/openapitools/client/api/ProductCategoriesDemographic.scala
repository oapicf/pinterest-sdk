package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductCategoriesDemographic._

case class ProductCategoriesDemographic (
  /* Age demographic distribution */
  age: Map[String, BigDecimal],
gender: GenderDemographics)

object ProductCategoriesDemographic {
  import DateTimeCodecs._

  implicit val ProductCategoriesDemographicCodecJson: CodecJson[ProductCategoriesDemographic] = CodecJson.derive[ProductCategoriesDemographic]
  implicit val ProductCategoriesDemographicDecoder: EntityDecoder[ProductCategoriesDemographic] = jsonOf[ProductCategoriesDemographic]
  implicit val ProductCategoriesDemographicEncoder: EntityEncoder[ProductCategoriesDemographic] = jsonEncoderOf[ProductCategoriesDemographic]
}
