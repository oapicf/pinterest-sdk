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

import model_user_website_summary

type UserWebsitesGet200Response* = object
  ## 
  items*: seq[UserWebsiteSummary]
  bookmark*: string
