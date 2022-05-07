package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Paginated._

case class Paginated (
  items: List[Any],
bookmark: Option[String])

object Paginated {
  import DateTimeCodecs._

  implicit val PaginatedCodecJson: CodecJson[Paginated] = CodecJson.derive[Paginated]
  implicit val PaginatedDecoder: EntityDecoder[Paginated] = jsonOf[Paginated]
  implicit val PaginatedEncoder: EntityEncoder[Paginated] = jsonEncoderOf[Paginated]
}
