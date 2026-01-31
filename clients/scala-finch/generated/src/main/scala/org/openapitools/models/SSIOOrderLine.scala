package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.LocalDateTime
import org.openapitools.models.BigDecimal
import org.openapitools.models.Currency

/**
 * 
 * @param acceptedUnderscoretermsUnderscoreid The SFDC id for the terms
 * @param acceptedUnderscoretermsUnderscoretime The UTC timestamp (to the nearest sec) of when terms were accepted
 * @param adsUnderscoremanagerUnderscoreorderUnderscorelineUnderscoreid Ads manager OrderLineId
 * @param agencyUnderscorelink Agency link
 * @param billUnderscoretoUnderscorecompanyUnderscorename Bill To Company name
 * @param billingUnderscorecontactUnderscoreemail Billing contact email
 * @param billingUnderscorecontactUnderscorefirstname Billing contact first name
 * @param billingUnderscorecontactUnderscorelastname Billing contact last name
 * @param budgetUnderscoreamount If Budget order line, the budget amount.
 * @param currencyUnderscoreinfo 
 * @param endUnderscoredate End date of the order line.
 * @param estimatedUnderscoremonthlyUnderscorespend If Ongoing (perpetual) order line, the estimated monthly spend
 * @param lastUnderscoremodifiedUnderscoredateUnderscoretime Last modified date.
 * @param mediaUnderscorecontactUnderscoreemail Billing media email
 * @param mediaUnderscorecontactUnderscorefirstname Billing contact first name
 * @param mediaUnderscorecontactUnderscorelastname Billing contact first name
 * @param orderUnderscorename The order name
 * @param pinUnderscoreorderUnderscoreid The pin order id associated with the order line in SFDC
 * @param pmpUnderscorename The Pinterest marketing partner name
 * @param poUnderscorenumber The po number
 * @param salesforceUnderscoreorderUnderscorelineUnderscoreid OrderLineId in SFDC
 * @param startUnderscoredate Start date of the order line.
 */
case class SSIOOrderLine(acceptedUnderscoretermsUnderscoreid: Option[String],
                acceptedUnderscoretermsUnderscoretime: Option[String],
                adsUnderscoremanagerUnderscoreorderUnderscorelineUnderscoreid: Option[String],
                agencyUnderscorelink: Option[String],
                billUnderscoretoUnderscorecompanyUnderscorename: Option[String],
                billingUnderscorecontactUnderscoreemail: Option[String],
                billingUnderscorecontactUnderscorefirstname: Option[String],
                billingUnderscorecontactUnderscorelastname: Option[String],
                budgetUnderscoreamount: Option[BigDecimal],
                currencyUnderscoreinfo: Option[Currency],
                endUnderscoredate: Option[LocalDateTime],
                estimatedUnderscoremonthlyUnderscorespend: Option[BigDecimal],
                lastUnderscoremodifiedUnderscoredateUnderscoretime: Option[String],
                mediaUnderscorecontactUnderscoreemail: Option[String],
                mediaUnderscorecontactUnderscorefirstname: Option[String],
                mediaUnderscorecontactUnderscorelastname: Option[String],
                orderUnderscorename: Option[String],
                pinUnderscoreorderUnderscoreid: Option[String],
                pmpUnderscorename: Option[String],
                poUnderscorenumber: Option[String],
                salesforceUnderscoreorderUnderscorelineUnderscoreid: Option[String],
                startUnderscoredate: Option[LocalDateTime]
                )

object SSIOOrderLine {
    /**
     * Creates the codec for converting SSIOOrderLine from and to JSON.
     */
    implicit val decoder: Decoder[SSIOOrderLine] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOOrderLine] = deriveEncoder
}
