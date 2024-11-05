package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Type of asset.
 */
case class GetBusinessAssetTypeResponse()

object GetBusinessAssetTypeResponse {
    /**
     * Creates the codec for converting GetBusinessAssetTypeResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetBusinessAssetTypeResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBusinessAssetTypeResponse] = deriveEncoder
}
