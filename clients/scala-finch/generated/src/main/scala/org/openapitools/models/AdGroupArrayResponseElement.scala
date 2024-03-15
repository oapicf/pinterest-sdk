package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdGroupResponse
import org.openapitools.models.Exception
import scala.collection.immutable.Seq

/**
 * 
 * @param data 
 * @param exceptions 
 */
case class AdGroupArrayResponseElement(data: Option[AdGroupResponse],
                exceptions: Option[Seq[Exception]]
                )

object AdGroupArrayResponseElement {
    /**
     * Creates the codec for converting AdGroupArrayResponseElement from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupArrayResponseElement] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupArrayResponseElement] = deriveEncoder
}
