package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class Paginated(items: Seq[Object],
                bookmark: Option[String]
                )

object Paginated {
    /**
     * Creates the codec for converting Paginated from and to JSON.
     */
    implicit val decoder: Decoder[Paginated] = deriveDecoder
    implicit val encoder: ObjectEncoder[Paginated] = deriveEncoder
}
