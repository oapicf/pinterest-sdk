package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupsCreate200ResponseItemsInner._

case class AdGroupsCreate200ResponseItemsInner (
  data: Option[AdGroup],
exceptions: Option[List[BatchItemException]])

object AdGroupsCreate200ResponseItemsInner {
  import DateTimeCodecs._

  implicit val AdGroupsCreate200ResponseItemsInnerCodecJson: CodecJson[AdGroupsCreate200ResponseItemsInner] = CodecJson.derive[AdGroupsCreate200ResponseItemsInner]
  implicit val AdGroupsCreate200ResponseItemsInnerDecoder: EntityDecoder[AdGroupsCreate200ResponseItemsInner] = jsonOf[AdGroupsCreate200ResponseItemsInner]
  implicit val AdGroupsCreate200ResponseItemsInnerEncoder: EntityEncoder[AdGroupsCreate200ResponseItemsInner] = jsonEncoderOf[AdGroupsCreate200ResponseItemsInner]
}
