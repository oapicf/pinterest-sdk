package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConversionTag
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class ConversionTagsList200Response(items: Seq[ConversionTag]
                )

object ConversionTagsList200Response {
    /**
     * Creates the codec for converting ConversionTagsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[ConversionTagsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionTagsList200Response] = deriveEncoder
}
