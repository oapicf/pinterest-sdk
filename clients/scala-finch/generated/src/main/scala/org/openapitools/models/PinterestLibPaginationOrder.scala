package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class PinterestLibPaginationOrder()

object PinterestLibPaginationOrder {
    /**
     * Creates the codec for converting PinterestLibPaginationOrder from and to JSON.
     */
    implicit val decoder: Decoder[PinterestLibPaginationOrder] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinterestLibPaginationOrder] = deriveEncoder
}
