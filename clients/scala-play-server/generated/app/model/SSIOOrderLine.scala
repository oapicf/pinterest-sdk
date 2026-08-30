package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * A Salesforce SSIO order line.
  * @param acceptedTermsId The SFDC id for the terms
  * @param acceptedTermsTime The UTC timestamp (to the nearest second) when terms were accepted.
  * @param adsManagerOrderLineId Ads manager order line id
  * @param agencyLink Agency link
  * @param billToCompanyName Bill-to company name
  * @param billingContactEmail Billing contact email
  * @param billingContactFirstname Billing contact first name
  * @param billingContactLastname Billing contact last name
  * @param budgetAmount If budget order line, the budget amount.
  * @param endDate End date of the order line.
  * @param estimatedMonthlySpend If ongoing (perpetual) order line, the estimated monthly spend.
  * @param lastModifiedDateTime Last modified date.
  * @param mediaContactEmail Billing media email
  * @param mediaContactFirstname Billing media contact first name
  * @param mediaContactLastname Billing media contact last name
  * @param orderName The order name
  * @param pinOrderId The pin order id associated with the order line in SFDC
  * @param pmpName The Pinterest marketing partner name
  * @param poNumber The PO number
  * @param salesforceOrderLineId Order line id in SFDC
  * @param startDate Start date of the order line.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

