package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdBatchItem._

case class AdBatchItem (
  data: Option[Ad],
exceptions: Option[Error])

object AdBatchItem {
  import DateTimeCodecs._

  implicit val AdBatchItemCodecJson: CodecJson[AdBatchItem] = CodecJson.derive[AdBatchItem]
  implicit val AdBatchItemDecoder: EntityDecoder[AdBatchItem] = jsonOf[AdBatchItem]
  implicit val AdBatchItemEncoder: EntityEncoder[AdBatchItem] = jsonEncoderOf[AdBatchItem]
}
