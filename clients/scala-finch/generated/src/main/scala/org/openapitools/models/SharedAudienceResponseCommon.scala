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
 */
case class SharedAudienceResponseCommon(audienceUnderscoreid: Option[String],
                permissions: Option[Seq[Role]]
                )

object SharedAudienceResponseCommon {
    /**
     * Creates the codec for converting SharedAudienceResponseCommon from and to JSON.
     */
    implicit val decoder: Decoder[SharedAudienceResponseCommon] = deriveDecoder
    implicit val encoder: ObjectEncoder[SharedAudienceResponseCommon] = deriveEncoder
}
