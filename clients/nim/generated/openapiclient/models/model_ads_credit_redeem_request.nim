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


type AdsCreditRedeemRequest* = object
  ## 
  offerCodeHash*: string ## Takes in a SHA256 hash of the offerCode.
  validateOnly*: bool ## If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
