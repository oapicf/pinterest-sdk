package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountsAudienceCreate._

case class AdAccountsAudienceCreate (
  /* Ad account ID. */
  adAccountId: Option[String],
/* [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
  audienceType: Option[AudienceType],
/* Audience description. */
  description: Option[String],
/* Audience name. */
  name: Option[String],
rule: Option[AdAccountsAudienceRule])

object AdAccountsAudienceCreate {
  import DateTimeCodecs._

  implicit val AdAccountsAudienceCreateCodecJson: CodecJson[AdAccountsAudienceCreate] = CodecJson.derive[AdAccountsAudienceCreate]
  implicit val AdAccountsAudienceCreateDecoder: EntityDecoder[AdAccountsAudienceCreate] = jsonOf[AdAccountsAudienceCreate]
  implicit val AdAccountsAudienceCreateEncoder: EntityEncoder[AdAccountsAudienceCreate] = jsonEncoderOf[AdAccountsAudienceCreate]
}
