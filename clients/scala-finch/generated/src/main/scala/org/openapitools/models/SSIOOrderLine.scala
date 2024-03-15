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
 * @param salesforceUnderscoreorderUnderscorelineUnderscoreid OrderLineId in SFDC
 * @param adsUnderscoremanagerUnderscoreorderUnderscorelineUnderscoreid Ads manager OrderLineId
 * @param pinUnderscoreorderUnderscoreid The pin order id associated with the order line in SFDC
 * @param lastUnderscoremodifiedUnderscoredateUnderscoretime Last modified date.
 * @param startUnderscoredate Start date of the order line.
 * @param endUnderscoredate End date of the order line.
 * @param billUnderscoretoUnderscorecompanyUnderscorename Bill To Company name
 * @param billingUnderscorecontactUnderscorefirstname Billing contact first name
 * @param billingUnderscorecontactUnderscorelastname Billing contact last name
 * @param billingUnderscorecontactUnderscoreemail Billing contact email
 * @param mediaUnderscorecontactUnderscoreemail Billing media email
 * @param mediaUnderscorecontactUnderscorefirstname Billing contact first name
 * @param mediaUnderscorecontactUnderscorelastname Billing contact first name
 * @param currencyUnderscoreinfo 
 * @param agencyUnderscorelink Agency link
 * @param poUnderscorenumber The po number
 * @param orderUnderscorename The order name
 * @param pmpUnderscorename The Pinterest marketing partner name
 * @param acceptedUnderscoretermsUnderscoreid The SFDC id for the terms
 * @param acceptedUnderscoretermsUnderscoretime The UTC timestamp (to the nearest sec) of when terms were accepted
 * @param budgetUnderscoreamount If Budget order line, the budget amount.
 * @param estimatedUnderscoremonthlyUnderscorespend If Ongoing (perpetual) order line, the estimated monthly spend
 */
case class SSIOOrderLine(salesforceUnderscoreorderUnderscorelineUnderscoreid: Option[String],
                adsUnderscoremanagerUnderscoreorderUnderscorelineUnderscoreid: Option[String],
                pinUnderscoreorderUnderscoreid: Option[String],
                lastUnderscoremodifiedUnderscoredateUnderscoretime: Option[String],
                startUnderscoredate: Option[LocalDateTime],
                endUnderscoredate: Option[LocalDateTime],
                billUnderscoretoUnderscorecompanyUnderscorename: Option[String],
                billingUnderscorecontactUnderscorefirstname: Option[String],
                billingUnderscorecontactUnderscorelastname: Option[String],
                billingUnderscorecontactUnderscoreemail: Option[String],
                mediaUnderscorecontactUnderscoreemail: Option[String],
                mediaUnderscorecontactUnderscorefirstname: Option[String],
                mediaUnderscorecontactUnderscorelastname: Option[String],
                currencyUnderscoreinfo: Option[Currency],
                agencyUnderscorelink: Option[String],
                poUnderscorenumber: Option[String],
                orderUnderscorename: Option[String],
                pmpUnderscorename: Option[String],
                acceptedUnderscoretermsUnderscoreid: Option[String],
                acceptedUnderscoretermsUnderscoretime: Option[String],
                budgetUnderscoreamount: Option[BigDecimal],
                estimatedUnderscoremonthlyUnderscorespend: Option[BigDecimal]
                )

object SSIOOrderLine {
    /**
     * Creates the codec for converting SSIOOrderLine from and to JSON.
     */
    implicit val decoder: Decoder[SSIOOrderLine] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOOrderLine] = deriveEncoder
}
