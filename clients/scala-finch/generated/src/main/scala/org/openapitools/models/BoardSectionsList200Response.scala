package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BoardSection
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items Board sections
 */
case class BoardSectionsList200Response(bookmark: Option[String],
                items: Seq[BoardSection]
                )

object BoardSectionsList200Response {
    /**
     * Creates the codec for converting BoardSectionsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[BoardSectionsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardSectionsList200Response] = deriveEncoder
}
