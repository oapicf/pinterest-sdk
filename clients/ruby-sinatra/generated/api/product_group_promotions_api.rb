require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/product_group_promotions', {
  "resourcePath" => "/ProductGroupPromotions",
  "summary" => "Create product group promotions",
  "nickname" => "product_group_promotions/create",
  "responseClass" => "ProductGroupPromotionResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/product_group_promotions",
  "notes" => "Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "List of Product Group Promotions to create, size limit [1, 30].",
      "dataType" => "ProductGroupPromotionCreateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}', {
  "resourcePath" => "/ProductGroupPromotions",
  "summary" => "Get a product group promotion by id",
  "nickname" => "product_group_promotions/get",
  "responseClass" => "ProductGroupPromotionResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}",
  "notes" => "Get a product group promotion by id",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "product_group_promotion_id",
      "description" => "Unique identifier of a product group promotion",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/product_group_promotions', {
  "resourcePath" => "/ProductGroupPromotions",
  "summary" => "Get product group promotions",
  "nickname" => "product_group_promotions/list",
  "responseClass" => "product_group_promotions_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/product_group_promotions",
  "notes" => "List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.",
  "parameters" => [
    {
      "name" => "product_group_promotion_ids",
      "description" => "List of Product group promotion Ids.",
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
      "name" => "ad_group_id",
      "description" => "Ad group Id.",
      "dataType" => "String",
      "allowableValues" => "",
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


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/product_group_promotions', {
  "resourcePath" => "/ProductGroupPromotions",
  "summary" => "Update product group promotions",
  "nickname" => "product_group_promotions/update",
  "responseClass" => "ProductGroupPromotionResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/product_group_promotions",
  "notes" => "Update multiple existing Product Group Promotions (by product_group_id)",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Parameters to update Product group promotions",
      "dataType" => "ProductGroupPromotionUpdateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/product_groups/analytics', {
  "resourcePath" => "/ProductGroupPromotions",
  "summary" => "Get product group analytics",
  "nickname" => "product_groups/analytics",
  "responseClass" => "Array<ProductGroupAnalyticsResponse_inner>",
  "endpoint" => "/ad_accounts/{ad_account_id}/product_groups/analytics",
  "notes" => "Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.",
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
      "name" => "product_group_ids",
      "description" => "List of Product group Ids to use to filter the results.",
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

