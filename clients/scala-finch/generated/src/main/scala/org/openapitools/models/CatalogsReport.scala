package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param reportUnderscorestatus 
 * @param size Size of the report in bytes
 * @param url URL to download the report
 */
case class CatalogsReport(reportUnderscorestatus: Option[String],
                size: Option[BigDecimal],
                url: Option[String]
                )

object CatalogsReport {
    /**
     * Creates the codec for converting CatalogsReport from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsReport] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsReport] = deriveEncoder
}
