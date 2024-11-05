package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductGroupReferenceFilter._

case class ProductGroupReferenceFilter (
  PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria)

object ProductGroupReferenceFilter {
  import DateTimeCodecs._

  implicit val ProductGroupReferenceFilterCodecJson: CodecJson[ProductGroupReferenceFilter] = CodecJson.derive[ProductGroupReferenceFilter]
  implicit val ProductGroupReferenceFilterDecoder: EntityDecoder[ProductGroupReferenceFilter] = jsonOf[ProductGroupReferenceFilter]
  implicit val ProductGroupReferenceFilterEncoder: EntityEncoder[ProductGroupReferenceFilter] = jsonEncoderOf[ProductGroupReferenceFilter]
}
