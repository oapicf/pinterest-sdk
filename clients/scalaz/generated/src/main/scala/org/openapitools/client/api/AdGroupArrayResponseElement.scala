package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupArrayResponseElement._

case class AdGroupArrayResponseElement (
  data: Option[AdGroupResponse],
exceptions: Option[List[Exception]])

object AdGroupArrayResponseElement {
  import DateTimeCodecs._

  implicit val AdGroupArrayResponseElementCodecJson: CodecJson[AdGroupArrayResponseElement] = CodecJson.derive[AdGroupArrayResponseElement]
  implicit val AdGroupArrayResponseElementDecoder: EntityDecoder[AdGroupArrayResponseElement] = jsonOf[AdGroupArrayResponseElement]
  implicit val AdGroupArrayResponseElementEncoder: EntityEncoder[AdGroupArrayResponseElement] = jsonEncoderOf[AdGroupArrayResponseElement]
}
