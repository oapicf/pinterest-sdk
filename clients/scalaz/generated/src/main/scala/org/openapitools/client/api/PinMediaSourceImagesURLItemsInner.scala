package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaSourceImagesURLItemsInner._

case class PinMediaSourceImagesURLItemsInner (
  title: Option[String],
description: Option[String],
/* Destination link for the image. */
  link: Option[String],
/* URL of image to upload. */
  url: String)

object PinMediaSourceImagesURLItemsInner {
  import DateTimeCodecs._

  implicit val PinMediaSourceImagesURLItemsInnerCodecJson: CodecJson[PinMediaSourceImagesURLItemsInner] = CodecJson.derive[PinMediaSourceImagesURLItemsInner]
  implicit val PinMediaSourceImagesURLItemsInnerDecoder: EntityDecoder[PinMediaSourceImagesURLItemsInner] = jsonOf[PinMediaSourceImagesURLItemsInner]
  implicit val PinMediaSourceImagesURLItemsInnerEncoder: EntityEncoder[PinMediaSourceImagesURLItemsInner] = jsonEncoderOf[PinMediaSourceImagesURLItemsInner]
}
