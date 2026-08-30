require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/audiences', {
  "resourcePath" => "/Audiences",
  "summary" => "Create audience",
  "nickname" => "audiences/create",
  "responseClass" => "AdAccountsAudience",
  "endpoint" => "/ad_accounts/{ad_account_id}/audiences",
  "notes" => "Create a new audience for the ad account.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "AdAccountsAudienceCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}', {
  "resourcePath" => "/Audiences",
  "summary" => "Get audience",
  "nickname" => "audiences/get",
  "responseClass" => "AdAccountsAudience",
  "endpoint" => "/ad_accounts/{ad_account_id}/audiences/{audience_id}",
  "notes" => "Get a specific audience given the audience ID.",
  "parameters" => [
    {
      "name" => "audience_id",
      "description" => "Audience ID.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/audiences', {
  "resourcePath" => "/Audiences",
  "summary" => "List audiences",
  "nickname" => "audiences/list",
  "responseClass" => "audiences_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/audiences",
  "notes" => "Get list of audiences for the ad account.",
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
      "description" => "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.",
      "dataType" => "PinterestLibPaginationOrder",
      "allowableValues" => "[ASCENDING, DESCENDING]",
      "paramType" => "query",
    },
    {
      "name" => "ownership_type",
      "description" => "",
      "dataType" => "AudienceOwnershipType",
      "allowableValues" => "[OWNED, RECEIVED]",
      "paramType" => "query",
    },
    {
      "name" => "exclude_nca",
      "description" => "When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}', {
  "resourcePath" => "/Audiences",
  "summary" => "Update audience",
  "nickname" => "audiences/update",
  "responseClass" => "AdAccountsAudience",
  "endpoint" => "/ad_accounts/{ad_account_id}/audiences/{audience_id}",
  "notes" => "Update an existing audience for the ad account.",
  "parameters" => [
    {
      "name" => "audience_id",
      "description" => "Audience ID.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "AdAccountsAudienceUpdate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

