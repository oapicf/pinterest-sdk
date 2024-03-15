package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedProcessingResultsList200Response._

case class FeedProcessingResultsList200Response (
  items: List[CatalogsFeedProcessingResult],
bookmark: Option[String])

object FeedProcessingResultsList200Response {
  import DateTimeCodecs._

  implicit val FeedProcessingResultsList200ResponseCodecJson: CodecJson[FeedProcessingResultsList200Response] = CodecJson.derive[FeedProcessingResultsList200Response]
  implicit val FeedProcessingResultsList200ResponseDecoder: EntityDecoder[FeedProcessingResultsList200Response] = jsonOf[FeedProcessingResultsList200Response]
  implicit val FeedProcessingResultsList200ResponseEncoder: EntityEncoder[FeedProcessingResultsList200Response] = jsonEncoderOf[FeedProcessingResultsList200Response]
}
