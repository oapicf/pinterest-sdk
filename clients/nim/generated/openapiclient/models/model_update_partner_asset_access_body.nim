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

import model_update_partner_asset_access_body_accesses_inner

type UpdatePartnerAssetAccessBody* = object
  ## 
  accesses*: seq[UpdatePartnerAssetAccessBody_accesses_inner]
