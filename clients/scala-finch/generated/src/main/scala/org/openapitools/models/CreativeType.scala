package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 */
case class CreativeType()

object CreativeType {
    /**
     * Creates the codec for converting CreativeType from and to JSON.
     */
    implicit val decoder: Decoder[CreativeType] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreativeType] = deriveEncoder
}
