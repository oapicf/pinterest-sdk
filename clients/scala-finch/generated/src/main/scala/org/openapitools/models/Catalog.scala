package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.CatalogsType

/**
 * Catalog entity
 * @param createdUnderscoreat 
 * @param id ID of the catalog entity.
 * @param updatedUnderscoreat 
 * @param name A human-friendly name associated to a catalog entity.
 * @param catalogUnderscoretype 
 */
case class Catalog(createdUnderscoreat: ZonedDateTime,
                id: String,
                updatedUnderscoreat: ZonedDateTime,
                name: String,
                catalogUnderscoretype: CatalogsType
                )

object Catalog {
    /**
     * Creates the codec for converting Catalog from and to JSON.
     */
    implicit val decoder: Decoder[Catalog] = deriveDecoder
    implicit val encoder: ObjectEncoder[Catalog] = deriveEncoder
}
