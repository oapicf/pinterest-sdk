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

import model_billing_profiles_response

type BillingProfilesGet200Response* = object
  ## 
  items*: seq[BillingProfilesResponse]
  bookmark*: string