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

import model_update_invites_results_response_array_items_inner

type UpdateInvitesResultsResponseArray* = object
  ## 
  items*: seq[UpdateInvitesResultsResponseArray_items_inner] ## List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
