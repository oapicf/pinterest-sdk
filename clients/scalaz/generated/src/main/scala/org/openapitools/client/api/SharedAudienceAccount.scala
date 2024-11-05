package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SharedAudienceAccount._

case class SharedAudienceAccount (
  /* Account ID (ad account or business ID). */
  accountId: String,
/* Account name. */
  accountName: String,
/* account type */
  accountType: AccountType,
/* Epoch timestamp in seconds for the shared audience event */
  sharedOnTimestamp: Integer)

object SharedAudienceAccount {
  import DateTimeCodecs._
  sealed trait AccountType
  case object ADACCOUNT extends AccountType
  case object BUSINESSACCOUNT extends AccountType

  object AccountType {
    def toAccountType(s: String): Option[AccountType] = s match {
      case "ADACCOUNT" => Some(ADACCOUNT)
      case "BUSINESSACCOUNT" => Some(BUSINESSACCOUNT)
      case _ => None
    }

    def fromAccountType(x: AccountType): String = x match {
      case ADACCOUNT => "ADACCOUNT"
      case BUSINESSACCOUNT => "BUSINESSACCOUNT"
    }
  }

  implicit val AccountTypeEnumEncoder: EncodeJson[AccountType] =
    EncodeJson[AccountType](is => StringEncodeJson(AccountType.fromAccountType(is)))

  implicit val AccountTypeEnumDecoder: DecodeJson[AccountType] =
    DecodeJson.optionDecoder[AccountType](n => n.string.flatMap(jStr => AccountType.toAccountType(jStr)), "AccountType failed to de-serialize")

  implicit val SharedAudienceAccountCodecJson: CodecJson[SharedAudienceAccount] = CodecJson.derive[SharedAudienceAccount]
  implicit val SharedAudienceAccountDecoder: EntityDecoder[SharedAudienceAccount] = jsonOf[SharedAudienceAccount]
  implicit val SharedAudienceAccountEncoder: EntityEncoder[SharedAudienceAccount] = jsonEncoderOf[SharedAudienceAccount]
}
