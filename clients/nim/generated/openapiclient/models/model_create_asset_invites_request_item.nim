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

import model_invite_type
import model_permissions

type CreateAssetInvitesRequestItem* = object
  ## Object declaring an asset role update to an invite.
  inviteId*: string ## Unique identifier of an invite.
  inviteType*: InviteType
  assetIdToPermissions*: Table[string, seq[Permissions]] ## An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
