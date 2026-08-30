package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param acceptedTermsId The SFDC id for the terms for example: ''null''
 * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted for example: ''null''
 * @param agencyLink URL link for agency for example: ''null''
 * @param billingContactEmail The billing contact email for example: ''null''
 * @param billingContactFirstname The billing contact first name for example: ''null''
 * @param billingContactLastname The billing contact last name for example: ''null''
 * @param billtoBillingAddressId The bill-to billing address id for example: ''null''
 * @param billtoBusinessAddressId The bill-to business address id for example: ''null''
 * @param billtoCompanyId The bill-to company id for example: ''null''
 * @param budgetAmount If Budget order line, the budget amount. for example: ''null''
 * @param currencyInfo  for example: ''null''
 * @param endDate End date of time period. Format: YYYY-MM-DD for example: ''null''
 * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend for example: ''null''
 * @param mediaContactEmail The media contact email for example: ''null''
 * @param mediaContactFirstname The media contact first name for example: ''null''
 * @param mediaContactLastname The media contact last name for example: ''null''
 * @param orderLineType Type can be Budget or Perpetual for example: ''null''
 * @param orderName The order name for example: ''null''
 * @param pmpId The pmp id for example: ''null''
 * @param poNumber The po number for example: ''null''
 * @param startDate Starting date of time period. Format: YYYY-MM-DD for example: ''null''
 * @param userEmail The email of user submitting the insertion order for example: ''null''
*/
final case class SSIOInsertionOrderCreate (
  acceptedTermsId: String,
  acceptedTermsTime: Option[Int] = None,
  agencyLink: Option[String] = None,
  billingContactEmail: String,
  billingContactFirstname: String,
  billingContactLastname: String,
  billtoBillingAddressId: String,
  billtoBusinessAddressId: String,
  billtoCompanyId: String,
  budgetAmount: Option[Double] = None,
  currencyInfo: Currency,
  endDate: Option[String] = None,
  estimatedMonthlySpend: Option[Double] = None,
  mediaContactEmail: String,
  mediaContactFirstname: String,
  mediaContactLastname: String,
  orderLineType: SSIOOrderLineType,
  orderName: String,
  pmpId: String,
  poNumber: String,
  startDate: String,
  userEmail: Option[String] = None
)

