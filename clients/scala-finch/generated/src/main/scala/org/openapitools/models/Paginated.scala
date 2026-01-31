package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class Paginated(bookmark: Option[String],
                items: Seq[Object]
                )

object Paginated {
    /**
     * Creates the codec for converting Paginated from and to JSON.
     */
    implicit val decoder: Decoder[Paginated] = deriveDecoder
    implicit val encoder: ObjectEncoder[Paginated] = deriveEncoder
}
