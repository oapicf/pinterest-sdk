package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupCommonTrackingUrls._

case class AdGroupCommonTrackingUrls (
  impression: Option[List[String]],
click: Option[List[String]],
engagement: Option[List[String]],
buyableButton: Option[List[String]],
audienceVerification: Option[List[String]])

object AdGroupCommonTrackingUrls {
  import DateTimeCodecs._

  implicit val AdGroupCommonTrackingUrlsCodecJson: CodecJson[AdGroupCommonTrackingUrls] = CodecJson.derive[AdGroupCommonTrackingUrls]
  implicit val AdGroupCommonTrackingUrlsDecoder: EntityDecoder[AdGroupCommonTrackingUrls] = jsonOf[AdGroupCommonTrackingUrls]
  implicit val AdGroupCommonTrackingUrlsEncoder: EntityEncoder[AdGroupCommonTrackingUrls] = jsonEncoderOf[AdGroupCommonTrackingUrls]
}
