#
# Pinterest REST API
# 
# Pinterest's REST API
# The version of the OpenAPI document: 5.14.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_currency

type SSIOOrderLine* = object
  ## 
  salesforceOrderLineId*: string ## OrderLineId in SFDC
  adsManagerOrderLineId*: string ## Ads manager OrderLineId
  pinOrderId*: string ## The pin order id associated with the order line in SFDC
  lastModifiedDateTime*: string ## Last modified date.
  startDate*: string ## Start date of the order line.
  endDate*: string ## End date of the order line.
  billToCompanyName*: string ## Bill To Company name
  billingContactFirstname*: string ## Billing contact first name
  billingContactLastname*: string ## Billing contact last name
  billingContactEmail*: string ## Billing contact email
  mediaContactEmail*: string ## Billing media email
  mediaContactFirstname*: string ## Billing contact first name
  mediaContactLastname*: string ## Billing contact first name
  currencyInfo*: Currency
  agencyLink*: string ## Agency link
  poNumber*: string ## The po number
  orderName*: string ## The order name
  pmpName*: string ## The Pinterest marketing partner name
  acceptedTermsId*: string ## The SFDC id for the terms
  acceptedTermsTime*: string ## The UTC timestamp (to the nearest sec) of when terms were accepted
  budgetAmount*: float ## If Budget order line, the budget amount.
  estimatedMonthlySpend*: float ## If Ongoing (perpetual) order line, the estimated monthly spend
