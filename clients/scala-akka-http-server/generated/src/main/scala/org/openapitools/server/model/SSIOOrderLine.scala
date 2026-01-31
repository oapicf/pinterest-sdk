package org.openapitools.server.model

import java.time.LocalDate

/**
 * @param acceptedTermsId The SFDC id for the terms for example: ''null''
 * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted for example: ''2020-10-06T13:07:04.000Z''
 * @param adsManagerOrderLineId Ads manager OrderLineId for example: ''null''
 * @param agencyLink Agency link for example: ''''
 * @param billToCompanyName Bill To Company name for example: ''Home Depot Inc.''
 * @param billingContactEmail Billing contact email for example: ''mail@test.com''
 * @param billingContactFirstname Billing contact first name for example: ''Mary''
 * @param billingContactLastname Billing contact last name for example: ''Smith''
 * @param budgetAmount If Budget order line, the budget amount. for example: ''5000000''
 * @param currencyInfo  for example: ''null''
 * @param endDate End date of the order line. for example: ''Mon Oct 05 00:00:00 UTC 2020''
 * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend for example: ''null''
 * @param lastModifiedDateTime Last modified date. for example: ''2020-10-06T13:07:04.000Z''
 * @param mediaContactEmail Billing media email for example: ''mail@test.com''
 * @param mediaContactFirstname Billing contact first name for example: ''John''
 * @param mediaContactLastname Billing contact first name for example: ''Doe''
 * @param orderName The order name for example: ''null''
 * @param pinOrderId The pin order id associated with the order line in SFDC for example: ''null''
 * @param pmpName The Pinterest marketing partner name for example: ''null''
 * @param poNumber The po number for example: ''null''
 * @param salesforceOrderLineId OrderLineId in SFDC for example: ''null''
 * @param startDate Start date of the order line. for example: ''Thu Mar 01 00:00:00 UTC 2018''
*/
final case class SSIOOrderLine (
  acceptedTermsId: Option[String] = None,
  acceptedTermsTime: Option[String] = None,
  adsManagerOrderLineId: Option[String] = None,
  agencyLink: Option[String] = None,
  billToCompanyName: Option[String] = None,
  billingContactEmail: Option[String] = None,
  billingContactFirstname: Option[String] = None,
  billingContactLastname: Option[String] = None,
  budgetAmount: Option[Double] = None,
  currencyInfo: Option[Currency] = None,
  endDate: Option[LocalDate] = None,
  estimatedMonthlySpend: Option[Double] = None,
  lastModifiedDateTime: Option[String] = None,
  mediaContactEmail: Option[String] = None,
  mediaContactFirstname: Option[String] = None,
  mediaContactLastname: Option[String] = None,
  orderName: Option[String] = None,
  pinOrderId: Option[String] = None,
  pmpName: Option[String] = None,
  poNumber: Option[String] = None,
  salesforceOrderLineId: Option[String] = None,
  startDate: Option[LocalDate] = None
)

