package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * An object with a list of partners that were deleted.
 * @param deletedUnderscorepartners List of partners whose business partnership have been terminated.
 */
case class DeletePartnersResponse(deletedUnderscorepartners: Option[Seq[String]]
                )

object DeletePartnersResponse {
    /**
     * Creates the codec for converting DeletePartnersResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeletePartnersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeletePartnersResponse] = deriveEncoder
}
