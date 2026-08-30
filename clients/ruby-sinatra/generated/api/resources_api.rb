require 'json'


MyApp.add_route('GET', '/v5/resources/ad_account_countries', {
  "resourcePath" => "/Resources",
  "summary" => "Get ad accounts countries",
  "nickname" => "ad_account_countries/get",
  "responseClass" => "ad_account_countries_get_200_response",
  "endpoint" => "/resources/ad_account_countries",
  "notes" => "Get Ad Accounts countries",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/resources/delivery_metrics', {
  "resourcePath" => "/Resources",
  "summary" => "Get available metrics' definitions",
  "nickname" => "delivery_metrics/get",
  "responseClass" => "delivery_metrics_get_200_response",
  "endpoint" => "/resources/delivery_metrics",
  "notes" => "Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.",
  "parameters" => [
    {
      "name" => "report_type",
      "description" => "Report type.",
      "dataType" => "ReportType",
      "allowableValues" => "[SYNC, ASYNC]",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/resources/targeting/interests/{interest_id}', {
  "resourcePath" => "/Resources",
  "summary" => "Get interest details",
  "nickname" => "interest_targeting_options/get",
  "responseClass" => "SingleInterestTargetingOption",
  "endpoint" => "/resources/targeting/interests/{interest_id}",
  "notes" => "Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.",
  "parameters" => [
    {
      "name" => "interest_id",
      "description" => "Unique identifier of an interest.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/resources/lead_form_questions', {
  "resourcePath" => "/Resources",
  "summary" => "Get lead form questions",
  "nickname" => "lead_form_questions/get",
  "responseClass" => "void",
  "endpoint" => "/resources/lead_form_questions",
  "notes" => "Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/resources/metrics_ready_state', {
  "resourcePath" => "/Resources",
  "summary" => "Get metrics ready state",
  "nickname" => "metrics_ready_state/get",
  "responseClass" => "BookClosed",
  "endpoint" => "/resources/metrics_ready_state",
  "notes" => "Learn whether conversion or non-conversion metrics are finalized and ready to query.",
  "parameters" => [
    {
      "name" => "date",
      "description" => "Analytics reports request date (UTC). Format: YYYY-MM-DD",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/resources/targeting/{targeting_type}', {
  "resourcePath" => "/Resources",
  "summary" => "Get targeting options",
  "nickname" => "targeting_options/get",
  "responseClass" => "Array<Object>",
  "endpoint" => "/resources/targeting/{targeting_type}",
  "notes" => "    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "client_id",
      "description" => "Client ID",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "oauth_signature",
      "description" => "Oauth signature",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "timestamp",
      "description" => "Timestamp.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "targeting_type",
      "description" => "Public targeting type",
      "dataType" => "PublicTargetingType",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

