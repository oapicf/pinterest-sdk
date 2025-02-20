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

import model_operation_type

type BusinessSharedAudience* = object
  ## 
  audienceId*: string ## Unique identifier of an audience
  operationType*: OperationType
  recipientBusinessIds*: seq[string] ## List of business IDs to share with or revoke from.
