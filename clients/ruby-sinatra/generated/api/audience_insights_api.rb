require 'json'


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/audience_insights', {
  "resourcePath" => "/AudienceInsights",
  "summary" => "Get audience insights",
  "nickname" => "audience_insights/get",
  "responseClass" => "AudienceInsightsResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/audience_insights",
  "notes" => "Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.",
  "parameters" => [
    {
      "name" => "audience_insight_type",
      "description" => "Type of audience insights.",
      "dataType" => "AudienceInsightType",
      "allowableValues" => "[YOUR_TOTAL_AUDIENCE, YOUR_ENGAGED_AUDIENCE, PINTEREST_TOTAL_AUDIENCE]",
      "defaultValue" => "'YOUR_TOTAL_AUDIENCE'",
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


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/insights/audiences', {
  "resourcePath" => "/AudienceInsights",
  "summary" => "Get audience insights scope and type",
  "nickname" => "audience_insights_scope_and_type/get",
  "responseClass" => "AudienceDefinitionResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/insights/audiences",
  "notes" => "Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.",
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

