package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdResponse
import org.openapitools.models.Exception

/**
 * 
 * @param data 
 * @param exceptions 
 */
case class AdArrayResponseElement(data: Option[AdResponse],
                exceptions: Option[Exception]
                )

object AdArrayResponseElement {
    /**
     * Creates the codec for converting AdArrayResponseElement from and to JSON.
     */
    implicit val decoder: Decoder[AdArrayResponseElement] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdArrayResponseElement] = deriveEncoder
}
