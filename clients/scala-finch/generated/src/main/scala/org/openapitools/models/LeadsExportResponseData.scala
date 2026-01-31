package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LeadsExportStatus

/**
 * 
 * @param downloadUnderscoreurl 
 * @param exportUnderscorestatus 
 */
case class LeadsExportResponseData(downloadUnderscoreurl: Option[String],
                exportUnderscorestatus: Option[LeadsExportStatus]
                )

object LeadsExportResponseData {
    /**
     * Creates the codec for converting LeadsExportResponseData from and to JSON.
     */
    implicit val decoder: Decoder[LeadsExportResponseData] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadsExportResponseData] = deriveEncoder
}
