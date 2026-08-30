package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductTagsBulkAddRequest._

case class ProductTagsBulkAddRequest (
  /* List of product tags to add. Maximum 24 items allowed. */
  productTags: List[ProductTagItem])

object ProductTagsBulkAddRequest {
  import DateTimeCodecs._

  implicit val ProductTagsBulkAddRequestCodecJson: CodecJson[ProductTagsBulkAddRequest] = CodecJson.derive[ProductTagsBulkAddRequest]
  implicit val ProductTagsBulkAddRequestDecoder: EntityDecoder[ProductTagsBulkAddRequest] = jsonOf[ProductTagsBulkAddRequest]
  implicit val ProductTagsBulkAddRequestEncoder: EntityEncoder[ProductTagsBulkAddRequest] = jsonEncoderOf[ProductTagsBulkAddRequest]
}
