package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TargetingTemplateGetResponseData
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class TargetingTemplateList200Response(bookmark: Option[String],
                items: Seq[TargetingTemplateGetResponseData]
                )

object TargetingTemplateList200Response {
    /**
     * Creates the codec for converting TargetingTemplateList200Response from and to JSON.
     */
    implicit val decoder: Decoder[TargetingTemplateList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingTemplateList200Response] = deriveEncoder
}
