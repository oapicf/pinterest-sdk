package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SSIOInsertionOrderStatus
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items Insertion orders status by ad acount id
 */
case class SsioInsertionOrdersStatusGetByAdAccount200Response(bookmark: Option[String],
                items: Seq[SSIOInsertionOrderStatus]
                )

object SsioInsertionOrdersStatusGetByAdAccount200Response {
    /**
     * Creates the codec for converting SsioInsertionOrdersStatusGetByAdAccount200Response from and to JSON.
     */
    implicit val decoder: Decoder[SsioInsertionOrdersStatusGetByAdAccount200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[SsioInsertionOrdersStatusGetByAdAccount200Response] = deriveEncoder
}
