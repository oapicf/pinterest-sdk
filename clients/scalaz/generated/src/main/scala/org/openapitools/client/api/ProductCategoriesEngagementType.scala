package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductCategoriesEngagementType._

case class ProductCategoriesEngagementType (
  
object ProductCategoriesEngagementType {
  import DateTimeCodecs._

  implicit val ProductCategoriesEngagementTypeCodecJson: CodecJson[ProductCategoriesEngagementType] = CodecJson.derive[ProductCategoriesEngagementType]
  implicit val ProductCategoriesEngagementTypeDecoder: EntityDecoder[ProductCategoriesEngagementType] = jsonOf[ProductCategoriesEngagementType]
  implicit val ProductCategoriesEngagementTypeEncoder: EntityEncoder[ProductCategoriesEngagementType] = jsonEncoderOf[ProductCategoriesEngagementType]
}
