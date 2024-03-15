package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdAccount
import scala.collection.immutable.Seq

/**
 * 
 * @param items Ad accounts
 * @param bookmark 
 */
case class AdAccountsList200Response(items: Seq[AdAccount],
                bookmark: Option[String]
                )

object AdAccountsList200Response {
    /**
     * Creates the codec for converting AdAccountsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountsList200Response] = deriveEncoder
}
