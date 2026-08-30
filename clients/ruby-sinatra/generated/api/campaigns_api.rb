require 'json'


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/pins/analytics', {
  "resourcePath" => "/Campaigns",
  "summary" => "Get pins analytics",
  "nickname" => "ad_pins/analytics",
  "responseClass" => "Array<AdPinAnalytics>",
  "endpoint" => "/ad_accounts/{ad_account_id}/pins/analytics",
  "notes" => "Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Campaign Id to use to filter the results.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "pin_ids",
      "description" => "List of Pin IDs.",
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
      "name" => "columns",
      "description" => "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.",
      "dataType" => "Array<ReportingColumnSync>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "granularity",
      "description" => "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly",
      "dataType" => "Granularity",
      "allowableValues" => "[TOTAL, DAY, HOUR, WEEK, MONTH]",
      "paramType" => "query",
    },
    {
      "name" => "click_window_days",
      "description" => "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Float",
      "allowableValues" => "[0, 1, 7, 14, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "engagement_window_days",
      "description" => "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.",
      "dataType" => "Float",
      "allowableValues" => "[0, 1, 7, 14, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "view_window_days",
      "description" => "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.",
      "dataType" => "Float",
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


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/campaigns/targeting_analytics', {
  "resourcePath" => "/Campaigns",
  "summary" => "Get targeting analytics for campaigns",
  "nickname" => "campaign_targeting_analytics/get",
  "responseClass" => "MetricsResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics",
  "notes" => "Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.",
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
      "description" => "Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.",
      "dataType" => "Array<AdsAnalyticsCampaignTargetingType>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "columns",
      "description" => "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.",
      "dataType" => "Array<ReportingColumnSync>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "granularity",
      "description" => "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly",
      "dataType" => "Granularity",
      "allowableValues" => "[TOTAL, DAY, HOUR, WEEK, MONTH]",
      "paramType" => "query",
    },
    {
      "name" => "click_window_days",
      "description" => "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Float",
      "allowableValues" => "[0, 1, 7, 14, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "engagement_window_days",
      "description" => "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.",
      "dataType" => "Float",
      "allowableValues" => "[0, 1, 7, 14, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "view_window_days",
      "description" => "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.",
      "dataType" => "Float",
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
      "dataType" => "Array<ConversionReportAttributionType>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "reporting_timezone",
      "description" => "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.",
      "dataType" => "ReportingTimeZone",
      "allowableValues" => "[PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE]",
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
  "responseClass" => "Array<CampaignsAnalyticsMetrics>",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns/analytics",
  "notes" => "Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.",
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
      "description" => "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.",
      "dataType" => "Array<ReportingColumnSync>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    {
      "name" => "granularity",
      "description" => "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly",
      "dataType" => "Granularity",
      "allowableValues" => "[TOTAL, DAY, HOUR, WEEK, MONTH]",
      "paramType" => "query",
    },
    {
      "name" => "click_window_days",
      "description" => "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.",
      "dataType" => "Float",
      "allowableValues" => "[0, 1, 7, 14, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "engagement_window_days",
      "description" => "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.",
      "dataType" => "Float",
      "allowableValues" => "[0, 1, 7, 14, 30, 60]",
      "defaultValue" => "30",
      "paramType" => "query",
    },
    {
      "name" => "view_window_days",
      "description" => "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.",
      "dataType" => "Float",
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
      "name" => "aggregate_report_rows",
      "description" => "Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "reporting_timezone",
      "description" => "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.",
      "dataType" => "ReportingTimeZone",
      "allowableValues" => "[PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE]",
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
  "responseClass" => "CampaignBatchWriteResponseModel",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns",
  "notes" => "Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000",
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
      "dataType" => "Array<CampaignCreateItem>",
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
  "responseClass" => "Campaign",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}",
  "notes" => "Get a specific campaign given the campaign ID.",
  "parameters" => [
    {
      "name" => "campaign_id",
      "description" => "Campaign ID, must be associated with the ad account ID provided in the path.",
      "dataType" => "String",
      "paramType" => "path",
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
  "resourcePath" => "/Campaigns",
  "summary" => "List campaigns",
  "nickname" => "campaigns/list",
  "responseClass" => "campaigns_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns",
  "notes" => "Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.",
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
      "description" => "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.",
      "dataType" => "PinterestLibPaginationOrder",
      "allowableValues" => "[ASCENDING, DESCENDING]",
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
      "name" => "entity_statuses",
      "description" => "Entity status",
      "dataType" => "Array<EntityStatus>",
      "collectionFormat" => "multi",
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
  "responseClass" => "CampaignBatchWriteResponseModel",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns",
  "notes" => "Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000",
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
      "dataType" => "Array<CampaignBatchUpdateItem>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/campaigns/delivery_estimates', {
  "resourcePath" => "/Campaigns",
  "summary" => "Get campaign delivery estimates",
  "nickname" => "get_campaign_delivery_estimates",
  "responseClass" => "CampaignDeliveryEstimatesResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/campaigns/delivery_estimates",
  "notes" => "Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**",
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
      "dataType" => "Array<CampaignDeliveryEstimatesCampaign>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

