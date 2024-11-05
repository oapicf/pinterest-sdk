package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssetAccessRequestResponse._

case class CreateAssetAccessRequestResponse (
  /* A list of errors associated with the asset access requests. Will be returned if there is an error. */
  exceptions: Option[List[CreateAssetAccessRequestErrorMessageInner]],
invites: Option[Map[String, String]])

object CreateAssetAccessRequestResponse {
  import DateTimeCodecs._

  implicit val CreateAssetAccessRequestResponseCodecJson: CodecJson[CreateAssetAccessRequestResponse] = CodecJson.derive[CreateAssetAccessRequestResponse]
  implicit val CreateAssetAccessRequestResponseDecoder: EntityDecoder[CreateAssetAccessRequestResponse] = jsonOf[CreateAssetAccessRequestResponse]
  implicit val CreateAssetAccessRequestResponseEncoder: EntityEncoder[CreateAssetAccessRequestResponse] = jsonEncoderOf[CreateAssetAccessRequestResponse]
}
