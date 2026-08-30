require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/schedules', {
  "resourcePath" => "/Schedules",
  "summary" => "Create schedules",
  "nickname" => "schedules/create",
  "responseClass" => "Array<schedules_create_200_response_inner>",
  "endpoint" => "/ad_accounts/{ad_account_id}/schedules",
  "notes" => "Batch create schedules",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Array<ScheduleCreate>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/schedules', {
  "resourcePath" => "/Schedules",
  "summary" => "Get Schedules",
  "nickname" => "schedules/list",
  "responseClass" => "schedules_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/schedules",
  "notes" => "Get schedules for a specific advertiser",
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
      "name" => "schedule_statuses",
      "description" => "Filter schedules by status (one or more)",
      "dataType" => "Array<ScheduleStatus>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "schedule_type",
      "description" => "Filter schedules by a type",
      "dataType" => "ScheduleType",
      "allowableValues" => "[CAMPAIGN_BUDGET_CHANGE, CAMPAIGN_BID_MULTIPLIERS]",
      "paramType" => "query",
    },
    {
      "name" => "entity_ids",
      "description" => "List of Entity IDs, must be associated with the Ad Accound ID provided in the path.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "ad_account_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/schedules', {
  "resourcePath" => "/Schedules",
  "summary" => "Update schedules",
  "nickname" => "schedules/update",
  "responseClass" => "Array<schedules_create_200_response_inner>",
  "endpoint" => "/ad_accounts/{ad_account_id}/schedules",
  "notes" => "Update one or more schedules",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Array<ScheduleBatchUpdate>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

