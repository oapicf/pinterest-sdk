require 'json'


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/analytics', {
  "resourcePath" => "/AdAccounts",
  "summary" => "Get ad account analytics",
  "nickname" => "ad_account/analytics",
  "responseClass" => "Array<Hash<String, Object>>",
  "endpoint" => "/ad_accounts/{ad_account_id}/analytics",
  "notes" => "Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.",
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
      "name" => "columns",
      "description" => "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "granularity",
      "description" => "Granularity",
      "dataType" => "Granularity",
      "allowableValues" => "[TOTAL, DAY, HOUR, WEEK, MONTH]",
      "paramType" => "query",
    },
    {
      "name" => "click_window_days",
      "description" => "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "engagement_window_days",
      "description" => "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "view_window_days",
      "description" => "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "1",
      "paramType" => "query",
    },
    {
      "name" => "conversion_report_time",
      "description" => "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.",
      "dataType" => "String",
      "allowableValues" => "[TIME_OF_AD_ACTION, TIME_OF_CONVERSION]",
      "defaultValue" => "'TIME_OF_AD_ACTION'",
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


MyApp.add_route('GET', '/v5/ad_accounts', {
  "resourcePath" => "/AdAccounts",
  "summary" => "List ad accounts",
  "nickname" => "ad_accounts/list",
  "responseClass" => "Paginated",
  "endpoint" => "/ad_accounts",
  "notes" => "Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "include_shared_accounts",
      "description" => "Include shared ad accounts",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/ad_groups/analytics', {
  "resourcePath" => "/AdAccounts",
  "summary" => "Get ad group analytics",
  "nickname" => "ad_groups/analytics",
  "responseClass" => "Array<Hash<String, Object>>",
  "endpoint" => "/ad_accounts/{ad_account_id}/ad_groups/analytics",
  "notes" => "Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.",
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
      "name" => "ad_group_ids",
      "description" => "List of Ad group Ids to use to filter the results.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "columns",
      "description" => "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "granularity",
      "description" => "Granularity",
      "dataType" => "Granularity",
      "allowableValues" => "[TOTAL, DAY, HOUR, WEEK, MONTH]",
      "paramType" => "query",
    },
    {
      "name" => "click_window_days",
      "description" => "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "engagement_window_days",
      "description" => "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "view_window_days",
      "description" => "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "1",
      "paramType" => "query",
    },
    {
      "name" => "conversion_report_time",
      "description" => "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.",
      "dataType" => "String",
      "allowableValues" => "[TIME_OF_AD_ACTION, TIME_OF_CONVERSION]",
      "defaultValue" => "'TIME_OF_AD_ACTION'",
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


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/ad_groups', {
  "resourcePath" => "/AdAccounts",
  "summary" => "List ad groups",
  "nickname" => "ad_groups/list",
  "responseClass" => "Paginated",
  "endpoint" => "/ad_accounts/{ad_account_id}/ad_groups",
  "notes" => "Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.",
  "parameters" => [
    {
      "name" => "campaign_ids",
      "description" => "List of Campaign Ids to use to filter the results.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "ad_group_ids",
      "description" => "List of Ad group Ids to use to filter the results.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "entity_statuses",
      "description" => "Entity status",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.",
      "dataType" => "String",
      "allowableValues" => "[ASCENDING, DESCENDING]",
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
      "name" => "translate_interests_to_names",
      "description" => "Return interests as text names (if value is true) rather than topic IDs.",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/ads/analytics', {
  "resourcePath" => "/AdAccounts",
  "summary" => "Get ad analytics",
  "nickname" => "ads/analytics",
  "responseClass" => "Array<Hash<String, Object>>",
  "endpoint" => "/ad_accounts/{ad_account_id}/ads/analytics",
  "notes" => "Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.",
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
      "name" => "ad_ids",
      "description" => "List of Ad Ids to use to filter the results.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "columns",
      "description" => "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "granularity",
      "description" => "Granularity",
      "dataType" => "Granularity",
      "allowableValues" => "[TOTAL, DAY, HOUR, WEEK, MONTH]",
      "paramType" => "query",
    },
    {
      "name" => "click_window_days",
      "description" => "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "engagement_window_days",
      "description" => "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "view_window_days",
      "description" => "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "1",
      "paramType" => "query",
    },
    {
      "name" => "conversion_report_time",
      "description" => "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.",
      "dataType" => "String",
      "allowableValues" => "[TIME_OF_AD_ACTION, TIME_OF_CONVERSION]",
      "defaultValue" => "'TIME_OF_AD_ACTION'",
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


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/ads', {
  "resourcePath" => "/AdAccounts",
  "summary" => "List ads",
  "nickname" => "ads/list",
  "responseClass" => "Paginated",
  "endpoint" => "/ad_accounts/{ad_account_id}/ads",
  "notes" => "Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.",
  "parameters" => [
    {
      "name" => "campaign_ids",
      "description" => "List of Campaign Ids to use to filter the results.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "ad_group_ids",
      "description" => "List of Ad group Ids to use to filter the results.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "ad_ids",
      "description" => "List of Ad Ids to use to filter the results.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "entity_statuses",
      "description" => "Entity status",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.",
      "dataType" => "String",
      "allowableValues" => "[ASCENDING, DESCENDING]",
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


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/reports', {
  "resourcePath" => "/AdAccounts",
  "summary" => "Create async request for an account analytics report",
  "nickname" => "analytics/create_report",
  "responseClass" => "AdsAnalyticsCreateAsyncResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/reports",
  "notes" => "This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.",
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
      "dataType" => "AdsAnalyticsCreateAsyncRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/reports', {
  "resourcePath" => "/AdAccounts",
  "summary" => "Get the account analytics report created by the async call",
  "nickname" => "analytics/get_report",
  "responseClass" => "AdsAnalyticsGetAsyncResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/reports",
  "notes" => "This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.",
  "parameters" => [
    {
      "name" => "token",
      "description" => "Token returned from the post request creation call",
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


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/campaigns/analytics', {
  "resourcePath" => "/AdAccounts",
  "summary" => "Get campaign analytics",
  "nickname" => "campaigns/analytics",
  "responseClass" => "Array<Hash<String, Object>>",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns/analytics",
  "notes" => "Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.",
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
      "name" => "campaign_ids",
      "description" => "List of Campaign Ids to use to filter the results.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "columns",
      "description" => "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "granularity",
      "description" => "Granularity",
      "dataType" => "Granularity",
      "allowableValues" => "[TOTAL, DAY, HOUR, WEEK, MONTH]",
      "paramType" => "query",
    },
    {
      "name" => "click_window_days",
      "description" => "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "engagement_window_days",
      "description" => "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "view_window_days",
      "description" => "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "1",
      "paramType" => "query",
    },
    {
      "name" => "conversion_report_time",
      "description" => "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.",
      "dataType" => "String",
      "allowableValues" => "[TIME_OF_AD_ACTION, TIME_OF_CONVERSION]",
      "defaultValue" => "'TIME_OF_AD_ACTION'",
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


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/campaigns', {
  "resourcePath" => "/AdAccounts",
  "summary" => "List campaigns",
  "nickname" => "campaigns/list",
  "responseClass" => "Paginated",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns",
  "notes" => "Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.",
  "parameters" => [
    {
      "name" => "campaign_ids",
      "description" => "List of Campaign Ids to use to filter the results.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "entity_statuses",
      "description" => "Entity status",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.",
      "dataType" => "String",
      "allowableValues" => "[ASCENDING, DESCENDING]",
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


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/product_groups/analytics', {
  "resourcePath" => "/AdAccounts",
  "summary" => "Get product group analytics",
  "nickname" => "product_groups/analytics",
  "responseClass" => "Array<Hash<String, Object>>",
  "endpoint" => "/ad_accounts/{ad_account_id}/product_groups/analytics",
  "notes" => "Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.",
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
      "name" => "product_group_ids",
      "description" => "List of Product group Ids to use to filter the results.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "columns",
      "description" => "Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "granularity",
      "description" => "Granularity",
      "dataType" => "Granularity",
      "allowableValues" => "[TOTAL, DAY, HOUR, WEEK, MONTH]",
      "paramType" => "query",
    },
    {
      "name" => "click_window_days",
      "description" => "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "engagement_window_days",
      "description" => "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "view_window_days",
      "description" => "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.",
      "dataType" => "Integer",
      "allowableValues" => "[1, 7, 30, 60]",
      "defaultValue" => "1",
      "paramType" => "query",
    },
    {
      "name" => "conversion_report_time",
      "description" => "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.",
      "dataType" => "String",
      "allowableValues" => "[TIME_OF_AD_ACTION, TIME_OF_CONVERSION]",
      "defaultValue" => "'TIME_OF_AD_ACTION'",
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

