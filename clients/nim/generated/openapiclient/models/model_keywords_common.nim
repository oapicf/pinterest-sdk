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

import model_match_type_response

type KeywordsCommon* = object
  ## 
  bid*: int ## Keyword custom bid in microcurrency - null if inherited from parent ad group.
  matchType*: MatchTypeResponse
  value*: string ## Keyword value (120 chars max).