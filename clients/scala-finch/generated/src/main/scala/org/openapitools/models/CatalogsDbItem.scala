package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime

/**
 * 
 * @param createdUnderscoreat 
 * @param id 
 * @param updatedUnderscoreat 
 */
case class CatalogsDbItem(createdUnderscoreat: ZonedDateTime,
                id: String,
                updatedUnderscoreat: ZonedDateTime
                )

object CatalogsDbItem {
    /**
     * Creates the codec for converting CatalogsDbItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsDbItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsDbItem] = deriveEncoder
}
