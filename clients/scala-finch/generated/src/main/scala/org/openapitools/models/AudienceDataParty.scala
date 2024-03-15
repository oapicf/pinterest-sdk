package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Whether the data is owned by the partner (1p) or by the data provider (3p)
 */
case class AudienceDataParty()

object AudienceDataParty {
    /**
     * Creates the codec for converting AudienceDataParty from and to JSON.
     */
    implicit val decoder: Decoder[AudienceDataParty] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceDataParty] = deriveEncoder
}
