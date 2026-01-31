require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/msot/events', {
  "resourcePath" => "/MsotEvents",
  "summary" => "Send Measurement Source Of Truth (MSOT) attributed conversion events",
  "nickname" => "msot_events/create",
  "responseClass" => "void",
  "endpoint" => "/ad_accounts/{ad_account_id}/msot/events",
  "notes" => "<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Attributed MSOT conversion events",
      "dataType" => "ConversionMSOTEvents",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

