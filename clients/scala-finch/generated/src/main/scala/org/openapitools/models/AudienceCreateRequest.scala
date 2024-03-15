package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AudienceCreateRequest1AudienceType
import org.openapitools.models.AudienceRule

/**
 * 
 * @param adUnderscoreaccountUnderscoreid Ad account ID.
 * @param name Audience name.
 * @param rule 
 * @param description Audience description.
 * @param audienceUnderscoretype 
 */
case class AudienceCreateRequest(adUnderscoreaccountUnderscoreid: Option[String],
                name: String,
                rule: AudienceRule,
                description: Option[String],
                audienceUnderscoretype: AudienceCreateRequest1AudienceType
                )

object AudienceCreateRequest {
    /**
     * Creates the codec for converting AudienceCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[AudienceCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceCreateRequest] = deriveEncoder
}
