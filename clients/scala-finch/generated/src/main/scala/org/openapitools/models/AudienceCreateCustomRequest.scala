package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AudienceDataParty
import org.openapitools.models.AudienceRule
import org.openapitools.models.AudienceSharingType

/**
 * 
 * @param adUnderscoreaccountUnderscoreid Ad account ID.
 * @param name Audience name.
 * @param rule 
 * @param sharingUnderscoretype 
 * @param dataUnderscoreparty 
 * @param category 
 */
case class AudienceCreateCustomRequest(adUnderscoreaccountUnderscoreid: Option[String],
                name: String,
                rule: AudienceRule,
                sharingUnderscoretype: AudienceSharingType,
                dataUnderscoreparty: AudienceDataParty,
                category: Option[String]
                )

object AudienceCreateCustomRequest {
    /**
     * Creates the codec for converting AudienceCreateCustomRequest from and to JSON.
     */
    implicit val decoder: Decoder[AudienceCreateCustomRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceCreateCustomRequest] = deriveEncoder
}
