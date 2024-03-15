require 'json'


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/campaigns/targeting_analytics', {
  "resourcePath" => "/Campaigns",
  "summary" => "Get targeting analytics for campaigns",
  "nickname" => "campaign_targeting_analytics/get",
  "responseClass" => "MetricsResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics",
  "notes" => "Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.",
  "parameters" => [
    {
      "name" => "campaign_ids",
      "description" => "List of Campaign Ids to use to filter the results.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "start_date",
      "description" => "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "targeting_types",
      "description" => "Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other.",
      "dataType" => "Array<AdsAnalyticsTargetingType>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "columns",
      "description" => "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "granularity",
      "description" => "TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly",
      "dataType" => "Granularity",
      "allowableValues" => "[TOTAL, DAY, HOUR, WEEK, MONTH]",
      "paramType" => "query",
    },
    {
      "name" => "click_window_days",
      "description" => "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[0, 1, 7, 14, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "engagement_window_days",
      "description" => "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[0, 1, 7, 14, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "view_window_days",
      "description" => "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.",
      "dataType" => "Integer",
      "allowableValues" => "[0, 1, 7, 14, 30, 60]",
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
      "name" => "attribution_types",
      "description" => "List of types of attribution for the conversion report",
      "dataType" => "ConversionReportAttributionType",
      "allowableValues" => "[INDIVIDUAL, HOUSEHOLD]",
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
  "resourcePath" => "/Campaigns",
  "summary" => "Get campaign analytics",
  "nickname" => "campaigns/analytics",
  "responseClass" => "Array<CampaignsAnalyticsResponse_inner>",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns/analytics",
  "notes" => "Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.",
  "parameters" => [
    {
      "name" => "start_date",
      "description" => "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.",
      "dataType" => "Date",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_date",
      "description" => "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.",
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
      "description" => "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "granularity",
      "description" => "TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly",
      "dataType" => "Granularity",
      "allowableValues" => "[TOTAL, DAY, HOUR, WEEK, MONTH]",
      "paramType" => "query",
    },
    {
      "name" => "click_window_days",
      "description" => "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[0, 1, 7, 14, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "engagement_window_days",
      "description" => "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Integer",
      "allowableValues" => "[0, 1, 7, 14, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "view_window_days",
      "description" => "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.",
      "dataType" => "Integer",
      "allowableValues" => "[0, 1, 7, 14, 30, 60]",
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


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/campaigns', {
  "resourcePath" => "/Campaigns",
  "summary" => "Create campaigns",
  "nickname" => "campaigns/create",
  "responseClass" => "CampaignCreateResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns",
  "notes" => "Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Array of campaigns.",
      "dataType" => "Array<CampaignCreateRequest>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/campaigns/{campaign_id}', {
  "resourcePath" => "/Campaigns",
  "summary" => "Get campaign",
  "nickname" => "campaigns/get",
  "responseClass" => "CampaignResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}",
  "notes" => "Get a specific campaign given the campaign ID.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "campaign_id",
      "description" => "Campaign ID, must be associated with the ad account ID provided in the path.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/campaigns', {
  "resourcePath" => "/Campaigns",
  "summary" => "List campaigns",
  "nickname" => "campaigns/list",
  "responseClass" => "campaigns_list_200_response",
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
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
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


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/campaigns', {
  "resourcePath" => "/Campaigns",
  "summary" => "Update campaigns",
  "nickname" => "campaigns/update",
  "responseClass" => "CampaignUpdateResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns",
  "notes" => "Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Array of campaigns.",
      "dataType" => "Array<CampaignUpdateRequest>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

