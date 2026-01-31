package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SSIOOrderLine
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items SSIO order lines by ad acount id
 */
case class SsioOrderLinesGetByAdAccount200Response(bookmark: Option[String],
                items: Seq[SSIOOrderLine]
                )

object SsioOrderLinesGetByAdAccount200Response {
    /**
     * Creates the codec for converting SsioOrderLinesGetByAdAccount200Response from and to JSON.
     */
    implicit val decoder: Decoder[SsioOrderLinesGetByAdAccount200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[SsioOrderLinesGetByAdAccount200Response] = deriveEncoder
}
