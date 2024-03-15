package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Image URL-based media source
 * @param sourceUnderscoretype 
 * @param url 
 * @param isUnderscorestandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 */
case class PinMediaSourceImageURL(sourceUnderscoretype: String,
                url: String,
                isUnderscorestandard: Option[Boolean]
                )

object PinMediaSourceImageURL {
    /**
     * Creates the codec for converting PinMediaSourceImageURL from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceImageURL] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceImageURL] = deriveEncoder
}
