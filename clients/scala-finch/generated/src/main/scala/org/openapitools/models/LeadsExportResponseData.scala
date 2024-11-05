package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LeadsExportStatus

/**
 * 
 * @param exportUnderscorestatus 
 * @param downloadUnderscoreurl 
 */
case class LeadsExportResponseData(exportUnderscorestatus: Option[LeadsExportStatus],
                downloadUnderscoreurl: Option[String]
                )

object LeadsExportResponseData {
    /**
     * Creates the codec for converting LeadsExportResponseData from and to JSON.
     */
    implicit val decoder: Decoder[LeadsExportResponseData] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadsExportResponseData] = deriveEncoder
}
