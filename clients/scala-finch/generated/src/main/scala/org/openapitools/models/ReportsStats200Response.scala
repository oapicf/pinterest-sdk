package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsReportStats
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class ReportsStats200Response(bookmark: Option[String],
                items: Seq[CatalogsReportStats]
                )

object ReportsStats200Response {
    /**
     * Creates the codec for converting ReportsStats200Response from and to JSON.
     */
    implicit val decoder: Decoder[ReportsStats200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReportsStats200Response] = deriveEncoder
}
