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
 * @param name Audience name.
 * @param rule 
 */
case class AudienceCommon(adUnderscoreaccountUnderscoreid: Option[String],
                name: Option[String],
                rule: Option[AudienceRule]
                )

object AudienceCommon {
    /**
     * Creates the codec for converting AudienceCommon from and to JSON.
     */
    implicit val decoder: Decoder[AudienceCommon] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceCommon] = deriveEncoder
}
