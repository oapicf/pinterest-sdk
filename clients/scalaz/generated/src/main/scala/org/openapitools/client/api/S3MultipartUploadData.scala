package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import S3MultipartUploadData._

case class S3MultipartUploadData (
  /* Array of file parts with pre-signed URLs. */
  fileParts: Option[List[S3FilePart]])

object S3MultipartUploadData {
  import DateTimeCodecs._

  implicit val S3MultipartUploadDataCodecJson: CodecJson[S3MultipartUploadData] = CodecJson.derive[S3MultipartUploadData]
  implicit val S3MultipartUploadDataDecoder: EntityDecoder[S3MultipartUploadData] = jsonOf[S3MultipartUploadData]
  implicit val S3MultipartUploadDataEncoder: EntityEncoder[S3MultipartUploadData] = jsonEncoderOf[S3MultipartUploadData]
}
