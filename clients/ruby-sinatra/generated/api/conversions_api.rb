require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/advertiser_defined_events', {
  "resourcePath" => "/Conversions",
  "summary" => "Create advertiser defined events",
  "nickname" => "advertiser_defined_events/create",
  "responseClass" => "advertiser_defined_events_create_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/advertiser_defined_events",
  "notes" => "Map advertiser defined events to standard events for the given ad account.",
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
      "dataType" => "AdvertiserDefinedEventsCreateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/ad_accounts/{ad_account_id}/advertiser_defined_events', {
  "resourcePath" => "/Conversions",
  "summary" => "Delete advertiser defined events",
  "nickname" => "advertiser_defined_events/delete",
  "responseClass" => "advertiser_defined_events_create_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/advertiser_defined_events",
  "notes" => "Untrack advertiser defined events for the given ad account.",
  "parameters" => [
    {
      "name" => "event_names",
      "description" => "List of event names to delete",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
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


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/advertiser_defined_events', {
  "resourcePath" => "/Conversions",
  "summary" => "Get advertiser defined events",
  "nickname" => "advertiser_defined_events/get",
  "responseClass" => "advertiser_defined_events_get_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/advertiser_defined_events",
  "notes" => "Get advertiser defined events for the given ad account.",
  "parameters" => [
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


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/advertiser_defined_events', {
  "resourcePath" => "/Conversions",
  "summary" => "Update advertiser defined events",
  "nickname" => "advertiser_defined_events/update",
  "responseClass" => "advertiser_defined_events_create_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/advertiser_defined_events",
  "notes" => "Update advertiser defined event names or mappings for the given ad account.",
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
      "dataType" => "AdvertiserDefinedEventsCreateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

