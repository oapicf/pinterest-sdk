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

import model_match_type_response

type KeywordsCommon* = object
  ## 
  bid*: int ## </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  matchType*: MatchTypeResponse
  value*: string ## Keyword value (120 chars max).
