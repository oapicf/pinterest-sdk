package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for SSIOOrderLine.
  * @param acceptedTermsId The SFDC id for the terms
  * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted
  * @param adsManagerOrderLineId Ads manager OrderLineId
  * @param agencyLink Agency link
  * @param billToCompanyName Bill To Company name
  * @param billingContactEmail Billing contact email
  * @param billingContactFirstname Billing contact first name
  * @param billingContactLastname Billing contact last name
  * @param budgetAmount If Budget order line, the budget amount.
  * @param endDate End date of the order line.
  * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend
  * @param lastModifiedDateTime Last modified date.
  * @param mediaContactEmail Billing media email
  * @param mediaContactFirstname Billing contact first name
  * @param mediaContactLastname Billing contact first name
  * @param orderName The order name
  * @param pinOrderId The pin order id associated with the order line in SFDC
  * @param pmpName The Pinterest marketing partner name
  * @param poNumber The po number
  * @param salesforceOrderLineId OrderLineId in SFDC
  * @param startDate Start date of the order line.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SSIOOrderLine(
  acceptedTermsId: Option[String],
  acceptedTermsTime: Option[String],
  adsManagerOrderLineId: Option[String],
  agencyLink: Option[String],
  billToCompanyName: Option[String],
  billingContactEmail: Option[String],
  billingContactFirstname: Option[String],
  billingContactLastname: Option[String],
  budgetAmount: Option[BigDecimal],
  currencyInfo: Option[Currency],
  endDate: Option[LocalDate],
  estimatedMonthlySpend: Option[BigDecimal],
  lastModifiedDateTime: Option[String],
  mediaContactEmail: Option[String],
  mediaContactFirstname: Option[String],
  mediaContactLastname: Option[String],
  orderName: Option[String],
  pinOrderId: Option[String],
  pmpName: Option[String],
  poNumber: Option[String],
  salesforceOrderLineId: Option[String],
  startDate: Option[LocalDate]
)

object SSIOOrderLine {
  implicit lazy val sSIOOrderLineJsonFormat: Format[SSIOOrderLine] = Json.format[SSIOOrderLine]
}

