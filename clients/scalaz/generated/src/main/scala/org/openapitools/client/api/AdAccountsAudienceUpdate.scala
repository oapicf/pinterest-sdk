package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountsAudienceUpdate._

case class AdAccountsAudienceUpdate (
  /* Ad account ID. */
  adAccountId: Option[String],
/* [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
  audienceType: Option[AudienceType],
/* Audience description. */
  description: Option[String],
/* Audience name. */
  name: Option[String],
/* Audience operation type (update or remove). Only valid in update request body. */
  operationType: Option[AudienceUpdateOperationType],
rule: Option[AdAccountsAudienceRule])

object AdAccountsAudienceUpdate {
  import DateTimeCodecs._

  implicit val AdAccountsAudienceUpdateCodecJson: CodecJson[AdAccountsAudienceUpdate] = CodecJson.derive[AdAccountsAudienceUpdate]
  implicit val AdAccountsAudienceUpdateDecoder: EntityDecoder[AdAccountsAudienceUpdate] = jsonOf[AdAccountsAudienceUpdate]
  implicit val AdAccountsAudienceUpdateEncoder: EntityEncoder[AdAccountsAudienceUpdate] = jsonEncoderOf[AdAccountsAudienceUpdate]
}
