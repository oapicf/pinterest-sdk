package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Request object for creating a catalog.
 * @param catalogUnderscoretype Type of the catalog entity.
 * @param name A human-friendly name associated to a given catalog.
 */
case class CatalogsCreateRequest(catalogUnderscoretype: String,
                name: String
                )

object CatalogsCreateRequest {
    /**
     * Creates the codec for converting CatalogsCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreateRequest] = deriveEncoder
}
