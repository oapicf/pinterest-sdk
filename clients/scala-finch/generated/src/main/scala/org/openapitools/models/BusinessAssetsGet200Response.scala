package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.GetBusinessAssetsResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param items List of assets the requesting business has access to.
 * @param bookmark 
 */
case class BusinessAssetsGet200Response(items: Seq[GetBusinessAssetsResponse],
                bookmark: Option[String]
                )

object BusinessAssetsGet200Response {
    /**
     * Creates the codec for converting BusinessAssetsGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[BusinessAssetsGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessAssetsGet200Response] = deriveEncoder
}
