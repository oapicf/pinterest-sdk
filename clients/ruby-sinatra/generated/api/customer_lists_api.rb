require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/customer_lists', {
  "resourcePath" => "/CustomerLists",
  "summary" => "Create customer lists",
  "nickname" => "customer_lists/create",
  "responseClass" => "CustomerList",
  "endpoint" => "/ad_accounts/{ad_account_id}/customer_lists",
  "notes" => "<p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Parameters to get Customer lists info",
      "dataType" => "CustomerListRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}', {
  "resourcePath" => "/CustomerLists",
  "summary" => "Get customer list",
  "nickname" => "customer_lists/get",
  "responseClass" => "CustomerList",
  "endpoint" => "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}",
  "notes" => "Gets a specific customer list given the customer list ID.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "customer_list_id",
      "description" => "Unique identifier of a customer list",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/customer_lists', {
  "resourcePath" => "/CustomerLists",
  "summary" => "Get customer lists",
  "nickname" => "customer_lists/list",
  "responseClass" => "customer_lists_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/customer_lists",
  "notes" => "<p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>",
  "parameters" => [
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
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


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}', {
  "resourcePath" => "/CustomerLists",
  "summary" => "Update customer list",
  "nickname" => "customer_lists/update",
  "responseClass" => "CustomerList",
  "endpoint" => "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}",
  "notes" => "<p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "customer_list_id",
      "description" => "Unique identifier of a customer list",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CustomerListUpdateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

