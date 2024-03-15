package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConversionTagResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class ConversionTagListResponse(items: Option[Seq[ConversionTagResponse]]
                )

object ConversionTagListResponse {
    /**
     * Creates the codec for converting ConversionTagListResponse from and to JSON.
     */
    implicit val decoder: Decoder[ConversionTagListResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionTagListResponse] = deriveEncoder
}
