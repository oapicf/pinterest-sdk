package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssetGroupBinding

/**
 * 
 * @param assetUnderscoregroup 
 */
case class CreateAssetGroupResponse(assetUnderscoregroup: Option[AssetGroupBinding]
                )

object CreateAssetGroupResponse {
    /**
     * Creates the codec for converting CreateAssetGroupResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssetGroupResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssetGroupResponse] = deriveEncoder
}
