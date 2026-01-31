package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import S3FilePart._

case class S3FilePart (
  /* Part number for upload. */
  partNumber: Integer,
/* Pre-signed URL. */
  presignedUrl: String)

object S3FilePart {
  import DateTimeCodecs._

  implicit val S3FilePartCodecJson: CodecJson[S3FilePart] = CodecJson.derive[S3FilePart]
  implicit val S3FilePartDecoder: EntityDecoder[S3FilePart] = jsonOf[S3FilePart]
  implicit val S3FilePartEncoder: EntityEncoder[S3FilePart] = jsonEncoderOf[S3FilePart]
}
