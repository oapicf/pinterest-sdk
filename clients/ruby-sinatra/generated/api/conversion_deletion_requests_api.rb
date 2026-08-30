require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests', {
  "resourcePath" => "/ConversionDeletionRequests",
  "summary" => "Create a conversion deletion request",
  "nickname" => "conversion_deletion_request/create",
  "responseClass" => "ConversionDeletionRequest",
  "endpoint" => "/ad_accounts/{ad_account_id}/conversion_deletion_requests",
  "notes" => "**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.",
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
      "dataType" => "ConversionDeletionRequestCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}', {
  "resourcePath" => "/ConversionDeletionRequests",
  "summary" => "Delete a conversion deletion request",
  "nickname" => "conversion_deletion_request/delete",
  "responseClass" => "ConversionDeletionRequest",
  "endpoint" => "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}",
  "notes" => "**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.",
  "parameters" => [
    {
      "name" => "request_id",
      "description" => "Unique identifier of the conversion deletion request",
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


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}', {
  "resourcePath" => "/ConversionDeletionRequests",
  "summary" => "Get a single conversion deletion request",
  "nickname" => "conversion_deletion_request/get",
  "responseClass" => "ConversionDeletionRequest",
  "endpoint" => "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}",
  "notes" => "**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.",
  "parameters" => [
    {
      "name" => "request_id",
      "description" => "Unique identifier of the conversion deletion request",
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


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests', {
  "resourcePath" => "/ConversionDeletionRequests",
  "summary" => "List conversion deletion requests",
  "nickname" => "conversion_deletion_request/list",
  "responseClass" => "conversion_deletion_request_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/conversion_deletion_requests",
  "notes" => "**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.",
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

