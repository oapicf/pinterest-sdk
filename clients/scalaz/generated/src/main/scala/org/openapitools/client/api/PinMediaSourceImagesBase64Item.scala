package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaSourceImagesBase64Item._

case class PinMediaSourceImagesBase64Item (
  `contentType`: ModelContentType,
data: String,
description: Option[String],
link: Option[String],
title: Option[String])

object PinMediaSourceImagesBase64Item {
  import DateTimeCodecs._

  implicit val PinMediaSourceImagesBase64ItemCodecJson: CodecJson[PinMediaSourceImagesBase64Item] = CodecJson.derive[PinMediaSourceImagesBase64Item]
  implicit val PinMediaSourceImagesBase64ItemDecoder: EntityDecoder[PinMediaSourceImagesBase64Item] = jsonOf[PinMediaSourceImagesBase64Item]
  implicit val PinMediaSourceImagesBase64ItemEncoder: EntityEncoder[PinMediaSourceImagesBase64Item] = jsonEncoderOf[PinMediaSourceImagesBase64Item]
}
