package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionEventResponse._

case class ConversionEventResponse (
  conversionEvent: Option[ConversionTagType],
/* Id of the tag. */
  conversionTagId: Option[String],
/* Id of the ad account. */
  adAccountId: Option[String],
/* Creation date in epoch format. */
  createdTime: Option[Integer])

object ConversionEventResponse {
  import DateTimeCodecs._

  implicit val ConversionEventResponseCodecJson: CodecJson[ConversionEventResponse] = CodecJson.derive[ConversionEventResponse]
  implicit val ConversionEventResponseDecoder: EntityDecoder[ConversionEventResponse] = jsonOf[ConversionEventResponse]
  implicit val ConversionEventResponseEncoder: EntityEncoder[ConversionEventResponse] = jsonEncoderOf[ConversionEventResponse]
}
