package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SSIOAccountItem
import org.openapitools.models.SSIOAccountPMPName
import scala.collection.immutable.Seq

/**
 * 
 * @param billtoUnderscoreinfos An array of Salesforce account information that includes address, io terms, etc.
 * @param canUnderscoreedit Advertiser eligible to update order lines
 * @param currency 
 * @param eligible Advertiser eligible to create order lines
 * @param error Error indicator from Salesforce which could be \"No Error\"
 * @param pmpUnderscorenames 
 */
case class SSIOAccountResponse(billtoUnderscoreinfos: Option[Seq[SSIOAccountItem]],
                canUnderscoreedit: Option[Boolean],
                currency: Option[String],
                eligible: Option[Boolean],
                error: Option[String],
                pmpUnderscorenames: Option[Seq[SSIOAccountPMPName]]
                )

object SSIOAccountResponse {
    /**
     * Creates the codec for converting SSIOAccountResponse from and to JSON.
     */
    implicit val decoder: Decoder[SSIOAccountResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOAccountResponse] = deriveEncoder
}
