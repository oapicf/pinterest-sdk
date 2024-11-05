package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Asset group type
 */
case class AssetGroupType()

object AssetGroupType {
    /**
     * Creates the codec for converting AssetGroupType from and to JSON.
     */
    implicit val decoder: Decoder[AssetGroupType] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetGroupType] = deriveEncoder
}
