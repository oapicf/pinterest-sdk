package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupsCreate200Response._

case class AdGroupsCreate200Response (
  items: List[AdGroupsCreate200ResponseItemsInner])

object AdGroupsCreate200Response {
  import DateTimeCodecs._

  implicit val AdGroupsCreate200ResponseCodecJson: CodecJson[AdGroupsCreate200Response] = CodecJson.derive[AdGroupsCreate200Response]
  implicit val AdGroupsCreate200ResponseDecoder: EntityDecoder[AdGroupsCreate200Response] = jsonOf[AdGroupsCreate200Response]
  implicit val AdGroupsCreate200ResponseEncoder: EntityEncoder[AdGroupsCreate200Response] = jsonEncoderOf[AdGroupsCreate200Response]
}
