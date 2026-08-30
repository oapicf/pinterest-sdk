package org.openapitools.server.model

import java.time.LocalDate

/**
 * A Salesforce SSIO order line.
 *
 * @param acceptedTermsId The SFDC id for the terms for example: ''null''
 * @param acceptedTermsTime The UTC timestamp (to the nearest second) when terms were accepted. for example: ''2020-10-06T13:07:04.000Z''
 * @param adsManagerOrderLineId Ads manager order line id for example: ''null''
 * @param agencyLink Agency link for example: ''''
 * @param billToCompanyName Bill-to company name for example: ''Home Depot Inc.''
 * @param billingContactEmail Billing contact email for example: ''mail@test.com''
 * @param billingContactFirstname Billing contact first name for example: ''Mary''
 * @param billingContactLastname Billing contact last name for example: ''Smith''
 * @param budgetAmount If budget order line, the budget amount. for example: ''5000000''
 * @param currencyInfo  for example: ''null''
 * @param endDate End date of the order line. for example: ''null''
 * @param estimatedMonthlySpend If ongoing (perpetual) order line, the estimated monthly spend. for example: ''null''
 * @param lastModifiedDateTime Last modified date. for example: ''2020-10-06T13:07:04.000Z''
 * @param mediaContactEmail Billing media email for example: ''mail@test.com''
 * @param mediaContactFirstname Billing media contact first name for example: ''John''
 * @param mediaContactLastname Billing media contact last name for example: ''Doe''
 * @param orderName The order name for example: ''null''
 * @param pinOrderId The pin order id associated with the order line in SFDC for example: ''null''
 * @param pmpName The Pinterest marketing partner name for example: ''null''
 * @param poNumber The PO number for example: ''null''
 * @param salesforceOrderLineId Order line id in SFDC for example: ''null''
 * @param startDate Start date of the order line. for example: ''null''
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

