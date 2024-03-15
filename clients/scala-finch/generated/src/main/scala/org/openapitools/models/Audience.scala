package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AudienceRule

/**
 * 
 * @param adUnderscoreaccountUnderscoreid Ad account ID.
 * @param id Audience ID.
 * @param name Audience name.
 * @param audienceUnderscoretype <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
 * @param description Audience description.
 * @param rule 
 * @param size Audience size.
 * @param status Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
 * @param _type Always \"audience\".
 * @param createdUnderscoretimestamp Creation time. Unix timestamp in seconds.
 * @param updatedUnderscoretimestamp Last update time. Unix timestamp in seconds.
 */
case class Audience(adUnderscoreaccountUnderscoreid: Option[String],
                id: Option[String],
                name: Option[String],
                audienceUnderscoretype: Option[String],
                description: Option[String],
                rule: Option[AudienceRule],
                size: Option[Int],
                status: Option[String],
                _type: Option[String],
                createdUnderscoretimestamp: Option[Int],
                updatedUnderscoretimestamp: Option[Int]
                )

object Audience {
    /**
     * Creates the codec for converting Audience from and to JSON.
     */
    implicit val decoder: Decoder[Audience] = deriveDecoder
    implicit val encoder: ObjectEncoder[Audience] = deriveEncoder
}
