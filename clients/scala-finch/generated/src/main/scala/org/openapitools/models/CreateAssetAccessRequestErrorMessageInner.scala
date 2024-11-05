package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param code Error code associated with the error in requesting asset access.
 * @param messages 
 */
case class CreateAssetAccessRequestErrorMessageInner(code: Option[Int],
                messages: Option[Seq[String]]
                )

object CreateAssetAccessRequestErrorMessageInner {
    /**
     * Creates the codec for converting CreateAssetAccessRequestErrorMessageInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssetAccessRequestErrorMessageInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssetAccessRequestErrorMessageInner] = deriveEncoder
}
