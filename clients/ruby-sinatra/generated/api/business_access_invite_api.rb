require 'json'


MyApp.add_route('POST', '/v5/businesses/{business_id}/requests/assets/access', {
  "resourcePath" => "/BusinessAccessInvite",
  "summary" => "Create a request to access an existing partner's assets.",
  "nickname" => "asset_access_requests/create",
  "responseClass" => "CreateAssetAccessRequestResponse",
  "endpoint" => "/businesses/{business_id}/requests/assets/access",
  "notes" => "Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Unique identifier of the requesting business.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateAssetAccessRequestBody",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/businesses/{business_id}/invites', {
  "resourcePath" => "/BusinessAccessInvite",
  "summary" => "Cancel invites/requests",
  "nickname" => "cancel_invites_or_requests",
  "responseClass" => "DeleteInvitesResultsResponseArray",
  "endpoint" => "/businesses/{business_id}/invites",
  "notes" => "Cancel membership/partnership invites and/or requests.",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Business id",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "A list with invite ids",
      "dataType" => "CancelInvitesBody",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/businesses/{business_id}/invites/assets/access', {
  "resourcePath" => "/BusinessAccessInvite",
  "summary" => "Update invite/request with an asset permission",
  "nickname" => "create_asset_invites",
  "responseClass" => "UpdateInvitesResultsResponseArray",
  "endpoint" => "/businesses/{business_id}/invites/assets/access",
  "notes" => "Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Unique identifier of the requesting business.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "A list of invites/requests together with the asset permissions to be assigned to the invite/request. ",
      "dataType" => "CreateAssetInvitesRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/businesses/{business_id}/invites', {
  "resourcePath" => "/BusinessAccessInvite",
  "summary" => "Create invites or requests",
  "nickname" => "create_membership_or_partnership_invites",
  "responseClass" => "CreateInvitesResultsResponseArray",
  "endpoint" => "/businesses/{business_id}/invites",
  "notes" => "Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Business id",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "An object with the properties: invite_type, partners, members, business_role",
      "dataType" => "CreateMembershipOrPartnershipInvitesBody",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/businesses/{business_id}/invites', {
  "resourcePath" => "/BusinessAccessInvite",
  "summary" => "Get invites/requests",
  "nickname" => "get/invites",
  "responseClass" => "get_invites_200_response",
  "endpoint" => "/businesses/{business_id}/invites",
  "notes" => "Get the membership/partnership invites and/or requests for the authorized user.",
  "parameters" => [
    {
      "name" => "is_member",
      "description" => "A boolean field to indicate whether the invite is to create a partnership or a membership.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "invite_status",
      "description" => "A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "invite_type",
      "description" => "Invite type to filter invites by. Only invites of the specified type will be returned.",
      "dataType" => "InviteType",
      "allowableValues" => "[MEMBER_INVITE, PARTNER_INVITE, PARTNER_REQUEST]",
      "paramType" => "query",
    },
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "business_id",
      "description" => "Unique identifier of the requesting business.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/businesses/invites', {
  "resourcePath" => "/BusinessAccessInvite",
  "summary" => "Accept or decline an invite/request",
  "nickname" => "respond_business_access_invites",
  "responseClass" => "RespondToInvitesResponseArray",
  "endpoint" => "/businesses/invites",
  "notes" => "Accept or decline invites or requests.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "AuthRespondInvitesBody",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

