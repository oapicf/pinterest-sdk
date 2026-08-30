package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DynamicTitlesUploadURL._

case class DynamicTitlesUploadURL (
  /* If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. */
  existingFilename: Option[String],
/* Unique identifier for this upload session. Must be passed to the process endpoint. */
  requestId: String,
/* Pre-signed S3 PUT URL to upload the reviewed CSV file. */
  uploadUrl: String)

object DynamicTitlesUploadURL {
  import DateTimeCodecs._

  implicit val DynamicTitlesUploadURLCodecJson: CodecJson[DynamicTitlesUploadURL] = CodecJson.derive[DynamicTitlesUploadURL]
  implicit val DynamicTitlesUploadURLDecoder: EntityDecoder[DynamicTitlesUploadURL] = jsonOf[DynamicTitlesUploadURL]
  implicit val DynamicTitlesUploadURLEncoder: EntityEncoder[DynamicTitlesUploadURL] = jsonEncoderOf[DynamicTitlesUploadURL]
}
