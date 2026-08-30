require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/customer_segments', {
  "resourcePath" => "/CustomerSegment",
  "summary" => "Create customer segments",
  "nickname" => "customer_segment/create",
  "responseClass" => "CustomerSegment",
  "endpoint" => "/ad_accounts/{ad_account_id}/customer_segments",
  "notes" => "Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.",
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
      "dataType" => "CustomerSegmentCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/customer_segments', {
  "resourcePath" => "/CustomerSegment",
  "summary" => "List customer segments",
  "nickname" => "customer_segment/list",
  "responseClass" => "customer_segment_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/customer_segments",
  "notes" => "Get a list of the customer segments in the specified `ad_account_id`.",
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


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/customer_segments', {
  "resourcePath" => "/CustomerSegment",
  "summary" => "Update customer segments",
  "nickname" => "customer_segment/update",
  "responseClass" => "void",
  "endpoint" => "/ad_accounts/{ad_account_id}/customer_segments",
  "notes" => "Update the customer segment given advertiser ID and customer segment ID",
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
      "dataType" => "CustomerSegmentUpdateRequestUpdateWithRequiredBody",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

