package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Account._

case class Account (
  /* Type of account */
  accountType: Option[AccountType],
/* User account ID. */
  id: Option[String],
profileImage: Option[String],
websiteUrl: Option[String],
username: Option[String],
/* Profile about description. */
  about: Option[String],
businessName: Option[String],
/* User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. */
  boardCount: Option[Integer],
/* User account pin count. This includes both created and saved pins. */
  pinCount: Option[Integer],
/* User account follower count. */
  followerCount: Option[Integer],
/* User account following count. */
  followingCount: Option[Integer],
/* User account monthly views. */
  monthlyViews: Option[Integer])

object Account {
  import DateTimeCodecs._
  sealed trait AccountType
  case object PINNER extends AccountType
  case object BUSINESS extends AccountType

  object AccountType {
    def toAccountType(s: String): Option[AccountType] = s match {
      case "PINNER" => Some(PINNER)
      case "BUSINESS" => Some(BUSINESS)
      case _ => None
    }

    def fromAccountType(x: AccountType): String = x match {
      case PINNER => "PINNER"
      case BUSINESS => "BUSINESS"
    }
  }

  implicit val AccountTypeEnumEncoder: EncodeJson[AccountType] =
    EncodeJson[AccountType](is => StringEncodeJson(AccountType.fromAccountType(is)))

  implicit val AccountTypeEnumDecoder: DecodeJson[AccountType] =
    DecodeJson.optionDecoder[AccountType](n => n.string.flatMap(jStr => AccountType.toAccountType(jStr)), "AccountType failed to de-serialize")

  implicit val AccountCodecJson: CodecJson[Account] = CodecJson.derive[Account]
  implicit val AccountDecoder: EntityDecoder[Account] = jsonOf[Account]
  implicit val AccountEncoder: EntityEncoder[Account] = jsonEncoderOf[Account]
}
