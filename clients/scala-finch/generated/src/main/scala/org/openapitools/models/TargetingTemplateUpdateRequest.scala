package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param operationUnderscoretype 
 * @param id Targeting template ID
 */
case class TargetingTemplateUpdateRequest(operationUnderscoretype: String,
                id: String
                )

object TargetingTemplateUpdateRequest {
    /**
     * Creates the codec for converting TargetingTemplateUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[TargetingTemplateUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingTemplateUpdateRequest] = deriveEncoder
}
