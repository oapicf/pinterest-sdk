require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/targeting_templates', {
  "resourcePath" => "/TargetingTemplate",
  "summary" => "Create targeting templates",
  "nickname" => "targeting_template/create",
  "responseClass" => "TargetingTemplateGetResponseData",
  "endpoint" => "/ad_accounts/{ad_account_id}/targeting_templates",
  "notes" => "<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "targeting template creation entity",
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
  "notes" => "Get a list of the targeting templates in the specified <code>ad_account_id</code>",
  "parameters" => [
    {
      "name" => "order",
      "description" => "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.",
      "dataType" => "String",
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
      "description" => "Search keyword for targeting templates",
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
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
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
  "notes" => "<p>Update the targeting template given advertiser ID and targeting template ID</p>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Operation type and targeting template ID",
      "dataType" => "TargetingTemplateUpdateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

