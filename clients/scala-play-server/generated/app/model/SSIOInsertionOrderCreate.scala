package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param acceptedTermsId The SFDC id for the terms
  * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted
  * @param agencyLink URL link for agency
  * @param billingContactEmail The billing contact email
  * @param billingContactFirstname The billing contact first name
  * @param billingContactLastname The billing contact last name
  * @param billtoBillingAddressId The bill-to billing address id
  * @param billtoBusinessAddressId The bill-to business address id
  * @param billtoCompanyId The bill-to company id
  * @param budgetAmount If Budget order line, the budget amount.
  * @param endDate End date of time period. Format: YYYY-MM-DD
  * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend
  * @param mediaContactEmail The media contact email
  * @param mediaContactFirstname The media contact first name
  * @param mediaContactLastname The media contact last name
  * @param orderLineType Type can be Budget or Perpetual
  * @param orderName The order name
  * @param pmpId The pmp id
  * @param poNumber The po number
  * @param startDate Starting date of time period. Format: YYYY-MM-DD
  * @param userEmail The email of user submitting the insertion order
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SSIOInsertionOrderCreate(
  acceptedTermsId: String,
  acceptedTermsTime: Option[Int],
  agencyLink: Option[String],
  billingContactEmail: String,
  billingContactFirstname: String,
  billingContactLastname: String,
  billtoBillingAddressId: String,
  billtoBusinessAddressId: String,
  billtoCompanyId: String,
  budgetAmount: Option[Double],
  currencyInfo: Currency,
  endDate: Option[String],
  estimatedMonthlySpend: Option[Double],
  mediaContactEmail: String,
  mediaContactFirstname: String,
  mediaContactLastname: String,
  orderLineType: SSIOOrderLineType,
  orderName: String,
  pmpId: String,
  poNumber: String,
  startDate: String,
  userEmail: Option[String]
)

object SSIOInsertionOrderCreate {
  implicit lazy val sSIOInsertionOrderCreateJsonFormat: Format[SSIOInsertionOrderCreate] = Json.format[SSIOInsertionOrderCreate]
}

