package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * <p>Catalog hotel product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_LISTINGS: Includes every hotel item in your catalog.
 */
case class CatalogsHotelProductGroupType()

object CatalogsHotelProductGroupType {
    /**
     * Creates the codec for converting CatalogsHotelProductGroupType from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelProductGroupType] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelProductGroupType] = deriveEncoder
}
