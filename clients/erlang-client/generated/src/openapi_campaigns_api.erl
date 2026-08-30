-module(openapi_campaigns_api).

-export([ad_pins/analytics/8, ad_pins/analytics/9,
         campaign_targeting_analytics/get/8, campaign_targeting_analytics/get/9,
         campaigns/analytics/7, campaigns/analytics/8,
         campaigns/create/3, campaigns/create/4,
         campaigns/get/3, campaigns/get/4,
         campaigns/list/2, campaigns/list/3,
         campaigns/update/3, campaigns/update/4,
         get_campaign_delivery_estimates/3, get_campaign_delivery_estimates/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get pins analytics
%% Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
-spec ad_pins/analytics(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), openapi_granularity, binary()) -> {ok, [openapi_ad_pin_analytics:openapi_ad_pin_analytics()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_pins/analytics(Ctx, CampaignId, PinIds, StartDate, EndDate, Columns, Granularity, AdAccountId) ->
    ad_pins/analytics(Ctx, CampaignId, PinIds, StartDate, EndDate, Columns, Granularity, AdAccountId, #{}).

-spec ad_pins/analytics(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), openapi_granularity, binary(), maps:map()) -> {ok, [openapi_ad_pin_analytics:openapi_ad_pin_analytics()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_pins/analytics(Ctx, CampaignId, PinIds, StartDate, EndDate, Columns, Granularity, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/pins/analytics"],
    QS = lists:flatten([{<<"campaign_id">>, CampaignId}, [{<<"pin_ids">>, X} || X <- PinIds], {<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get targeting analytics for campaigns
%% Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
-spec campaign_targeting_analytics/get(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), list(), openapi_granularity) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaign_targeting_analytics/get(Ctx, AdAccountId, CampaignIds, StartDate, EndDate, TargetingTypes, Columns, Granularity) ->
    campaign_targeting_analytics/get(Ctx, AdAccountId, CampaignIds, StartDate, EndDate, TargetingTypes, Columns, Granularity, #{}).

-spec campaign_targeting_analytics/get(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, maps:map()) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaign_targeting_analytics/get(Ctx, AdAccountId, CampaignIds, StartDate, EndDate, TargetingTypes, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaigns/targeting_analytics"],
    QS = lists:flatten([[{<<"campaign_ids">>, X} || X <- CampaignIds], {<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"targeting_types">>, X} || X <- TargetingTypes], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time', 'attribution_types', 'reporting_timezone'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get campaign analytics
%% Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
-spec campaigns/analytics(ctx:ctx(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, binary()) -> {ok, [openapi_campaigns_analytics_metrics:openapi_campaigns_analytics_metrics()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/analytics(Ctx, StartDate, EndDate, CampaignIds, Columns, Granularity, AdAccountId) ->
    campaigns/analytics(Ctx, StartDate, EndDate, CampaignIds, Columns, Granularity, AdAccountId, #{}).

-spec campaigns/analytics(ctx:ctx(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, binary(), maps:map()) -> {ok, [openapi_campaigns_analytics_metrics:openapi_campaigns_analytics_metrics()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/analytics(Ctx, StartDate, EndDate, CampaignIds, Columns, Granularity, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaigns/analytics"],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"campaign_ids">>, X} || X <- CampaignIds], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time', 'aggregate_report_rows', 'reporting_timezone'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create campaigns
%% Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
-spec campaigns/create(ctx:ctx(), binary(), list()) -> {ok, openapi_campaign_batch_write_response_model:openapi_campaign_batch_write_response_model(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/create(Ctx, AdAccountId, OpenapiCampaignCreateItemArray) ->
    campaigns/create(Ctx, AdAccountId, OpenapiCampaignCreateItemArray, #{}).

-spec campaigns/create(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_campaign_batch_write_response_model:openapi_campaign_batch_write_response_model(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/create(Ctx, AdAccountId, OpenapiCampaignCreateItemArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaigns"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCampaignCreateItemArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get campaign
%% Get a specific campaign given the campaign ID.
-spec campaigns/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_campaign:openapi_campaign(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/get(Ctx, CampaignId, AdAccountId) ->
    campaigns/get(Ctx, CampaignId, AdAccountId, #{}).

-spec campaigns/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_campaign:openapi_campaign(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/get(Ctx, CampaignId, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaigns/", CampaignId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List campaigns
%% Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
-spec campaigns/list(ctx:ctx(), binary()) -> {ok, openapi_campaigns_list_200_response:openapi_campaigns_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/list(Ctx, AdAccountId) ->
    campaigns/list(Ctx, AdAccountId, #{}).

-spec campaigns/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_campaigns_list_200_response:openapi_campaigns_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaigns"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'order', 'campaign_ids', 'entity_statuses'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update campaigns
%% Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
-spec campaigns/update(ctx:ctx(), binary(), list()) -> {ok, openapi_campaign_batch_write_response_model:openapi_campaign_batch_write_response_model(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/update(Ctx, AdAccountId, OpenapiCampaignBatchUpdateItemArray) ->
    campaigns/update(Ctx, AdAccountId, OpenapiCampaignBatchUpdateItemArray, #{}).

-spec campaigns/update(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_campaign_batch_write_response_model:openapi_campaign_batch_write_response_model(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/update(Ctx, AdAccountId, OpenapiCampaignBatchUpdateItemArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaigns"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCampaignBatchUpdateItemArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get campaign delivery estimates
%% Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**
-spec get_campaign_delivery_estimates(ctx:ctx(), binary(), list()) -> {ok, openapi_campaign_delivery_estimates_response:openapi_campaign_delivery_estimates_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_campaign_delivery_estimates(Ctx, AdAccountId, OpenapiCampaignDeliveryEstimatesCampaignArray) ->
    get_campaign_delivery_estimates(Ctx, AdAccountId, OpenapiCampaignDeliveryEstimatesCampaignArray, #{}).

-spec get_campaign_delivery_estimates(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_campaign_delivery_estimates_response:openapi_campaign_delivery_estimates_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_campaign_delivery_estimates(Ctx, AdAccountId, OpenapiCampaignDeliveryEstimatesCampaignArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaigns/delivery_estimates"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCampaignDeliveryEstimatesCampaignArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


