package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductTagsBulkDeleteRequest._

case class ProductTagsBulkDeleteRequest (
  /* List of product tags to delete. */
  productTags: List[ProductTagItem])

object ProductTagsBulkDeleteRequest {
  import DateTimeCodecs._

  implicit val ProductTagsBulkDeleteRequestCodecJson: CodecJson[ProductTagsBulkDeleteRequest] = CodecJson.derive[ProductTagsBulkDeleteRequest]
  implicit val ProductTagsBulkDeleteRequestDecoder: EntityDecoder[ProductTagsBulkDeleteRequest] = jsonOf[ProductTagsBulkDeleteRequest]
  implicit val ProductTagsBulkDeleteRequestEncoder: EntityEncoder[ProductTagsBulkDeleteRequest] = jsonEncoderOf[ProductTagsBulkDeleteRequest]
}
