require 'json'


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/advertiser_defined_events', {
  "resourcePath" => "/Conversions",
  "summary" => "Get advertiser defined events",
  "nickname" => "advertiser_defined_events/get",
  "responseClass" => "AdvertiserDefinedEventsResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/advertiser_defined_events",
  "notes" => "<p>Get advertiser defined events for the given ad account.</p>",
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

