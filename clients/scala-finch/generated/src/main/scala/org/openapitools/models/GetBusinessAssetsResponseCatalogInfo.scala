package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
 * @param catalogUnderscoretype Catalog type
 * @param id Catalog ID.
 * @param name Catalog name
 */
case class GetBusinessAssetsResponseCatalogInfo(catalogUnderscoretype: Option[String],
                id: Option[String],
                name: Option[String]
                )

object GetBusinessAssetsResponseCatalogInfo {
    /**
     * Creates the codec for converting GetBusinessAssetsResponseCatalogInfo from and to JSON.
     */
    implicit val decoder: Decoder[GetBusinessAssetsResponseCatalogInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBusinessAssetsResponseCatalogInfo] = deriveEncoder
}
