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
 * @param items Board sections
 * @param bookmark 
 */
case class BoardSectionsList200Response(items: Seq[BoardSection],
                bookmark: Option[String]
                )

object BoardSectionsList200Response {
    /**
     * Creates the codec for converting BoardSectionsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[BoardSectionsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardSectionsList200Response] = deriveEncoder
}
