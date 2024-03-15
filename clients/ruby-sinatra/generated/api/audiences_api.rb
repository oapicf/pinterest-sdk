require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/audiences', {
  "resourcePath" => "/Audiences",
  "summary" => "Create audience",
  "nickname" => "audiences/create",
  "responseClass" => "Audience",
  "endpoint" => "/ad_accounts/{ad_account_id}/audiences",
  "notes" => "Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "List of ads to create, size limit [1, 30]",
      "dataType" => "AudienceCreateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/audiences/custom', {
  "resourcePath" => "/Audiences",
  "summary" => "Create custom audience",
  "nickname" => "audiences/create_custom",
  "responseClass" => "Audience",
  "endpoint" => "/ad_accounts/{ad_account_id}/audiences/custom",
  "notes" => "Create a custom audience and find the audiences you want your ads to reach.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Custom audience to create.",
      "dataType" => "AudienceCreateCustomRequest",
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
  "responseClass" => "Audience",
  "endpoint" => "/ad_accounts/{ad_account_id}/audiences/{audience_id}",
  "notes" => "Get a specific audience given the audience ID.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "audience_id",
      "description" => "Unique identifier of an audience",
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
      "name" => "order",
      "description" => "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.",
      "dataType" => "String",
      "allowableValues" => "[ASCENDING, DESCENDING]",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "ownership_type",
      "description" => "&lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type.",
      "dataType" => "String",
      "allowableValues" => "[OWNED, RECEIVED]",
      "defaultValue" => "'OWNED'",
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
  "responseClass" => "Audience",
  "endpoint" => "/ad_accounts/{ad_account_id}/audiences/{audience_id}",
  "notes" => "Update (edit or remove) an existing targeting audience.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "audience_id",
      "description" => "Unique identifier of an audience",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "The audience to be updated.",
      "dataType" => "AudienceUpdateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

