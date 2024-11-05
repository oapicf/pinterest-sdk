package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MatchType

/**
 * 
 * @param matchUnderscoretype 
 * @param value The keyword targeting (120 chars max).
 */
case class TargetingTemplateKeyword(matchUnderscoretype: Option[MatchType],
                value: Option[String]
                )

object TargetingTemplateKeyword {
    /**
     * Creates the codec for converting TargetingTemplateKeyword from and to JSON.
     */
    implicit val decoder: Decoder[TargetingTemplateKeyword] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingTemplateKeyword] = deriveEncoder
}
