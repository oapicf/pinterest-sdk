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
/* Audience ID. */
  id: Option[String],
/* Audience name. */
  name: Option[String],
/* <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
  audienceType: Option[String],
/* Audience description. */
  description: Option[String],
rule: Option[AudienceRule],
/* Audience size. */
  size: Option[Integer],
/* Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. */
  status: Option[String],
/* Always \"audience\". */
  `type`: Option[String],
/* Creation time. Unix timestamp in seconds. */
  createdTimestamp: Option[Integer],
/* Last update time. Unix timestamp in seconds. */
  updatedTimestamp: Option[Integer])

object Audience {
  import DateTimeCodecs._

  implicit val AudienceCodecJson: CodecJson[Audience] = CodecJson.derive[Audience]
  implicit val AudienceDecoder: EntityDecoder[Audience] = jsonOf[Audience]
  implicit val AudienceEncoder: EntityEncoder[Audience] = jsonEncoderOf[Audience]
}
