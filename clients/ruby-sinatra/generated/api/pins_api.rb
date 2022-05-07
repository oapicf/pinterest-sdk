require 'json'


MyApp.add_route('GET', '/v5/pins/{pin_id}/analytics', {
  "resourcePath" => "/Pins",
  "summary" => "Get Pin analytics",
  "nickname" => "pins/analytics",
  "responseClass" => "Hash<String, AnalyticsMetricsResponse>",
  "endpoint" => "/pins/{pin_id}/analytics",
  "notes" => "Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.",
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
      "name" => "app_types",
      "description" => "Apps or devices to get data for, default is all.",
      "dataType" => "String",
      "allowableValues" => "[ALL, MOBILE, TABLET, WEB]",
      "defaultValue" => "'ALL'",
      "paramType" => "query",
    },
    {
      "name" => "metric_types",
      "description" => "Pin metric types to get data for, default is all.",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "split_field",
      "description" => "How to split the data into groups. Not including this param means data won&#39;t be split.",
      "dataType" => "String",
      "allowableValues" => "[NO_SPLIT, APP_TYPE]",
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
    {
      "name" => "pin_id",
      "description" => "Unique identifier of a Pin.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/pins', {
  "resourcePath" => "/Pins",
  "summary" => "Create Pin",
  "nickname" => "pins/create",
  "responseClass" => "Pin",
  "endpoint" => "/pins",
  "notes" => "Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "Create a new Pin.",
      "dataType" => "Pin",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/pins/{pin_id}', {
  "resourcePath" => "/Pins",
  "summary" => "Delete Pin",
  "nickname" => "pins/delete",
  "responseClass" => "void",
  "endpoint" => "/pins/{pin_id}",
  "notes" => "Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.",
  "parameters" => [
    {
      "name" => "pin_id",
      "description" => "Unique identifier of a Pin.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/pins/{pin_id}', {
  "resourcePath" => "/Pins",
  "summary" => "Get Pin",
  "nickname" => "pins/get",
  "responseClass" => "Pin",
  "endpoint" => "/pins/{pin_id}",
  "notes" => "Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pin_id",
      "description" => "Unique identifier of a Pin.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

