package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IneligibleProductTagsErrorDetails._

case class IneligibleProductTagsErrorDetails (
  /* List of product tags that failed eligibility check. */
  productTags: List[IneligibleProductTagErrorItem])

object IneligibleProductTagsErrorDetails {
  import DateTimeCodecs._

  implicit val IneligibleProductTagsErrorDetailsCodecJson: CodecJson[IneligibleProductTagsErrorDetails] = CodecJson.derive[IneligibleProductTagsErrorDetails]
  implicit val IneligibleProductTagsErrorDetailsDecoder: EntityDecoder[IneligibleProductTagsErrorDetails] = jsonOf[IneligibleProductTagsErrorDetails]
  implicit val IneligibleProductTagsErrorDetailsEncoder: EntityEncoder[IneligibleProductTagsErrorDetails] = jsonEncoderOf[IneligibleProductTagsErrorDetails]
}
