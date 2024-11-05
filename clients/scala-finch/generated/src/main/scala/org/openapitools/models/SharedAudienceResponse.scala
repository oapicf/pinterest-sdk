package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Role
import scala.collection.immutable.Seq

/**
 * 
 * @param audienceUnderscoreid Audience ID that was shared
 * @param permissions 
 * @param recipientUnderscoreaccountUnderscoreids Account IDs that received the audience
 */
case class SharedAudienceResponse(audienceUnderscoreid: Option[String],
                permissions: Option[Seq[Role]],
                recipientUnderscoreaccountUnderscoreids: Option[Seq[String]]
                )

object SharedAudienceResponse {
    /**
     * Creates the codec for converting SharedAudienceResponse from and to JSON.
     */
    implicit val decoder: Decoder[SharedAudienceResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[SharedAudienceResponse] = deriveEncoder
}
