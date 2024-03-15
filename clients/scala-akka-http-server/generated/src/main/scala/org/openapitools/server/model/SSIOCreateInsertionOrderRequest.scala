package org.openapitools.server.model


/**
 * @param startDate Starting date of time period. Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param endDate End date of time period. Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param poNumber The po number for example: ''null''
 * @param budgetAmount If Budget order line, the budget amount. for example: ''5000000''
 * @param billingContactFirstname The billing contact first name for example: ''null''
 * @param billingContactLastname The billing contact last name for example: ''null''
 * @param billingContactEmail The billing contact email for example: ''test@example''
 * @param mediaContactFirstname The media contact first name for example: ''null''
 * @param mediaContactLastname The media contact last name for example: ''null''
 * @param mediaContactEmail The media contact email for example: ''test@example''
 * @param agencyLink URL link for agency for example: ''null''
 * @param userEmail The email of user submitting the insertion order for example: ''test@example''
 * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted for example: ''null''
 * @param pmpId The pmp id for example: ''null''
 * @param orderName The order name for example: ''null''
 * @param orderLineType Type can be Budget or Perpetual for example: ''null''
 * @param acceptedTermsId The SFDC id for the terms for example: ''null''
 * @param billtoCompanyId The bill-to company id for example: ''null''
 * @param billtoBusinessAddressId The bill-to business address id for example: ''null''
 * @param billtoBillingAddressId The bill-to billing address id for example: ''null''
 * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend for example: ''null''
 * @param currencyInfo  for example: ''null''
*/
final case class SSIOCreateInsertionOrderRequest (
  startDate: String,
  endDate: Option[String] = None,
  poNumber: String,
  budgetAmount: Option[Double] = None,
  billingContactFirstname: String,
  billingContactLastname: String,
  billingContactEmail: String,
  mediaContactFirstname: String,
  mediaContactLastname: String,
  mediaContactEmail: String,
  agencyLink: Option[String] = None,
  userEmail: Option[String] = None,
  acceptedTermsTime: Option[Int] = None,
  pmpId: String,
  orderName: String,
  orderLineType: String,
  acceptedTermsId: String,
  billtoCompanyId: String,
  billtoBusinessAddressId: String,
  billtoBillingAddressId: String,
  estimatedMonthlySpend: Option[Double] = None,
  currencyInfo: Currency
)

