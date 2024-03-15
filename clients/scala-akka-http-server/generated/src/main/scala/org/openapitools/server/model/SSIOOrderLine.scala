package org.openapitools.server.model

import java.time.LocalDate

/**
 * @param salesforceOrderLineId OrderLineId in SFDC for example: ''null''
 * @param adsManagerOrderLineId Ads manager OrderLineId for example: ''null''
 * @param pinOrderId The pin order id associated with the order line in SFDC for example: ''null''
 * @param lastModifiedDateTime Last modified date. for example: ''2020-10-06T13:07:04.000Z''
 * @param startDate Start date of the order line. for example: ''Thu Mar 01 00:00:00 UTC 2018''
 * @param endDate End date of the order line. for example: ''Mon Oct 05 00:00:00 UTC 2020''
 * @param billToCompanyName Bill To Company name for example: ''Home Depot Inc.''
 * @param billingContactFirstname Billing contact first name for example: ''Mary''
 * @param billingContactLastname Billing contact last name for example: ''Smith''
 * @param billingContactEmail Billing contact email for example: ''mail@test.com''
 * @param mediaContactEmail Billing media email for example: ''mail@test.com''
 * @param mediaContactFirstname Billing contact first name for example: ''John''
 * @param mediaContactLastname Billing contact first name for example: ''Doe''
 * @param currencyInfo  for example: ''null''
 * @param agencyLink Agency link for example: ''''
 * @param poNumber The po number for example: ''null''
 * @param orderName The order name for example: ''null''
 * @param pmpName The Pinterest marketing partner name for example: ''null''
 * @param acceptedTermsId The SFDC id for the terms for example: ''null''
 * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted for example: ''2020-10-06T13:07:04.000Z''
 * @param budgetAmount If Budget order line, the budget amount. for example: ''5000000''
 * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend for example: ''null''
*/
final case class SSIOOrderLine (
  salesforceOrderLineId: Option[String] = None,
  adsManagerOrderLineId: Option[String] = None,
  pinOrderId: Option[String] = None,
  lastModifiedDateTime: Option[String] = None,
  startDate: Option[LocalDate] = None,
  endDate: Option[LocalDate] = None,
  billToCompanyName: Option[String] = None,
  billingContactFirstname: Option[String] = None,
  billingContactLastname: Option[String] = None,
  billingContactEmail: Option[String] = None,
  mediaContactEmail: Option[String] = None,
  mediaContactFirstname: Option[String] = None,
  mediaContactLastname: Option[String] = None,
  currencyInfo: Option[Currency] = None,
  agencyLink: Option[String] = None,
  poNumber: Option[String] = None,
  orderName: Option[String] = None,
  pmpName: Option[String] = None,
  acceptedTermsId: Option[String] = None,
  acceptedTermsTime: Option[String] = None,
  budgetAmount: Option[Double] = None,
  estimatedMonthlySpend: Option[Double] = None
)

