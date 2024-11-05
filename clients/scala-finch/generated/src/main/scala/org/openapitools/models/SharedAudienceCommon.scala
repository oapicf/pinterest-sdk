package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OperationType

/**
 * 
 * @param audienceUnderscoreid Unique identifier of an audience
 * @param operationUnderscoretype 
 */
case class SharedAudienceCommon(audienceUnderscoreid: Option[String],
                operationUnderscoretype: Option[OperationType]
                )

object SharedAudienceCommon {
    /**
     * Creates the codec for converting SharedAudienceCommon from and to JSON.
     */
    implicit val decoder: Decoder[SharedAudienceCommon] = deriveDecoder
    implicit val encoder: ObjectEncoder[SharedAudienceCommon] = deriveEncoder
}
