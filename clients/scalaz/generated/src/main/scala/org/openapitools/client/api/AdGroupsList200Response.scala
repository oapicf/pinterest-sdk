package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupsList200Response._

case class AdGroupsList200Response (
  items: List[AdGroupResponse],
bookmark: Option[String])

object AdGroupsList200Response {
  import DateTimeCodecs._

  implicit val AdGroupsList200ResponseCodecJson: CodecJson[AdGroupsList200Response] = CodecJson.derive[AdGroupsList200Response]
  implicit val AdGroupsList200ResponseDecoder: EntityDecoder[AdGroupsList200Response] = jsonOf[AdGroupsList200Response]
  implicit val AdGroupsList200ResponseEncoder: EntityEncoder[AdGroupsList200Response] = jsonEncoderOf[AdGroupsList200Response]
}
