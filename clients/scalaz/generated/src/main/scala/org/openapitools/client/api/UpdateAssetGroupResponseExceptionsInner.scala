package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateAssetGroupResponseExceptionsInner._

case class UpdateAssetGroupResponseExceptionsInner (
  /* Error code associated with the error editing asset group. */
  code: Option[Integer],
/* Error message associated with the error editing asset group. */
  message: Option[String],
/* Asset group id of the exception. */
  assetGroupId: Option[String])

object UpdateAssetGroupResponseExceptionsInner {
  import DateTimeCodecs._

  implicit val UpdateAssetGroupResponseExceptionsInnerCodecJson: CodecJson[UpdateAssetGroupResponseExceptionsInner] = CodecJson.derive[UpdateAssetGroupResponseExceptionsInner]
  implicit val UpdateAssetGroupResponseExceptionsInnerDecoder: EntityDecoder[UpdateAssetGroupResponseExceptionsInner] = jsonOf[UpdateAssetGroupResponseExceptionsInner]
  implicit val UpdateAssetGroupResponseExceptionsInnerEncoder: EntityEncoder[UpdateAssetGroupResponseExceptionsInner] = jsonEncoderOf[UpdateAssetGroupResponseExceptionsInner]
}
