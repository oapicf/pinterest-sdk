package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PageVisitConversionTagsGet200Response._

case class PageVisitConversionTagsGet200Response (
  items: List[ConversionEventResponse],
bookmark: Option[String])

object PageVisitConversionTagsGet200Response {
  import DateTimeCodecs._

  implicit val PageVisitConversionTagsGet200ResponseCodecJson: CodecJson[PageVisitConversionTagsGet200Response] = CodecJson.derive[PageVisitConversionTagsGet200Response]
  implicit val PageVisitConversionTagsGet200ResponseDecoder: EntityDecoder[PageVisitConversionTagsGet200Response] = jsonOf[PageVisitConversionTagsGet200Response]
  implicit val PageVisitConversionTagsGet200ResponseEncoder: EntityEncoder[PageVisitConversionTagsGet200Response] = jsonEncoderOf[PageVisitConversionTagsGet200Response]
}
