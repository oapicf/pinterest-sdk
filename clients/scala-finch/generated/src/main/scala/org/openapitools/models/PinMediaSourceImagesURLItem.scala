package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param description 
 * @param link 
 * @param title 
 * @param url 
 */
case class PinMediaSourceImagesURLItem(description: Option[String],
                link: Option[String],
                title: Option[String],
                url: String
                )

object PinMediaSourceImagesURLItem {
    /**
     * Creates the codec for converting PinMediaSourceImagesURLItem from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSourceImagesURLItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSourceImagesURLItem] = deriveEncoder
}
