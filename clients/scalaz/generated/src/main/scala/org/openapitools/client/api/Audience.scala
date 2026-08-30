package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Audience._

case class Audience (
  /* Ad account ID. */
  adAccountId: Option[String],
/* [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
  audienceType: Option[PinnerListType],
/* The company that created this audience. */
  createdByCompanyName: Option[String],
/* Creation time. Unix timestamp in seconds. */
  createdTimestamp: Option[Integer],
/* Audience description. */
  description: Option[String],
/* Audience ID. */
  id: Option[String],
/* Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. */
  isNca: Option[Boolean],
/* Audience name. */
  name: Option[String],
rule: Option[AudienceRule],
/* Audience size. */
  size: Option[Integer],
/* Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. */
  status: Option[AudienceStatus],
/* Always \"audience\". */
  `type`: Option[String],
/* Last update time. Unix timestamp in seconds. */
  updatedTimestamp: Option[Integer])

object Audience {
  import DateTimeCodecs._

  implicit val AudienceCodecJson: CodecJson[Audience] = CodecJson.derive[Audience]
  implicit val AudienceDecoder: EntityDecoder[Audience] = jsonOf[Audience]
  implicit val AudienceEncoder: EntityEncoder[Audience] = jsonEncoderOf[Audience]
}
