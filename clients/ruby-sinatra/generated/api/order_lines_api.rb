require 'json'


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/order_lines/{order_line_id}', {
  "resourcePath" => "/OrderLines",
  "summary" => "Get order line",
  "nickname" => "order_lines/get",
  "responseClass" => "OrderLine",
  "endpoint" => "/ad_accounts/{ad_account_id}/order_lines/{order_line_id}",
  "notes" => "Get a specific existing order line associated with an ad account.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "order_line_id",
      "description" => "Unique identifier of an order line.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/order_lines', {
  "resourcePath" => "/OrderLines",
  "summary" => "Get order lines",
  "nickname" => "order_lines/list",
  "responseClass" => "order_lines_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/order_lines",
  "notes" => "List existing order lines associated with an ad account.",
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
      "name" => "order",
      "description" => "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.",
      "dataType" => "String",
      "allowableValues" => "[ASCENDING, DESCENDING]",
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

