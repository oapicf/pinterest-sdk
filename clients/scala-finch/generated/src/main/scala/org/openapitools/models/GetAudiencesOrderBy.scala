package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class GetAudiencesOrderBy()

object GetAudiencesOrderBy {
    /**
     * Creates the codec for converting GetAudiencesOrderBy from and to JSON.
     */
    implicit val decoder: Decoder[GetAudiencesOrderBy] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetAudiencesOrderBy] = deriveEncoder
}
