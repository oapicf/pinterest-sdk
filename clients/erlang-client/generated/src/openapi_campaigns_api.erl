-module(openapi_campaigns_api).

-export([campaign_targeting_analytics/get/8, campaign_targeting_analytics/get/9,
         campaigns/analytics/7, campaigns/analytics/8,
         campaigns/create/3, campaigns/create/4,
         campaigns/get/3, campaigns/get/4,
         campaigns/list/2, campaigns/list/3,
         campaigns/update/3, campaigns/update/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get targeting analytics for campaigns
%% Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
-spec campaign_targeting_analytics/get(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), list(), openapi_granularity) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaign_targeting_analytics/get(Ctx, AdAccountId, CampaignIds, StartDate, EndDate, TargetingTypes, Columns, Granularity) ->
    campaign_targeting_analytics/get(Ctx, AdAccountId, CampaignIds, StartDate, EndDate, TargetingTypes, Columns, Granularity, #{}).

-spec campaign_targeting_analytics/get(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, maps:map()) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaign_targeting_analytics/get(Ctx, AdAccountId, CampaignIds, StartDate, EndDate, TargetingTypes, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaigns/targeting_analytics"],
    QS = lists:flatten([[{<<"campaign_ids">>, X} || X <- CampaignIds], {<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"targeting_types">>, X} || X <- TargetingTypes], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time', 'attribution_types'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get campaign analytics
%% Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
-spec campaigns/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity) -> {ok, [openapi_campaigns_analytics_response_inner:openapi_campaigns_analytics_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/analytics(Ctx, AdAccountId, StartDate, EndDate, CampaignIds, Columns, Granularity) ->
    campaigns/analytics(Ctx, AdAccountId, StartDate, EndDate, CampaignIds, Columns, Granularity, #{}).

-spec campaigns/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, maps:map()) -> {ok, [openapi_campaigns_analytics_response_inner:openapi_campaigns_analytics_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/analytics(Ctx, AdAccountId, StartDate, EndDate, CampaignIds, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaigns/analytics"],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"campaign_ids">>, X} || X <- CampaignIds], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create campaigns
%% Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
-spec campaigns/create(ctx:ctx(), binary(), list()) -> {ok, openapi_campaign_create_response:openapi_campaign_create_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/create(Ctx, AdAccountId, OpenapiCampaignCreateRequestArray) ->
    campaigns/create(Ctx, AdAccountId, OpenapiCampaignCreateRequestArray, #{}).

-spec campaigns/create(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_campaign_create_response:openapi_campaign_create_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/create(Ctx, AdAccountId, OpenapiCampaignCreateRequestArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaigns"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCampaignCreateRequestArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get campaign
%% Get a specific campaign given the campaign ID.
-spec campaigns/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_campaign_response:openapi_campaign_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/get(Ctx, AdAccountId, CampaignId) ->
    campaigns/get(Ctx, AdAccountId, CampaignId, #{}).

-spec campaigns/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_campaign_response:openapi_campaign_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/get(Ctx, AdAccountId, CampaignId, Optional) ->
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
%% Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
-spec campaigns/list(ctx:ctx(), binary()) -> {ok, openapi_campaigns_list_200_response:openapi_campaigns_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/list(Ctx, AdAccountId) ->
    campaigns/list(Ctx, AdAccountId, #{}).

-spec campaigns/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_campaigns_list_200_response:openapi_campaigns_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaigns"],
    QS = lists:flatten([])++openapi_utils:optional_params(['campaign_ids', 'entity_statuses', 'page_size', 'order', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update campaigns
%% Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
-spec campaigns/update(ctx:ctx(), binary(), list()) -> {ok, openapi_campaign_update_response:openapi_campaign_update_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/update(Ctx, AdAccountId, OpenapiCampaignUpdateRequestArray) ->
    campaigns/update(Ctx, AdAccountId, OpenapiCampaignUpdateRequestArray, #{}).

-spec campaigns/update(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_campaign_update_response:openapi_campaign_update_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/update(Ctx, AdAccountId, OpenapiCampaignUpdateRequestArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaigns"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCampaignUpdateRequestArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


