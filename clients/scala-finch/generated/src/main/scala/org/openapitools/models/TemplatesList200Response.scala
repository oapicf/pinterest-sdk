package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TemplateResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class TemplatesList200Response(items: Seq[TemplateResponse],
                bookmark: Option[String]
                )

object TemplatesList200Response {
    /**
     * Creates the codec for converting TemplatesList200Response from and to JSON.
     */
    implicit val decoder: Decoder[TemplatesList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[TemplatesList200Response] = deriveEncoder
}
