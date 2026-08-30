require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/targeting_templates', {
  "resourcePath" => "/TargetingTemplate",
  "summary" => "Create targeting templates",
  "nickname" => "targeting_template/create",
  "responseClass" => "TargetingTemplate",
  "endpoint" => "/ad_accounts/{ad_account_id}/targeting_templates",
  "notes" => "Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.",
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
      "dataType" => "TargetingTemplateCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/targeting_templates', {
  "resourcePath" => "/TargetingTemplate",
  "summary" => "List targeting templates",
  "nickname" => "targeting_template/list",
  "responseClass" => "targeting_template_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/targeting_templates",
  "notes" => "Get a list of the targeting templates in the specified `ad_account_id`",
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
      "name" => "include_sizing",
      "description" => "Include audience sizing in result or not",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "search_query",
      "description" => "Search query. Can contain pin description keywords or comma-separated pin IDs.",
      "dataType" => "String",
      "allowableValues" => "",
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


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/targeting_templates', {
  "resourcePath" => "/TargetingTemplate",
  "summary" => "Update targeting templates",
  "nickname" => "targeting_template/update",
  "responseClass" => "void",
  "endpoint" => "/ad_accounts/{ad_account_id}/targeting_templates",
  "notes" => "Update the targeting template given advertiser ID and targeting template ID",
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
      "dataType" => "TargetingTemplateUpdateRequestReadOrUpdate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

