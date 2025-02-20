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

import model_role

type SharedAudienceResponse* = object
  ## 
  audienceId*: string ## Audience ID that was shared
  permissions*: seq[Role]
  recipientAccountIds*: seq[string] ## Account IDs that received the audience
