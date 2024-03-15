package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SSIOAccountAddress
import scala.collection.immutable.Seq

/**
 * 
 * @param id Salesforce id for billto_info
 * @param ioUnderscoretermsUnderscoreid Salesforce id for IO Terms and Conditions
 * @param ioUnderscoreterms Salesforce text for IO Terms and Conditions
 * @param usUnderscoretermsUnderscoreid Salesforce id for US Terms and Conditions
 * @param usUnderscoreterms Salesforce text for US Terms and Conditions
 * @param rowUnderscoretermsUnderscoreid Salesforce id for Rest of the World Terms and Conditions
 * @param rowUnderscoreterms Salesforce text for Rest of the World Terms and Conditions
 * @param ioUnderscoretype Insertion Order Type - Pinterest Paper or Agency Paper
 * @param addresses Address information that is associated with this account.
 */
case class SSIOAccountItem(id: Option[String],
                ioUnderscoretermsUnderscoreid: Option[String],
                ioUnderscoreterms: Option[String],
                usUnderscoretermsUnderscoreid: Option[String],
                usUnderscoreterms: Option[String],
                rowUnderscoretermsUnderscoreid: Option[String],
                rowUnderscoreterms: Option[String],
                ioUnderscoretype: Option[String],
                addresses: Option[Seq[SSIOAccountAddress]]
                )

object SSIOAccountItem {
    /**
     * Creates the codec for converting SSIOAccountItem from and to JSON.
     */
    implicit val decoder: Decoder[SSIOAccountItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOAccountItem] = deriveEncoder
}
