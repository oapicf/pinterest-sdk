package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TotalCountByEntityStatus._

case class TotalCountByEntityStatus (
  /* Count of ACTIVE assets */
  ACTIVE: Option[Integer],
/* Count of ARCHIVED assets */
  ARCHIVED: Option[Integer],
/* Count of PAUSED assets */
  PAUSED: Option[Integer])

object TotalCountByEntityStatus {
  import DateTimeCodecs._

  implicit val TotalCountByEntityStatusCodecJson: CodecJson[TotalCountByEntityStatus] = CodecJson.derive[TotalCountByEntityStatus]
  implicit val TotalCountByEntityStatusDecoder: EntityDecoder[TotalCountByEntityStatus] = jsonOf[TotalCountByEntityStatus]
  implicit val TotalCountByEntityStatusEncoder: EntityEncoder[TotalCountByEntityStatus] = jsonEncoderOf[TotalCountByEntityStatus]
}
