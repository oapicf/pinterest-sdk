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

import model_update_asset_group_body_asset_groups_to_update_inner

type UpdateAssetGroupBody* = object
  ## 
  assetGroupsToUpdate*: seq[UpdateAssetGroupBody_asset_groups_to_update_inner] ## A list of asset groups and the data that will be used to update them.
