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
  accountType: AudienceAccountType,
/* Epoch timestamp in seconds for the shared audience event */
  sharedOnTimestamp: Integer)

object SharedAudienceAccount {
  import DateTimeCodecs._

  implicit val SharedAudienceAccountCodecJson: CodecJson[SharedAudienceAccount] = CodecJson.derive[SharedAudienceAccount]
  implicit val SharedAudienceAccountDecoder: EntityDecoder[SharedAudienceAccount] = jsonOf[SharedAudienceAccount]
  implicit val SharedAudienceAccountEncoder: EntityEncoder[SharedAudienceAccount] = jsonEncoderOf[SharedAudienceAccount]
}
