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


type BatchOperation* = object
  ## The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".