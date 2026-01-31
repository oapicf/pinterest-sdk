package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param partUnderscorenumber Part number for upload.
 * @param presignedUnderscoreurl Pre-signed URL.
 */
case class S3FilePart(partUnderscorenumber: Int,
                presignedUnderscoreurl: String
                )

object S3FilePart {
    /**
     * Creates the codec for converting S3FilePart from and to JSON.
     */
    implicit val decoder: Decoder[S3FilePart] = deriveDecoder
    implicit val encoder: ObjectEncoder[S3FilePart] = deriveEncoder
}
