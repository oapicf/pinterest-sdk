package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrderLine
import scala.collection.immutable.Seq

/**
 * 
 * @param data 
 * @param errorUnderscoremessages 
 */
case class OrderLineError(data: Option[OrderLine],
                errorUnderscoremessages: Option[Seq[String]]
                )

object OrderLineError {
    /**
     * Creates the codec for converting OrderLineError from and to JSON.
     */
    implicit val decoder: Decoder[OrderLineError] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderLineError] = deriveEncoder
}
