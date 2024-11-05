package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssetAccessRequestErrorMessageInner._

case class CreateAssetAccessRequestErrorMessageInner (
  /* Error code associated with the error in requesting asset access. */
  code: Option[Integer],
messages: Option[List[String]])

object CreateAssetAccessRequestErrorMessageInner {
  import DateTimeCodecs._

  implicit val CreateAssetAccessRequestErrorMessageInnerCodecJson: CodecJson[CreateAssetAccessRequestErrorMessageInner] = CodecJson.derive[CreateAssetAccessRequestErrorMessageInner]
  implicit val CreateAssetAccessRequestErrorMessageInnerDecoder: EntityDecoder[CreateAssetAccessRequestErrorMessageInner] = jsonOf[CreateAssetAccessRequestErrorMessageInner]
  implicit val CreateAssetAccessRequestErrorMessageInnerEncoder: EntityEncoder[CreateAssetAccessRequestErrorMessageInner] = jsonEncoderOf[CreateAssetAccessRequestErrorMessageInner]
}
