package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Label
import scala.collection.immutable.Seq

/**
 * 
 * @param data 
 * @param errorUnderscoremessages 
 */
case class LabelError(data: Option[Label],
                errorUnderscoremessages: Option[Seq[String]]
                )

object LabelError {
    /**
     * Creates the codec for converting LabelError from and to JSON.
     */
    implicit val decoder: Decoder[LabelError] = deriveDecoder
    implicit val encoder: ObjectEncoder[LabelError] = deriveEncoder
}
