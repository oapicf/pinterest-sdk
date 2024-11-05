package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Exception
import org.openapitools.models.LeadFormResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param data 
 * @param exceptions 
 */
case class LeadFormArrayResponseItemsInner(data: Option[LeadFormResponse],
                exceptions: Option[Seq[Exception]]
                )

object LeadFormArrayResponseItemsInner {
    /**
     * Creates the codec for converting LeadFormArrayResponseItemsInner from and to JSON.
     */
    implicit val decoder: Decoder[LeadFormArrayResponseItemsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadFormArrayResponseItemsInner] = deriveEncoder
}
