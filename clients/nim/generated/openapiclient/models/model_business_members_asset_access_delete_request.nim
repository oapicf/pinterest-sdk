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

import model_business_members_asset_access_delete_request_accesses_inner

type BusinessMembersAssetAccessDeleteRequest* = object
  ## 
  accesses*: seq[business_members_asset_access_delete_request_accesses_inner] ## List of members asset access to be deleted
