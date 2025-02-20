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

import model_keywords_common

type KeywordsRequest* = object
  ## 
  keywords*: seq[KeywordsCommon] ## Keyword JSON array. Each array element has 3 fields
  parentId*: string ## Keyword parent entity ID (advertiser, campaign, ad group).
