package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedsList200Response._

case class FeedsList200Response (
  items: List[CatalogsFeed],
bookmark: Option[String])

object FeedsList200Response {
  import DateTimeCodecs._

  implicit val FeedsList200ResponseCodecJson: CodecJson[FeedsList200Response] = CodecJson.derive[FeedsList200Response]
  implicit val FeedsList200ResponseDecoder: EntityDecoder[FeedsList200Response] = jsonOf[FeedsList200Response]
  implicit val FeedsList200ResponseEncoder: EntityEncoder[FeedsList200Response] = jsonEncoderOf[FeedsList200Response]
}
