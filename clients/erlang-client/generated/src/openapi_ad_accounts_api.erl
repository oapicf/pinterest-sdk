-module(openapi_ad_accounts_api).

-export([ad_account/analytics/6, ad_account/analytics/7,
         ad_accounts/list/1, ad_accounts/list/2,
         ad_groups/analytics/7, ad_groups/analytics/8,
         ad_groups/list/2, ad_groups/list/3,
         ads/analytics/7, ads/analytics/8,
         ads/list/2, ads/list/3,
         analytics/create_report/3, analytics/create_report/4,
         analytics/get_report/3, analytics/get_report/4,
         campaigns/analytics/7, campaigns/analytics/8,
         campaigns/list/2, campaigns/list/3,
         product_groups/analytics/7, product_groups/analytics/8]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get ad account analytics
%% Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
-spec ad_account/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), openapi_granularity:openapi_granularity()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_account/analytics(Ctx, AdAccountId, StartDate, EndDate, Columns, Granularity) ->
    ad_account/analytics(Ctx, AdAccountId, StartDate, EndDate, Columns, Granularity, #{}).

-spec ad_account/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), openapi_granularity:openapi_granularity(), maps:map()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_account/analytics(Ctx, AdAccountId, StartDate, EndDate, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/ad_accounts/", AdAccountId, "/analytics">>],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List ad accounts
%% Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.
-spec ad_accounts/list(ctx:ctx()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts/list(Ctx) ->
    ad_accounts/list(Ctx, #{}).

-spec ad_accounts/list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts/list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/ad_accounts">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'include_shared_accounts'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get ad group analytics
%% Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
-spec ad_groups/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity:openapi_granularity()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/analytics(Ctx, AdAccountId, StartDate, EndDate, AdGroupIds, Columns, Granularity) ->
    ad_groups/analytics(Ctx, AdAccountId, StartDate, EndDate, AdGroupIds, Columns, Granularity, #{}).

-spec ad_groups/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity:openapi_granularity(), maps:map()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/analytics(Ctx, AdAccountId, StartDate, EndDate, AdGroupIds, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/ad_accounts/", AdAccountId, "/ad_groups/analytics">>],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"ad_group_ids">>, X} || X <- AdGroupIds], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List ad groups
%% Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
-spec ad_groups/list(ctx:ctx(), binary()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/list(Ctx, AdAccountId) ->
    ad_groups/list(Ctx, AdAccountId, #{}).

-spec ad_groups/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/ad_accounts/", AdAccountId, "/ad_groups">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['campaign_ids', 'ad_group_ids', 'entity_statuses', 'page_size', 'order', 'bookmark', 'translate_interests_to_names'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get ad analytics
%% Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
-spec ads/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity:openapi_granularity()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/analytics(Ctx, AdAccountId, StartDate, EndDate, AdIds, Columns, Granularity) ->
    ads/analytics(Ctx, AdAccountId, StartDate, EndDate, AdIds, Columns, Granularity, #{}).

-spec ads/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity:openapi_granularity(), maps:map()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/analytics(Ctx, AdAccountId, StartDate, EndDate, AdIds, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/ad_accounts/", AdAccountId, "/ads/analytics">>],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"ad_ids">>, X} || X <- AdIds], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List ads
%% Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
-spec ads/list(ctx:ctx(), binary()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/list(Ctx, AdAccountId) ->
    ads/list(Ctx, AdAccountId, #{}).

-spec ads/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/ad_accounts/", AdAccountId, "/ads">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['campaign_ids', 'ad_group_ids', 'ad_ids', 'entity_statuses', 'page_size', 'order', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create async request for an account analytics report
%% This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
-spec analytics/create_report(ctx:ctx(), binary(), openapi_ads_analytics_create_async_request:openapi_ads_analytics_create_async_request()) -> {ok, openapi_ads_analytics_create_async_response:openapi_ads_analytics_create_async_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/create_report(Ctx, AdAccountId, OpenapiAdsAnalyticsCreateAsyncRequest) ->
    analytics/create_report(Ctx, AdAccountId, OpenapiAdsAnalyticsCreateAsyncRequest, #{}).

-spec analytics/create_report(ctx:ctx(), binary(), openapi_ads_analytics_create_async_request:openapi_ads_analytics_create_async_request(), maps:map()) -> {ok, openapi_ads_analytics_create_async_response:openapi_ads_analytics_create_async_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/create_report(Ctx, AdAccountId, OpenapiAdsAnalyticsCreateAsyncRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/ad_accounts/", AdAccountId, "/reports">>],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdsAnalyticsCreateAsyncRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get the account analytics report created by the async call
%% This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
-spec analytics/get_report(ctx:ctx(), binary(), binary()) -> {ok, openapi_ads_analytics_get_async_response:openapi_ads_analytics_get_async_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/get_report(Ctx, AdAccountId, Token) ->
    analytics/get_report(Ctx, AdAccountId, Token, #{}).

-spec analytics/get_report(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_ads_analytics_get_async_response:openapi_ads_analytics_get_async_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/get_report(Ctx, AdAccountId, Token, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/ad_accounts/", AdAccountId, "/reports">>],
    QS = lists:flatten([{<<"token">>, Token}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get campaign analytics
%% Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
-spec campaigns/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity:openapi_granularity()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/analytics(Ctx, AdAccountId, StartDate, EndDate, CampaignIds, Columns, Granularity) ->
    campaigns/analytics(Ctx, AdAccountId, StartDate, EndDate, CampaignIds, Columns, Granularity, #{}).

-spec campaigns/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity:openapi_granularity(), maps:map()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/analytics(Ctx, AdAccountId, StartDate, EndDate, CampaignIds, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/ad_accounts/", AdAccountId, "/campaigns/analytics">>],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"campaign_ids">>, X} || X <- CampaignIds], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List campaigns
%% Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
-spec campaigns/list(ctx:ctx(), binary()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/list(Ctx, AdAccountId) ->
    campaigns/list(Ctx, AdAccountId, #{}).

-spec campaigns/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaigns/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/ad_accounts/", AdAccountId, "/campaigns">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['campaign_ids', 'entity_statuses', 'page_size', 'order', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get product group analytics
%% Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
-spec product_groups/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity:openapi_granularity()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_groups/analytics(Ctx, AdAccountId, StartDate, EndDate, ProductGroupIds, Columns, Granularity) ->
    product_groups/analytics(Ctx, AdAccountId, StartDate, EndDate, ProductGroupIds, Columns, Granularity, #{}).

-spec product_groups/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity:openapi_granularity(), maps:map()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
product_groups/analytics(Ctx, AdAccountId, StartDate, EndDate, ProductGroupIds, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/ad_accounts/", AdAccountId, "/product_groups/analytics">>],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"product_group_ids">>, X} || X <- ProductGroupIds], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


