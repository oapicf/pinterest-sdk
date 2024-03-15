package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccount._

case class AdAccount (
  id: Option[String],
name: Option[String],
owner: Option[AdAccountOwner],
country: Option[Country],
currency: Option[Currency],
permissions: Option[List[BusinessAccessRole]],
/* Creation time. Unix timestamp in seconds. */
  createdTime: Option[Integer],
/* Last update time. Unix timestamp in seconds. */
  updatedTime: Option[Integer])

object AdAccount {
  import DateTimeCodecs._

  implicit val AdAccountCodecJson: CodecJson[AdAccount] = CodecJson.derive[AdAccount]
  implicit val AdAccountDecoder: EntityDecoder[AdAccount] = jsonOf[AdAccount]
  implicit val AdAccountEncoder: EntityEncoder[AdAccount] = jsonEncoderOf[AdAccount]
}
