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

import model_campaign_create_response_data
import model_exception

type CampaignCreateResponseItem* = object
  ## 
  data*: CampaignCreateResponseData
  exceptions*: seq[Exception]
