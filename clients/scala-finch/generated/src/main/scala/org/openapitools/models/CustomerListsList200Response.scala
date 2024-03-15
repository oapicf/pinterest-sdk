package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CustomerList
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class CustomerListsList200Response(items: Seq[CustomerList],
                bookmark: Option[String]
                )

object CustomerListsList200Response {
    /**
     * Creates the codec for converting CustomerListsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[CustomerListsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomerListsList200Response] = deriveEncoder
}
