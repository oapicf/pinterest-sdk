require 'json'


MyApp.add_route('POST', '/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts', {
  "resourcePath" => "/BusinessAccessRelationships",
  "summary" => "Create a Brand Account",
  "nickname" => "brand_accounts/create",
  "responseClass" => "BrandAccount",
  "endpoint" => "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts",
  "notes" => "Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.",
  "parameters" => [
    {
      "name" => "business_hierarchy_id",
      "description" => "business hierarchy node id",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "BrandAccountCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}', {
  "resourcePath" => "/BusinessAccessRelationships",
  "summary" => "Update a Brand Account",
  "nickname" => "brand_accounts/update",
  "responseClass" => "BrandAccount",
  "endpoint" => "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}",
  "notes" => "Update an existing Brand Account",
  "parameters" => [
    {
      "name" => "brand_account_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "business_hierarchy_id",
      "description" => "business hierarchy node id",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "BrandAccountUpdate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/businesses/{business_id}/members', {
  "resourcePath" => "/BusinessAccessRelationships",
  "summary" => "Terminate business memberships",
  "nickname" => "delete_business_membership",
  "responseClass" => "delete_business_membership_200_response",
  "endpoint" => "/businesses/{business_id}/members",
  "notes" => "Terminate memberships between the specified members and your business.",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Business id",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "DeleteBusinessMembershipBody",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/businesses/{business_id}/partners', {
  "resourcePath" => "/BusinessAccessRelationships",
  "summary" => "Terminate business partnerships",
  "nickname" => "delete_business_partners",
  "responseClass" => "DeleteBusinessPartners",
  "endpoint" => "/businesses/{business_id}/partners",
  "notes" => "Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.",
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
      "dataType" => "DeleteBusinessPartnersDelete",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/businesses/employers', {
  "resourcePath" => "/BusinessAccessRelationships",
  "summary" => "List business employers for user",
  "nickname" => "get/business_employers",
  "responseClass" => "get_business_employers_200_response",
  "endpoint" => "/businesses/employers",
  "notes" => "Get all of the viewing user's business employers.",
  "parameters" => [
    {
      "name" => "assets_summary",
      "description" => "Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
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
      "description" => "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/businesses/{business_id}/members', {
  "resourcePath" => "/BusinessAccessRelationships",
  "summary" => "Get business members",
  "nickname" => "get/business_members",
  "responseClass" => "get_business_employers_200_response",
  "endpoint" => "/businesses/{business_id}/members",
  "notes" => "Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE",
  "parameters" => [
    {
      "name" => "fetch_system_users",
      "description" => "Fetches system users if True. Fetches regular user employees if False.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "assets_summary",
      "description" => "Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "business_roles",
      "description" => "A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.",
      "dataType" => "Array<MemberBusinessRole>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "member_ids",
      "description" => "A list of business members ids separated by comma.",
      "dataType" => "String",
      "allowableValues" => "",
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
      "description" => "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.",
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


MyApp.add_route('GET', '/v5/businesses/{business_id}/partners', {
  "resourcePath" => "/BusinessAccessRelationships",
  "summary" => "Get business partners",
  "nickname" => "get/business_partners",
  "responseClass" => "get_business_employers_200_response",
  "endpoint" => "/businesses/{business_id}/partners",
  "notes" => "Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.",
  "parameters" => [
    {
      "name" => "assets_summary",
      "description" => "Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "partner_type",
      "description" => "Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.",
      "dataType" => "PartnerType",
      "allowableValues" => "[INTERNAL, EXTERNAL]",
      "paramType" => "query",
    },
    {
      "name" => "partner_ids",
      "description" => "A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.",
      "dataType" => "String",
      "allowableValues" => "",
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
      "name" => "sort_ascending",
      "description" => "Sort ascending.",
      "dataType" => "Boolean",
      "allowableValues" => "",
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
      "description" => "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.",
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


MyApp.add_route('PATCH', '/v5/businesses/{business_id}/system_users/{system_user_id}', {
  "resourcePath" => "/BusinessAccessRelationships",
  "summary" => "Update a system user information.",
  "nickname" => "system_user/update",
  "responseClass" => "void",
  "endpoint" => "/businesses/{business_id}/system_users/{system_user_id}",
  "notes" => "Update a system user information such as name.",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Unique identifier of the requesting business.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "system_user_id",
      "description" => "Unique identifier of a system user.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "SystemUserUpdateWithRequiredBody",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/businesses/{business_id}/members', {
  "resourcePath" => "/BusinessAccessRelationships",
  "summary" => "Update member's business role",
  "nickname" => "update/business_memberships",
  "responseClass" => "UpdateBusinessMembershipsResponse",
  "endpoint" => "/businesses/{business_id}/members",
  "notes" => "Update a member's business role within the business.",
  "parameters" => [
    {
      "name" => "business_id",
      "description" => "Business id",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Array<BusinessMembershipMember>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

