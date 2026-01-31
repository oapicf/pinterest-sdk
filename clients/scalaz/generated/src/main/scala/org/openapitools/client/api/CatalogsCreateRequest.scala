package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreateRequest._

case class CatalogsCreateRequest (
  catalogType: CatalogsType,
/* A human-friendly name associated to a given catalog. */
  name: String)

object CatalogsCreateRequest {
  import DateTimeCodecs._

  implicit val CatalogsCreateRequestCodecJson: CodecJson[CatalogsCreateRequest] = CodecJson.derive[CatalogsCreateRequest]
  implicit val CatalogsCreateRequestDecoder: EntityDecoder[CatalogsCreateRequest] = jsonOf[CatalogsCreateRequest]
  implicit val CatalogsCreateRequestEncoder: EntityEncoder[CatalogsCreateRequest] = jsonEncoderOf[CatalogsCreateRequest]
}
