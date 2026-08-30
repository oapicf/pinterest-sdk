package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Account._

case class Account (
  /* Profile about description. */
  about: Option[String],
/* Type of account */
  accountType: Option[UserAccountType],
/*   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. */
  boardCount: Option[Integer],
businessName: Option[String],
/* User account follower count. */
  followerCount: Option[Integer],
/* User account following count. */
  followingCount: Option[Integer],
/* User account ID. */
  id: Option[String],
/* User account monthly views. */
  monthlyViews: Option[Integer],
/* User account pin count. This includes both created and saved pins. */
  pinCount: Option[Integer],
profileImage: Option[String],
username: Option[String],
websiteUrl: Option[String])

object Account {
  import DateTimeCodecs._

  implicit val AccountCodecJson: CodecJson[Account] = CodecJson.derive[Account]
  implicit val AccountDecoder: EntityDecoder[Account] = jsonOf[Account]
  implicit val AccountEncoder: EntityEncoder[Account] = jsonEncoderOf[Account]
}
