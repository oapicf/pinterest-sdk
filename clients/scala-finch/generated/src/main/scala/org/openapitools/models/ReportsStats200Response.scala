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
 * @param items 
 * @param bookmark 
 */
case class ReportsStats200Response(items: Seq[CatalogsReportStats],
                bookmark: Option[String]
                )

object ReportsStats200Response {
    /**
     * Creates the codec for converting ReportsStats200Response from and to JSON.
     */
    implicit val decoder: Decoder[ReportsStats200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReportsStats200Response] = deriveEncoder
}
