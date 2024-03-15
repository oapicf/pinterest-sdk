package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
 */
case class CatalogsStatus()

object CatalogsStatus {
    /**
     * Creates the codec for converting CatalogsStatus from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsStatus] = deriveEncoder
}
