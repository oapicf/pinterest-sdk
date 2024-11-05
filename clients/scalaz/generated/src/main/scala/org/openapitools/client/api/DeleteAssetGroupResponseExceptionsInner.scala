package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteAssetGroupResponseExceptionsInner._

case class DeleteAssetGroupResponseExceptionsInner (
  /* Error code associated with the error deleting asset group. */
  code: Option[Integer],
/* Error message associated with the error deleting asset group. */
  message: Option[String],
/* Asset group id of the exception. */
  assetGroupId: Option[String])

object DeleteAssetGroupResponseExceptionsInner {
  import DateTimeCodecs._

  implicit val DeleteAssetGroupResponseExceptionsInnerCodecJson: CodecJson[DeleteAssetGroupResponseExceptionsInner] = CodecJson.derive[DeleteAssetGroupResponseExceptionsInner]
  implicit val DeleteAssetGroupResponseExceptionsInnerDecoder: EntityDecoder[DeleteAssetGroupResponseExceptionsInner] = jsonOf[DeleteAssetGroupResponseExceptionsInner]
  implicit val DeleteAssetGroupResponseExceptionsInnerEncoder: EntityEncoder[DeleteAssetGroupResponseExceptionsInner] = jsonEncoderOf[DeleteAssetGroupResponseExceptionsInner]
}
