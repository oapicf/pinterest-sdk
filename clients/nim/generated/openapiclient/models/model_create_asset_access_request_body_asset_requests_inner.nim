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

import model_permissions

type CreateAssetAccessRequestBodyAssetRequestsInner* = object
  ## 
  partnerId*: string ## Unique identifier of a business partner to request asset access to.
  assetIdToPermissions*: Table[string, seq[Permissions]] ## An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
