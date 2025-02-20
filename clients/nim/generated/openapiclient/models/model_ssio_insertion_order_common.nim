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


type SSIOInsertionOrderCommon* = object
  ## 
  startDate*: string ## Starting date of time period. Format: YYYY-MM-DD
  endDate*: string ## End date of time period. Format: YYYY-MM-DD
  poNumber*: string ## The po number
  budgetAmount*: float ## If Budget order line, the budget amount.
  billingContactFirstname*: string ## The billing contact first name
  billingContactLastname*: string ## The billing contact last name
  billingContactEmail*: string ## The billing contact email
  mediaContactFirstname*: string ## The media contact first name
  mediaContactLastname*: string ## The media contact last name
  mediaContactEmail*: string ## The media contact email
  agencyLink*: string ## URL link for agency
  userEmail*: string ## The email of user submitting the insertion order
