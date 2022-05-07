require 'json'


MyApp.add_route('GET', '/v5/user_account/analytics', {
  "resourcePath" => "/UserAccount",
  "summary" => "Get user account analytics",
  "nickname" => "user_account/analytics",
  "responseClass" => "Hash<String, AnalyticsMetricsResponse>",
  "endpoint" => "/user_account/analytics",
  "notes" => "Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".",
  "parameters" => [
    {
      "name" => "start_date",
      "description" => "Metric report start date (UTC). Format: YYYY-MM-DD",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "Metric report end date (UTC). Format: YYYY-MM-DD",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "from_claimed_content",
      "description" => "Filter on Pins that match your claimed domain.",
      "dataType" => "String",
      "allowableValues" => "[OTHER, CLAIMED, BOTH]",
      "defaultValue" => "'BOTH'",
      "paramType" => "query",
    },
    {
      "name" => "pin_format",
      "description" => "Pin formats to get data for, default is all.",
      "dataType" => "String",
      "allowableValues" => "[ALL, PRODUCT, REGULAR, VIDEO]",
      "defaultValue" => "'ALL'",
      "paramType" => "query",
    },
    {
      "name" => "app_types",
      "description" => "Apps or devices to get data for, default is all.",
      "dataType" => "String",
      "allowableValues" => "[ALL, MOBILE, TABLET, WEB]",
      "defaultValue" => "'ALL'",
      "paramType" => "query",
    },
    {
      "name" => "metric_types",
      "description" => "Metric types to get data for, default is all. ",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "split_field",
      "description" => "How to split the data into groups. Not including this param means data won&#39;t be split.",
      "dataType" => "String",
      "allowableValues" => "[NO_SPLIT, APP_TYPE, OWNED_CONTENT, PIN_FORMAT]",
      "defaultValue" => "'NO_SPLIT'",
      "paramType" => "query",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/user_account', {
  "resourcePath" => "/UserAccount",
  "summary" => "Get user account",
  "nickname" => "user_account/get",
  "responseClass" => "Account",
  "endpoint" => "/user_account",
  "notes" => "Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

