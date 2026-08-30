require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/msot/events', {
  "resourcePath" => "/MsotEvents",
  "summary" => "Send Measurement Source Of Truth (MSOT) attributed conversion events",
  "nickname" => "msot_events/create",
  "responseClass" => "void",
  "endpoint" => "/ad_accounts/{ad_account_id}/msot/events",
  "notes" => "**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.",
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
      "dataType" => "ConversionMSOTEventsCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

