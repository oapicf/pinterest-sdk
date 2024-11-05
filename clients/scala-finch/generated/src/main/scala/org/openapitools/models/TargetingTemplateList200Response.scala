package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TargetingTemplateResponseData
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class TargetingTemplateList200Response(items: Seq[TargetingTemplateResponseData],
                bookmark: Option[String]
                )

object TargetingTemplateList200Response {
    /**
     * Creates the codec for converting TargetingTemplateList200Response from and to JSON.
     */
    implicit val decoder: Decoder[TargetingTemplateList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingTemplateList200Response] = deriveEncoder
}
