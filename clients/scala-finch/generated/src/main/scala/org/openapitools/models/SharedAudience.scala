package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OperationType
import scala.collection.immutable.Seq

/**
 * 
 * @param audienceUnderscoreid Unique identifier of an audience
 * @param operationUnderscoretype 
 * @param recipientUnderscoreaccountUnderscoreids List of ad account IDs to share with or revoke from.
 */
case class SharedAudience(audienceUnderscoreid: String,
                operationUnderscoretype: OperationType,
                recipientUnderscoreaccountUnderscoreids: Seq[String]
                )

object SharedAudience {
    /**
     * Creates the codec for converting SharedAudience from and to JSON.
     */
    implicit val decoder: Decoder[SharedAudience] = deriveDecoder
    implicit val encoder: ObjectEncoder[SharedAudience] = deriveEncoder
}
