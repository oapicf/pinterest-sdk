package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UpdateMemberResult
import scala.collection.immutable.Seq

/**
 * 
 * @param items List of members with updated business access role.
 */
case class UpdateMemberResultsResponseArray(items: Option[Seq[UpdateMemberResult]]
                )

object UpdateMemberResultsResponseArray {
    /**
     * Creates the codec for converting UpdateMemberResultsResponseArray from and to JSON.
     */
    implicit val decoder: Decoder[UpdateMemberResultsResponseArray] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateMemberResultsResponseArray] = deriveEncoder
}
