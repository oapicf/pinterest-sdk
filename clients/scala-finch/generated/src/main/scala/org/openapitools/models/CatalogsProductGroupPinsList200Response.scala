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
 * @param items Pins
 * @param bookmark 
 */
case class CatalogsProductGroupPinsList200Response(items: Seq[CatalogsProduct],
                bookmark: Option[String]
                )

object CatalogsProductGroupPinsList200Response {
    /**
     * Creates the codec for converting CatalogsProductGroupPinsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupPinsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupPinsList200Response] = deriveEncoder
}
