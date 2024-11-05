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
 * @param recipientUnderscorebusinessUnderscoreids Business IDs that received the audience
 */
case class BusinessSharedAudienceResponse(audienceUnderscoreid: Option[String],
                permissions: Option[Seq[Role]],
                recipientUnderscorebusinessUnderscoreids: Option[Seq[String]]
                )

object BusinessSharedAudienceResponse {
    /**
     * Creates the codec for converting BusinessSharedAudienceResponse from and to JSON.
     */
    implicit val decoder: Decoder[BusinessSharedAudienceResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessSharedAudienceResponse] = deriveEncoder
}
