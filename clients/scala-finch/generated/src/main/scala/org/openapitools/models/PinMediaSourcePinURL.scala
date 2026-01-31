package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 * @param isUnderscoreaffiliateUnderscorelink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
 * @param sourceUnderscoretype 
 */
case class PinMediaSourcePinURL(isUnderscoreaffiliateUnderscorelink: Option[Boolean],
                sourceUnderscoretype: String
                )

object PinMediaSourcePinURL {
    /**
     * Creates the codec for converting PinMediaSourcePinURL from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourcePinURL] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourcePinURL] = deriveEncoder
}
