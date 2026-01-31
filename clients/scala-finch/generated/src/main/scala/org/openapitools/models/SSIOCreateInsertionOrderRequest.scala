package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.Currency

/**
 * 
 * @param agencyUnderscorelink URL link for agency
 * @param billingUnderscorecontactUnderscoreemail The billing contact email
 * @param billingUnderscorecontactUnderscorefirstname The billing contact first name
 * @param billingUnderscorecontactUnderscorelastname The billing contact last name
 * @param budgetUnderscoreamount If Budget order line, the budget amount.
 * @param endUnderscoredate End date of time period. Format: YYYY-MM-DD
 * @param mediaUnderscorecontactUnderscoreemail The media contact email
 * @param mediaUnderscorecontactUnderscorefirstname The media contact first name
 * @param mediaUnderscorecontactUnderscorelastname The media contact last name
 * @param poUnderscorenumber The po number
 * @param startUnderscoredate Starting date of time period. Format: YYYY-MM-DD
 * @param userUnderscoreemail The email of user submitting the insertion order
 * @param acceptedUnderscoretermsUnderscoreid The SFDC id for the terms
 * @param acceptedUnderscoretermsUnderscoretime The UTC timestamp (to the nearest sec) of when terms were accepted
 * @param billtoUnderscorebillingUnderscoreaddressUnderscoreid The bill-to billing address id
 * @param billtoUnderscorebusinessUnderscoreaddressUnderscoreid The bill-to business address id
 * @param billtoUnderscorecompanyUnderscoreid The bill-to company id
 * @param currencyUnderscoreinfo 
 * @param estimatedUnderscoremonthlyUnderscorespend If Ongoing (perpetual) order line, the estimated monthly spend
 * @param orderUnderscorelineUnderscoretype Type can be Budget or Perpetual
 * @param orderUnderscorename The order name
 * @param pmpUnderscoreid The pmp id
 */
case class SSIOCreateInsertionOrderRequest(agencyUnderscorelink: Option[String],
                billingUnderscorecontactUnderscoreemail: String,
                billingUnderscorecontactUnderscorefirstname: String,
                billingUnderscorecontactUnderscorelastname: String,
                budgetUnderscoreamount: Option[BigDecimal],
                endUnderscoredate: Option[String],
                mediaUnderscorecontactUnderscoreemail: String,
                mediaUnderscorecontactUnderscorefirstname: String,
                mediaUnderscorecontactUnderscorelastname: String,
                poUnderscorenumber: String,
                startUnderscoredate: String,
                userUnderscoreemail: Option[String],
                acceptedUnderscoretermsUnderscoreid: String,
                acceptedUnderscoretermsUnderscoretime: Option[Int],
                billtoUnderscorebillingUnderscoreaddressUnderscoreid: String,
                billtoUnderscorebusinessUnderscoreaddressUnderscoreid: String,
                billtoUnderscorecompanyUnderscoreid: String,
                currencyUnderscoreinfo: Currency,
                estimatedUnderscoremonthlyUnderscorespend: Option[BigDecimal],
                orderUnderscorelineUnderscoretype: String,
                orderUnderscorename: String,
                pmpUnderscoreid: String
                )

object SSIOCreateInsertionOrderRequest {
    /**
     * Creates the codec for converting SSIOCreateInsertionOrderRequest from and to JSON.
     */
    implicit val decoder: Decoder[SSIOCreateInsertionOrderRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOCreateInsertionOrderRequest] = deriveEncoder
}
