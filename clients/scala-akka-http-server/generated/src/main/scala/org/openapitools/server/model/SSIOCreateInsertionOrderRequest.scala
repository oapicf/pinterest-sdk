package org.openapitools.server.model


/**
 * @param agencyLink URL link for agency for example: ''null''
 * @param billingContactEmail The billing contact email for example: ''test@example''
 * @param billingContactFirstname The billing contact first name for example: ''null''
 * @param billingContactLastname The billing contact last name for example: ''null''
 * @param budgetAmount If Budget order line, the budget amount. for example: ''5000000''
 * @param endDate End date of time period. Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param mediaContactEmail The media contact email for example: ''test@example''
 * @param mediaContactFirstname The media contact first name for example: ''null''
 * @param mediaContactLastname The media contact last name for example: ''null''
 * @param poNumber The po number for example: ''null''
 * @param startDate Starting date of time period. Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param userEmail The email of user submitting the insertion order for example: ''test@example''
 * @param acceptedTermsId The SFDC id for the terms for example: ''null''
 * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted for example: ''null''
 * @param billtoBillingAddressId The bill-to billing address id for example: ''null''
 * @param billtoBusinessAddressId The bill-to business address id for example: ''null''
 * @param billtoCompanyId The bill-to company id for example: ''null''
 * @param currencyInfo  for example: ''null''
 * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend for example: ''null''
 * @param orderLineType Type can be Budget or Perpetual for example: ''null''
 * @param orderName The order name for example: ''null''
 * @param pmpId The pmp id for example: ''null''
*/
final case class SSIOCreateInsertionOrderRequest (
  agencyLink: Option[String] = None,
  billingContactEmail: String,
  billingContactFirstname: String,
  billingContactLastname: String,
  budgetAmount: Option[Double] = None,
  endDate: Option[String] = None,
  mediaContactEmail: String,
  mediaContactFirstname: String,
  mediaContactLastname: String,
  poNumber: String,
  startDate: String,
  userEmail: Option[String] = None,
  acceptedTermsId: String,
  acceptedTermsTime: Option[Int] = None,
  billtoBillingAddressId: String,
  billtoBusinessAddressId: String,
  billtoCompanyId: String,
  currencyInfo: Currency,
  estimatedMonthlySpend: Option[Double] = None,
  orderLineType: String,
  orderName: String,
  pmpId: String
)

