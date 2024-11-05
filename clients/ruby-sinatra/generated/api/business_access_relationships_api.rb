require 'json'


MyApp.add_route('DELETE', '/v5/businesses/{business_id}/members', {
  "resourcePath" => "/BusinessAccessRelationships",
  "summary" => "Terminate business memberships",
  "nickname" => "delete_business_membership",
  "responseClass" => "DeletedMembersResponse",
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
      "description" => "List of members with role to delete.",
      "dataType" => "MembersToDeleteBody",
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
  "responseClass" => "DeletePartnersResponse",
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
      "description" => "An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete. ",
      "dataType" => "DeletePartnersRequest",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/businesses/{business_id}/members', {
  "resourcePath" => "/BusinessAccessRelationships",
  "summary" => "Get business members",
  "nickname" => "get/business_members",
  "responseClass" => "get_business_members_200_response",
  "endpoint" => "/businesses/{business_id}/members",
  "notes" => "Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE",
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


MyApp.add_route('GET', '/v5/businesses/{business_id}/partners', {
  "resourcePath" => "/BusinessAccessRelationships",
  "summary" => "Get business partners",
  "nickname" => "get/business_partners",
  "responseClass" => "get_business_partners_200_response",
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
      "description" => "Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/businesses/{business_id}/members', {
  "resourcePath" => "/BusinessAccessRelationships",
  "summary" => "Update member's business role",
  "nickname" => "update/business_memberships",
  "responseClass" => "UpdateMemberResultsResponseArray",
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
      "description" => "List of objects with the member id and the business_role.",
      "dataType" => "Array<UpdateMemberBusinessRoleBody>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

