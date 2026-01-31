package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProduct
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items Pins
 */
case class CatalogsProductGroupPinsList200Response(bookmark: Option[String],
                items: Seq[CatalogsProduct]
                )

object CatalogsProductGroupPinsList200Response {
    /**
     * Creates the codec for converting CatalogsProductGroupPinsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupPinsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupPinsList200Response] = deriveEncoder
}
