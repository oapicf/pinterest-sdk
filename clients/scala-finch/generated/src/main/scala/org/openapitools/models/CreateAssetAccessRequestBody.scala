package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateAssetAccessRequestBodyAssetRequestsInner
import scala.collection.immutable.Seq

/**
 * An object containing a list of all the asset access requests
 * @param assetUnderscorerequests 
 */
case class CreateAssetAccessRequestBody(assetUnderscorerequests: Seq[CreateAssetAccessRequestBodyAssetRequestsInner]
                )

object CreateAssetAccessRequestBody {
    /**
     * Creates the codec for converting CreateAssetAccessRequestBody from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssetAccessRequestBody] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssetAccessRequestBody] = deriveEncoder
}
