package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Creative assets visibility.
 */
case class CreativeAssetsVisibilityType()

object CreativeAssetsVisibilityType {
    /**
     * Creates the codec for converting CreativeAssetsVisibilityType from and to JSON.
     */
    implicit val decoder: Decoder[CreativeAssetsVisibilityType] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreativeAssetsVisibilityType] = deriveEncoder
}
