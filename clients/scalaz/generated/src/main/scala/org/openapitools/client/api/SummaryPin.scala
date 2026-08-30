package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SummaryPin._

case class SummaryPin (
  altText: Option[String],
description: Option[String],
id: String,
link: Option[String],
media: Option[PinMedia],
title: Option[String])

object SummaryPin {
  import DateTimeCodecs._

  implicit val SummaryPinCodecJson: CodecJson[SummaryPin] = CodecJson.derive[SummaryPin]
  implicit val SummaryPinDecoder: EntityDecoder[SummaryPin] = jsonOf[SummaryPin]
  implicit val SummaryPinEncoder: EntityEncoder[SummaryPin] = jsonEncoderOf[SummaryPin]
}
