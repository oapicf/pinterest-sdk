package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * The main hotel image
 * @param link <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
 * @param tag Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
 */
case class CatalogsHotelAttributesAllOfMainImage(link: Option[String],
                tag: Option[Seq[String]]
                )

object CatalogsHotelAttributesAllOfMainImage {
    /**
     * Creates the codec for converting CatalogsHotelAttributesAllOfMainImage from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelAttributesAllOfMainImage] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelAttributesAllOfMainImage] = deriveEncoder
}
