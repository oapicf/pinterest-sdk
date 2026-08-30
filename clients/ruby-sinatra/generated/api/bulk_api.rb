require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/bulk/download', {
  "resourcePath" => "/Bulk",
  "summary" => "Get advertiser entities in bulk",
  "nickname" => "bulk_download/create",
  "responseClass" => "BulkDownload",
  "endpoint" => "/ad_accounts/{ad_account_id}/bulk/download",
  "notes" => "Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.",
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
      "dataType" => "BulkDownloadCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}', {
  "resourcePath" => "/Bulk",
  "summary" => "Download advertiser entities in bulk",
  "nickname" => "bulk_request/get",
  "responseClass" => "BulkJobData",
  "endpoint" => "/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}",
  "notes" => "Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).",
  "parameters" => [
    {
      "name" => "include_details",
      "description" => "If set to True then attach the errors/details to all the requests",
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
    {
      "name" => "bulk_request_id",
      "description" => "Bulk request ID that is from one of the entities bulk endpoints",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/bulk/upsert', {
  "resourcePath" => "/Bulk",
  "summary" => "Create/update ad entities in bulk",
  "nickname" => "bulk_upsert/create",
  "responseClass" => "BulkUpsertResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/bulk/upsert",
  "notes" => "Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Parameters to get create/update ad entities in bulk",
      "dataType" => "BulkUpsertRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

