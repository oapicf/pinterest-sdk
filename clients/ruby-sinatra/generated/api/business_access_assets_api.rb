require 'json'


MyApp.add_route('POST', '/v5/businesses/{business_id}/asset_groups', {
  "resourcePath" => "/BusinessAccessAssets",
  "summary" => "Create a new asset group.",
  "nickname" => "asset_group/create",
  "responseClass" => "CreateAssetGroupResponse",
  "endpoint" => "/businesses/{business_id}/asset_groups",
  "notes" => "Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.",
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
      "dataType" => "CreateAssetGroupBody",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/businesses/{business_id}/asset_groups', {
  "resourcePath" => "/BusinessAccessAssets",
  "summary" => "Delete asset groups.",
  "nickname" => "asset_group/delete",
  "responseClass" => "DeleteAssetGroupResponse",
  "endpoint" => "/businesses/{business_id}/asset_groups",
  "notes" => "Delete a batch of asset groups.",
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
      "dataType" => "DeleteAssetGroupBody",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/businesses/{business_id}/asset_groups', {
  "resourcePath" => "/BusinessAccessAssets",
  "summary" => "Update asset groups.",
  "nickname" => "asset_group/update",
  "responseClass" => "UpdateAssetGroupResponse",
  "endpoint" => "/businesses/{business_id}/asset_groups",
  "notes" => "Update a batch of asset groups with the specified parameters.",
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
      "dataType" => "UpdateAssetGroupBody",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/businesses/{business_id}/assets/{asset_id}/members', {
  "resourcePath" => "/BusinessAccessAssets",
  "summary" => "Get members with access to asset",
  "nickname" => "business_asset_members/get",
  "responseClass" => "business_asset_members_get_200_response",
  "endpoint" => "/businesses/{business_id}/assets/{asset_id}/members",
  "notes" => "Get all the members the requesting business has granted access to on the given asset.",
  "parameters" => [
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
      "name" => "start_index",
      "description" => "An index to start fetching the results from. Only the results starting from this index will be returned.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "business_id",
      "description" => "Unique identifier of the requesting business.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "asset_id",
      "description" => "Unique identifier of a business asset.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/businesses/{business_id}/assets/{asset_id}/partners', {
  "resourcePath" => "/BusinessAccessAssets",
  "summary" => "Get partners with access to asset",
  "nickname" => "business_asset_partners/get",
  "responseClass" => "business_asset_partners_get_200_response",
  "endpoint" => "/businesses/{business_id}/assets/{asset_id}/partners",
  "notes" => "Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.",
  "parameters" => [
    {
      "name" => "start_index",
      "description" => "An index to start fetching the results from. Only the results starting from this index will be returned.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
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
    {
      "name" => "asset_id",
      "description" => "Unique identifier of a business asset.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/businesses/{business_id}/assets', {
  "resourcePath" => "/BusinessAccessAssets",
  "summary" => "List business assets",
  "nickname" => "business_assets/get",
  "responseClass" => "business_assets_get_200_response",
  "endpoint" => "/businesses/{business_id}/assets",
  "notes" => "Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.",
  "parameters" => [
    {
      "name" => "permissions",
      "description" => "A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.",
      "dataType" => "Array<PermissionsWithOwner>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "child_asset_id",
      "description" => "A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_group_id",
      "description" => "An asset group unique identifier. Used to fetch assets contained within the specified asset group.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_type",
      "description" => "A resource type to filter the assets by. Only assets of the specified type will be returned.",
      "dataType" => "String",
      "allowableValues" => "[AD_ACCOUNT, PROFILE, ASSET_GROUP]",
      "defaultValue" => "'AD_ACCOUNT'",
      "paramType" => "query",
    },
    {
      "name" => "start_index",
      "description" => "An index to start fetching the results from. Only the results starting from this index will be returned.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
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


MyApp.add_route('GET', '/v5/businesses/{business_id}/members/{member_id}/assets', {
  "resourcePath" => "/BusinessAccessAssets",
  "summary" => "Get assets assigned to a member",
  "nickname" => "business_member_assets/get",
  "responseClass" => "business_member_assets_get_200_response",
  "endpoint" => "/businesses/{business_id}/members/{member_id}/assets",
  "notes" => "Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.",
  "parameters" => [
    {
      "name" => "asset_type",
      "description" => "A resource type to filter the assets by. Only assets of the specified type will be returned.",
      "dataType" => "String",
      "allowableValues" => "[AD_ACCOUNT, PROFILE, ASSET_GROUP]",
      "defaultValue" => "'AD_ACCOUNT'",
      "paramType" => "query",
    },
    {
      "name" => "start_index",
      "description" => "An index to start fetching the results from. Only the results starting from this index will be returned.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
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
    {
      "name" => "member_id",
      "description" => "The member id to fetch assets for.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/businesses/{business_id}/members/assets/access', {
  "resourcePath" => "/BusinessAccessAssets",
  "summary" => "Delete member access to asset",
  "nickname" => "business_members_asset_access/delete",
  "responseClass" => "DeleteMemberAccessResultsResponseArray",
  "endpoint" => "/businesses/{business_id}/members/assets/access",
  "notes" => "Terminate multiple members' access to an asset.",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Unique identifier of the requesting business.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "List member assset permissions to delete.",
      "dataType" => "BusinessMembersAssetAccessDeleteRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/businesses/{business_id}/members/assets/access', {
  "resourcePath" => "/BusinessAccessAssets",
  "summary" => "Assign/Update member asset permissions",
  "nickname" => "business_members_asset_access/update",
  "responseClass" => "UpdateMemberAssetsResultsResponseArray",
  "endpoint" => "/businesses/{business_id}/members/assets/access",
  "notes" => "Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. ",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Unique identifier of the requesting business.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "List of member asset permissions to create or update.",
      "dataType" => "UpdateMemberAssetAccessBody",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/businesses/{business_id}/partners/{partner_id}/assets', {
  "resourcePath" => "/BusinessAccessAssets",
  "summary" => "Get assets assigned to a partner or assets assigned by a partner",
  "nickname" => "business_partner_asset_access/get",
  "responseClass" => "business_partner_asset_access_get_200_response",
  "endpoint" => "/businesses/{business_id}/partners/{partner_id}/assets",
  "notes" => "Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.",
  "parameters" => [
    {
      "name" => "partner_type",
      "description" => "Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.",
      "dataType" => "PartnerType",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "asset_type",
      "description" => "A resource type to filter the assets by. Only assets of the specified type will be returned.",
      "dataType" => "String",
      "allowableValues" => "[AD_ACCOUNT, PROFILE, ASSET_GROUP]",
      "defaultValue" => "'AD_ACCOUNT'",
      "paramType" => "query",
    },
    {
      "name" => "start_index",
      "description" => "An index to start fetching the results from. Only the results starting from this index will be returned.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
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
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "business_id",
      "description" => "Unique identifier of the requesting business.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "partner_id",
      "description" => "The partner id to be bound to the Business",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/businesses/{business_id}/partners/assets', {
  "resourcePath" => "/BusinessAccessAssets",
  "summary" => "Delete partner access to asset",
  "nickname" => "delete_partner_asset_access_handler_impl",
  "responseClass" => "DeletePartnerAssetsResultsResponseArray",
  "endpoint" => "/businesses/{business_id}/partners/assets",
  "notes" => "Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.",
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
      "dataType" => "DeletePartnerAssetAccessBody",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/businesses/{business_id}/partners/assets', {
  "resourcePath" => "/BusinessAccessAssets",
  "summary" => "Assign/Update partner asset permissions",
  "nickname" => "update_partner_asset_access_handler_impl",
  "responseClass" => "UpdatePartnerAssetsResultsResponseArray",
  "endpoint" => "/businesses/{business_id}/partners/assets",
  "notes" => "Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Unique identifier of the requesting business.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "A list of assets and permissions to assign to your partners.",
      "dataType" => "UpdatePartnerAssetAccessBody",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

