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


type CancelInvitesBody* = object
  ## Request body used to cancel invites
  inviteIds*: seq[string] ## List of invite/request ids to be cancelled
