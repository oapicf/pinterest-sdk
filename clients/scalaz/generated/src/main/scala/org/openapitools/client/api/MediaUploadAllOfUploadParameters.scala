package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MediaUploadAllOfUploadParameters._

case class MediaUploadAllOfUploadParameters (
  xAmzDate: Option[String],
xAmzSignature: Option[String],
xAmzSecurityToken: Option[String],
xAmzAlgorithm: Option[String],
key: Option[String],
policy: Option[String],
xAmzCredential: Option[String],
`contentType`: Option[String])

object MediaUploadAllOfUploadParameters {
  import DateTimeCodecs._

  implicit val MediaUploadAllOfUploadParametersCodecJson: CodecJson[MediaUploadAllOfUploadParameters] = CodecJson.derive[MediaUploadAllOfUploadParameters]
  implicit val MediaUploadAllOfUploadParametersDecoder: EntityDecoder[MediaUploadAllOfUploadParameters] = jsonOf[MediaUploadAllOfUploadParameters]
  implicit val MediaUploadAllOfUploadParametersEncoder: EntityEncoder[MediaUploadAllOfUploadParameters] = jsonEncoderOf[MediaUploadAllOfUploadParameters]
}
