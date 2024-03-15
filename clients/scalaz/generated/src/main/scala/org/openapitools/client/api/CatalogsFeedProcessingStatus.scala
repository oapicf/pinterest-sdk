package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedProcessingStatus._

case class CatalogsFeedProcessingStatus (
  
object CatalogsFeedProcessingStatus {
  import DateTimeCodecs._

  implicit val CatalogsFeedProcessingStatusCodecJson: CodecJson[CatalogsFeedProcessingStatus] = CodecJson.derive[CatalogsFeedProcessingStatus]
  implicit val CatalogsFeedProcessingStatusDecoder: EntityDecoder[CatalogsFeedProcessingStatus] = jsonOf[CatalogsFeedProcessingStatus]
  implicit val CatalogsFeedProcessingStatusEncoder: EntityEncoder[CatalogsFeedProcessingStatus] = jsonEncoderOf[CatalogsFeedProcessingStatus]
}
