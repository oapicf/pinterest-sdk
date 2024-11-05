package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import CatalogsDbItem._

case class CatalogsDbItem (
  createdAt: OffsetDateTime,
id: String,
updatedAt: OffsetDateTime)

object CatalogsDbItem {
  import DateTimeCodecs._

  implicit val CatalogsDbItemCodecJson: CodecJson[CatalogsDbItem] = CodecJson.derive[CatalogsDbItem]
  implicit val CatalogsDbItemDecoder: EntityDecoder[CatalogsDbItem] = jsonOf[CatalogsDbItem]
  implicit val CatalogsDbItemEncoder: EntityEncoder[CatalogsDbItem] = jsonEncoderOf[CatalogsDbItem]
}
