package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateAssetAccessRequestErrorMessageInner
import scala.collection.immutable.Seq

/**
 * 
 * @param exceptions A list of errors associated with the asset access requests. Will be returned if there is an error.
 * @param invites 
 */
case class CreateAssetAccessRequestResponse(exceptions: Option[Seq[CreateAssetAccessRequestErrorMessageInner]],
                invites: Option[Map[String, String]]
                )

object CreateAssetAccessRequestResponse {
    /**
     * Creates the codec for converting CreateAssetAccessRequestResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssetAccessRequestResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssetAccessRequestResponse] = deriveEncoder
}
