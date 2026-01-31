package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.S3FilePart
import scala.collection.immutable.Seq

/**
 * 
 * @param fileUnderscoreparts Array of file parts with pre-signed URLs.
 */
case class S3MultipartUploadData(fileUnderscoreparts: Option[Seq[S3FilePart]]
                )

object S3MultipartUploadData {
    /**
     * Creates the codec for converting S3MultipartUploadData from and to JSON.
     */
    implicit val decoder: Decoder[S3MultipartUploadData] = deriveDecoder
    implicit val encoder: ObjectEncoder[S3MultipartUploadData] = deriveEncoder
}
