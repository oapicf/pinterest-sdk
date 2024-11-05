package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for SSIOOrderLine.
  * @param salesforceOrderLineId OrderLineId in SFDC
  * @param adsManagerOrderLineId Ads manager OrderLineId
  * @param pinOrderId The pin order id associated with the order line in SFDC
  * @param lastModifiedDateTime Last modified date.
  * @param startDate Start date of the order line.
  * @param endDate End date of the order line.
  * @param billToCompanyName Bill To Company name
  * @param billingContactFirstname Billing contact first name
  * @param billingContactLastname Billing contact last name
  * @param billingContactEmail Billing contact email
  * @param mediaContactEmail Billing media email
  * @param mediaContactFirstname Billing contact first name
  * @param mediaContactLastname Billing contact first name
  * @param agencyLink Agency link
  * @param poNumber The po number
  * @param orderName The order name
  * @param pmpName The Pinterest marketing partner name
  * @param acceptedTermsId The SFDC id for the terms
  * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted
  * @param budgetAmount If Budget order line, the budget amount.
  * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SSIOOrderLine(
  salesforceOrderLineId: Option[String],
  adsManagerOrderLineId: Option[String],
  pinOrderId: Option[String],
  lastModifiedDateTime: Option[String],
  startDate: Option[LocalDate],
  endDate: Option[LocalDate],
  billToCompanyName: Option[String],
  billingContactFirstname: Option[String],
  billingContactLastname: Option[String],
  billingContactEmail: Option[String],
  mediaContactEmail: Option[String],
  mediaContactFirstname: Option[String],
  mediaContactLastname: Option[String],
  currencyInfo: Option[Currency],
  agencyLink: Option[String],
  poNumber: Option[String],
  orderName: Option[String],
  pmpName: Option[String],
  acceptedTermsId: Option[String],
  acceptedTermsTime: Option[String],
  budgetAmount: Option[BigDecimal],
  estimatedMonthlySpend: Option[BigDecimal]
)

object SSIOOrderLine {
  implicit lazy val sSIOOrderLineJsonFormat: Format[SSIOOrderLine] = Json.format[SSIOOrderLine]
}

