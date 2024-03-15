require 'json'


MyApp.add_route('DELETE', '/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}', {
  "resourcePath" => "/LeadAds",
  "summary" => "Delete lead ads subscription",
  "nickname" => "ad_accounts_subscriptions/del_by_id",
  "responseClass" => "void",
  "endpoint" => "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}",
  "notes" => "Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "subscription_id",
      "description" => "Unique identifier of a subscription.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}', {
  "resourcePath" => "/LeadAds",
  "summary" => "Get lead ads subscription",
  "nickname" => "ad_accounts_subscriptions/get_by_id",
  "responseClass" => "AdAccountGetSubscriptionResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}",
  "notes" => "Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "subscription_id",
      "description" => "Unique identifier of a subscription.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/leads/subscriptions', {
  "resourcePath" => "/LeadAds",
  "summary" => "Get lead ads subscriptions",
  "nickname" => "ad_accounts_subscriptions/get_list",
  "responseClass" => "ad_accounts_subscriptions_get_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/leads/subscriptions",
  "notes" => "Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>",
  "parameters" => [
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
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


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/leads/subscriptions', {
  "resourcePath" => "/LeadAds",
  "summary" => "Create lead ads subscription",
  "nickname" => "ad_accounts_subscriptions/post",
  "responseClass" => "AdAccountCreateSubscriptionResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/leads/subscriptions",
  "notes" => "Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Subscription to create.",
      "dataType" => "AdAccountCreateSubscriptionRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

