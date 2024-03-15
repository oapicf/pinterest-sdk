package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * Board media.
 * @param imageUnderscorecoverUnderscoreurl Board cover image.
 * @param pinUnderscorethumbnailUnderscoreurls Board pin thumbnail urls.
 */
case class BoardMedia(imageUnderscorecoverUnderscoreurl: Option[String],
                pinUnderscorethumbnailUnderscoreurls: Option[Seq[String]]
                )

object BoardMedia {
    /**
     * Creates the codec for converting BoardMedia from and to JSON.
     */
    implicit val decoder: Decoder[BoardMedia] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardMedia] = deriveEncoder
}
