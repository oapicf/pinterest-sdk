package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param catalogUnderscoreid Unique identifier of a catalog. If not given, oldest catalog will be used
 * @param reportUnderscoretype 
 */
case class CatalogsReportAllItemsFilter(catalogUnderscoreid: Option[String],
                reportUnderscoretype: String
                )

object CatalogsReportAllItemsFilter {
    /**
     * Creates the codec for converting CatalogsReportAllItemsFilter from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsReportAllItemsFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsReportAllItemsFilter] = deriveEncoder
}
