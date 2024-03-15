package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrackingUrls._

case class TrackingUrls (
  impression: Option[List[String]],
click: Option[List[String]],
engagement: Option[List[String]],
buyableButton: Option[List[String]],
audienceVerification: Option[List[String]])

object TrackingUrls {
  import DateTimeCodecs._

  implicit val TrackingUrlsCodecJson: CodecJson[TrackingUrls] = CodecJson.derive[TrackingUrls]
  implicit val TrackingUrlsDecoder: EntityDecoder[TrackingUrls] = jsonOf[TrackingUrls]
  implicit val TrackingUrlsEncoder: EntityEncoder[TrackingUrls] = jsonEncoderOf[TrackingUrls]
}
