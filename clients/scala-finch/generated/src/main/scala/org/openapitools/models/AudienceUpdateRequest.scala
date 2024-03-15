package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AudienceRule
import org.openapitools.models.AudienceUpdateOperationType

/**
 * 
 * @param adUnderscoreaccountUnderscoreid Ad account ID.
 * @param name Audience name.
 * @param rule 
 * @param description Audience description.
 * @param operationUnderscoretype 
 */
case class AudienceUpdateRequest(adUnderscoreaccountUnderscoreid: Option[String],
                name: Option[String],
                rule: Option[AudienceRule],
                description: Option[String],
                operationUnderscoretype: Option[AudienceUpdateOperationType]
                )

object AudienceUpdateRequest {
    /**
     * Creates the codec for converting AudienceUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[AudienceUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceUpdateRequest] = deriveEncoder
}
