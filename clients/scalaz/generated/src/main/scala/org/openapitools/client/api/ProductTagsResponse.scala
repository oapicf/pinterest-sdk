package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductTagsResponse._

case class ProductTagsResponse (
  /* List of product tags on the pin. */
  productTags: List[ProductTagItem])

object ProductTagsResponse {
  import DateTimeCodecs._

  implicit val ProductTagsResponseCodecJson: CodecJson[ProductTagsResponse] = CodecJson.derive[ProductTagsResponse]
  implicit val ProductTagsResponseDecoder: EntityDecoder[ProductTagsResponse] = jsonOf[ProductTagsResponse]
  implicit val ProductTagsResponseEncoder: EntityEncoder[ProductTagsResponse] = jsonEncoderOf[ProductTagsResponse]
}
