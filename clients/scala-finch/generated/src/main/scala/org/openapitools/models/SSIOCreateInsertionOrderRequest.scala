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
 * @param startUnderscoredate Starting date of time period. Format: YYYY-MM-DD
 * @param endUnderscoredate End date of time period. Format: YYYY-MM-DD
 * @param poUnderscorenumber The po number
 * @param budgetUnderscoreamount If Budget order line, the budget amount.
 * @param billingUnderscorecontactUnderscorefirstname The billing contact first name
 * @param billingUnderscorecontactUnderscorelastname The billing contact last name
 * @param billingUnderscorecontactUnderscoreemail The billing contact email
 * @param mediaUnderscorecontactUnderscorefirstname The media contact first name
 * @param mediaUnderscorecontactUnderscorelastname The media contact last name
 * @param mediaUnderscorecontactUnderscoreemail The media contact email
 * @param agencyUnderscorelink URL link for agency
 * @param userUnderscoreemail The email of user submitting the insertion order
 * @param acceptedUnderscoretermsUnderscoretime The UTC timestamp (to the nearest sec) of when terms were accepted
 * @param pmpUnderscoreid The pmp id
 * @param orderUnderscorename The order name
 * @param orderUnderscorelineUnderscoretype Type can be Budget or Perpetual
 * @param acceptedUnderscoretermsUnderscoreid The SFDC id for the terms
 * @param billtoUnderscorecompanyUnderscoreid The bill-to company id
 * @param billtoUnderscorebusinessUnderscoreaddressUnderscoreid The bill-to business address id
 * @param billtoUnderscorebillingUnderscoreaddressUnderscoreid The bill-to billing address id
 * @param estimatedUnderscoremonthlyUnderscorespend If Ongoing (perpetual) order line, the estimated monthly spend
 * @param currencyUnderscoreinfo 
 */
case class SSIOCreateInsertionOrderRequest(startUnderscoredate: String,
                endUnderscoredate: Option[String],
                poUnderscorenumber: String,
                budgetUnderscoreamount: Option[BigDecimal],
                billingUnderscorecontactUnderscorefirstname: String,
                billingUnderscorecontactUnderscorelastname: String,
                billingUnderscorecontactUnderscoreemail: String,
                mediaUnderscorecontactUnderscorefirstname: String,
                mediaUnderscorecontactUnderscorelastname: String,
                mediaUnderscorecontactUnderscoreemail: String,
                agencyUnderscorelink: Option[String],
                userUnderscoreemail: Option[String],
                acceptedUnderscoretermsUnderscoretime: Option[Int],
                pmpUnderscoreid: String,
                orderUnderscorename: String,
                orderUnderscorelineUnderscoretype: String,
                acceptedUnderscoretermsUnderscoreid: String,
                billtoUnderscorecompanyUnderscoreid: String,
                billtoUnderscorebusinessUnderscoreaddressUnderscoreid: String,
                billtoUnderscorebillingUnderscoreaddressUnderscoreid: String,
                estimatedUnderscoremonthlyUnderscorespend: Option[BigDecimal],
                currencyUnderscoreinfo: Currency
                )

object SSIOCreateInsertionOrderRequest {
    /**
     * Creates the codec for converting SSIOCreateInsertionOrderRequest from and to JSON.
     */
    implicit val decoder: Decoder[SSIOCreateInsertionOrderRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOCreateInsertionOrderRequest] = deriveEncoder
}
