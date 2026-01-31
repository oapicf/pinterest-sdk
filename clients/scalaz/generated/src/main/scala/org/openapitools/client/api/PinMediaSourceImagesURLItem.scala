package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaSourceImagesURLItem._

case class PinMediaSourceImagesURLItem (
  description: Option[String],
link: Option[String],
title: Option[String],
url: String)

object PinMediaSourceImagesURLItem {
  import DateTimeCodecs._

  implicit val PinMediaSourceImagesURLItemCodecJson: CodecJson[PinMediaSourceImagesURLItem] = CodecJson.derive[PinMediaSourceImagesURLItem]
  implicit val PinMediaSourceImagesURLItemDecoder: EntityDecoder[PinMediaSourceImagesURLItem] = jsonOf[PinMediaSourceImagesURLItem]
  implicit val PinMediaSourceImagesURLItemEncoder: EntityEncoder[PinMediaSourceImagesURLItem] = jsonEncoderOf[PinMediaSourceImagesURLItem]
}
