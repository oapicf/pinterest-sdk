#
# Pinterest REST API
# 
# Pinterest's REST API
# The version of the OpenAPI document: 5.12.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables


type TermsOfService* = object
  ## 
  id*: string ## The ID of the terms of service
  html*: string ## The terms of service content
  hasAccepted*: bool ## Whether the ad account has accepted terms of service.
  adAccountId*: string ## The ID of the ad account.