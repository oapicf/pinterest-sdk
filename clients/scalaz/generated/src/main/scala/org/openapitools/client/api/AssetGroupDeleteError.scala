package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetGroupDeleteError._

case class AssetGroupDeleteError (
  /* Asset group id of the exception. */
  assetGroupId: Option[String],
/* Error code associated with the error deleting asset group. */
  code: Option[Integer],
/* Error message associated with the error deleting asset group. */
  message: Option[String])

object AssetGroupDeleteError {
  import DateTimeCodecs._

  implicit val AssetGroupDeleteErrorCodecJson: CodecJson[AssetGroupDeleteError] = CodecJson.derive[AssetGroupDeleteError]
  implicit val AssetGroupDeleteErrorDecoder: EntityDecoder[AssetGroupDeleteError] = jsonOf[AssetGroupDeleteError]
  implicit val AssetGroupDeleteErrorEncoder: EntityEncoder[AssetGroupDeleteError] = jsonEncoderOf[AssetGroupDeleteError]
}
