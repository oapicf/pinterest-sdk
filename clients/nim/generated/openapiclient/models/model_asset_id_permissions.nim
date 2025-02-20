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

import model_asset_group_binding

type AssetIdPermissions* = object
  ## An object containing the permissions a business member has on the asset.
  assetId*: string ## Unique identifier of a business asset.
  assetType*: string ## Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
  permissions*: seq[string] ## Permission levels member or partner has on an asset.
  assetGroupInfo*: AssetGroupBinding
