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
 * @param recipientUnderscorebusinessUnderscoreids List of business IDs to share with or revoke from.
 */
case class BusinessSharedAudience(audienceUnderscoreid: String,
                operationUnderscoretype: OperationType,
                recipientUnderscorebusinessUnderscoreids: Seq[String]
                )

object BusinessSharedAudience {
    /**
     * Creates the codec for converting BusinessSharedAudience from and to JSON.
     */
    implicit val decoder: Decoder[BusinessSharedAudience] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessSharedAudience] = deriveEncoder
}
