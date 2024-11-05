package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserSingleAssetBinding._

case class UserSingleAssetBinding (
  /* Permission levels member or partner has on an asset. */
  permissions: Option[List[String]],
user: Option[BusinessAccessUserSummary])

object UserSingleAssetBinding {
  import DateTimeCodecs._

  implicit val UserSingleAssetBindingCodecJson: CodecJson[UserSingleAssetBinding] = CodecJson.derive[UserSingleAssetBinding]
  implicit val UserSingleAssetBindingDecoder: EntityDecoder[UserSingleAssetBinding] = jsonOf[UserSingleAssetBinding]
  implicit val UserSingleAssetBindingEncoder: EntityEncoder[UserSingleAssetBinding] = jsonEncoderOf[UserSingleAssetBinding]
}
