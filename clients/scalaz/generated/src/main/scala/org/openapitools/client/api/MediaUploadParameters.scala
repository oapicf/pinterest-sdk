package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MediaUploadParameters._

case class MediaUploadParameters (
  `contentType`: Option[String],
key: Option[String],
policy: Option[String],
xAmzAlgorithm: Option[String],
xAmzCredential: Option[String],
xAmzDate: Option[String],
xAmzSecurityToken: Option[String],
xAmzSignature: Option[String])

object MediaUploadParameters {
  import DateTimeCodecs._

  implicit val MediaUploadParametersCodecJson: CodecJson[MediaUploadParameters] = CodecJson.derive[MediaUploadParameters]
  implicit val MediaUploadParametersDecoder: EntityDecoder[MediaUploadParameters] = jsonOf[MediaUploadParameters]
  implicit val MediaUploadParametersEncoder: EntityEncoder[MediaUploadParameters] = jsonEncoderOf[MediaUploadParameters]
}
