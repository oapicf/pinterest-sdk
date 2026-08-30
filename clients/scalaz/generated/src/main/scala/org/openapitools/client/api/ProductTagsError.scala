package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductTagsError._

case class ProductTagsError (
  code: Integer,
/* Details about which product tags failed eligibility check. */
  details: Option[IneligibleProductTagsErrorDetails],
message: String)

object ProductTagsError {
  import DateTimeCodecs._

  implicit val ProductTagsErrorCodecJson: CodecJson[ProductTagsError] = CodecJson.derive[ProductTagsError]
  implicit val ProductTagsErrorDecoder: EntityDecoder[ProductTagsError] = jsonOf[ProductTagsError]
  implicit val ProductTagsErrorEncoder: EntityEncoder[ProductTagsError] = jsonEncoderOf[ProductTagsError]
}
