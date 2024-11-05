-module(openapi_ad_accounts_api).

-export([ad_account/analytics/6, ad_account/analytics/7,
         ad_account_targeting_analytics/get/7, ad_account_targeting_analytics/get/8,
         ad_accounts/create/2, ad_accounts/create/3,
         ad_accounts/get/2, ad_accounts/get/3,
         ad_accounts/list/1, ad_accounts/list/2,
         analytics/create_mmm_report/3, analytics/create_mmm_report/4,
         analytics/create_report/3, analytics/create_report/4,
         analytics/create_template_report/3, analytics/create_template_report/4,
         analytics/get_mmm_report/3, analytics/get_mmm_report/4,
         analytics/get_report/3, analytics/get_report/4,
         sandbox/delete/2, sandbox/delete/3,
         templates/list/2, templates/list/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get ad account analytics
%% Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.
-spec ad_account/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), openapi_granularity) -> {ok, [openapi_ad_account_analytics_response_inner:openapi_ad_account_analytics_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_account/analytics(Ctx, AdAccountId, StartDate, EndDate, Columns, Granularity) ->
    ad_account/analytics(Ctx, AdAccountId, StartDate, EndDate, Columns, Granularity, #{}).

-spec ad_account/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), openapi_granularity, maps:map()) -> {ok, [openapi_ad_account_analytics_response_inner:openapi_ad_account_analytics_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_account/analytics(Ctx, AdAccountId, StartDate, EndDate, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/analytics"],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get targeting analytics for an ad account
%% Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
-spec ad_account_targeting_analytics/get(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_account_targeting_analytics/get(Ctx, AdAccountId, StartDate, EndDate, TargetingTypes, Columns, Granularity) ->
    ad_account_targeting_analytics/get(Ctx, AdAccountId, StartDate, EndDate, TargetingTypes, Columns, Granularity, #{}).

-spec ad_account_targeting_analytics/get(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, maps:map()) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_account_targeting_analytics/get(Ctx, AdAccountId, StartDate, EndDate, TargetingTypes, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/targeting_analytics"],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"targeting_types">>, X} || X <- TargetingTypes], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time', 'attribution_types'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create ad account
%% Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.
-spec ad_accounts/create(ctx:ctx(), openapi_ad_account_create_request:openapi_ad_account_create_request()) -> {ok, openapi_ad_account:openapi_ad_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts/create(Ctx, OpenapiAdAccountCreateRequest) ->
    ad_accounts/create(Ctx, OpenapiAdAccountCreateRequest, #{}).

-spec ad_accounts/create(ctx:ctx(), openapi_ad_account_create_request:openapi_ad_account_create_request(), maps:map()) -> {ok, openapi_ad_account:openapi_ad_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts/create(Ctx, OpenapiAdAccountCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdAccountCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get ad account
%% Get an ad account
-spec ad_accounts/get(ctx:ctx(), binary()) -> {ok, openapi_ad_account:openapi_ad_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts/get(Ctx, AdAccountId) ->
    ad_accounts/get(Ctx, AdAccountId, #{}).

-spec ad_accounts/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_ad_account:openapi_ad_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts/get(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List ad accounts
%% Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.
-spec ad_accounts/list(ctx:ctx()) -> {ok, openapi_ad_accounts_list_200_response:openapi_ad_accounts_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts/list(Ctx) ->
    ad_accounts/list(Ctx, #{}).

-spec ad_accounts/list(ctx:ctx(), maps:map()) -> {ok, openapi_ad_accounts_list_200_response:openapi_ad_accounts_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts/list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'include_shared_accounts'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a request for a Marketing Mix Modeling (MMM) report
%% This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.
-spec analytics/create_mmm_report(ctx:ctx(), binary(), openapi_create_mmm_report_request:openapi_create_mmm_report_request()) -> {ok, openapi_create_mmm_report_response:openapi_create_mmm_report_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/create_mmm_report(Ctx, AdAccountId, OpenapiCreateMmmReportRequest) ->
    analytics/create_mmm_report(Ctx, AdAccountId, OpenapiCreateMmmReportRequest, #{}).

-spec analytics/create_mmm_report(ctx:ctx(), binary(), openapi_create_mmm_report_request:openapi_create_mmm_report_request(), maps:map()) -> {ok, openapi_create_mmm_report_response:openapi_create_mmm_report_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/create_mmm_report(Ctx, AdAccountId, OpenapiCreateMmmReportRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/mmm_reports"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateMmmReportRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create async request for an account analytics report
%% This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
-spec analytics/create_report(ctx:ctx(), binary(), openapi_ads_analytics_create_async_request:openapi_ads_analytics_create_async_request()) -> {ok, openapi_ads_analytics_create_async_response:openapi_ads_analytics_create_async_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/create_report(Ctx, AdAccountId, OpenapiAdsAnalyticsCreateAsyncRequest) ->
    analytics/create_report(Ctx, AdAccountId, OpenapiAdsAnalyticsCreateAsyncRequest, #{}).

-spec analytics/create_report(ctx:ctx(), binary(), openapi_ads_analytics_create_async_request:openapi_ads_analytics_create_async_request(), maps:map()) -> {ok, openapi_ads_analytics_create_async_response:openapi_ads_analytics_create_async_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/create_report(Ctx, AdAccountId, OpenapiAdsAnalyticsCreateAsyncRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/reports"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdsAnalyticsCreateAsyncRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create async request for an analytics report using a template
%% This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.
-spec analytics/create_template_report(ctx:ctx(), binary(), binary()) -> {ok, openapi_ads_analytics_create_async_response:openapi_ads_analytics_create_async_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/create_template_report(Ctx, AdAccountId, TemplateId) ->
    analytics/create_template_report(Ctx, AdAccountId, TemplateId, #{}).

-spec analytics/create_template_report(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_ads_analytics_create_async_response:openapi_ads_analytics_create_async_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/create_template_report(Ctx, AdAccountId, TemplateId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/templates/", TemplateId, "/reports"],
    QS = lists:flatten([])++openapi_utils:optional_params(['start_date', 'end_date', 'granularity'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get advertiser Marketing Mix Modeling (MMM) report.
%% Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
-spec analytics/get_mmm_report(ctx:ctx(), binary(), binary()) -> {ok, openapi_get_mmm_report_response:openapi_get_mmm_report_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/get_mmm_report(Ctx, AdAccountId, Token) ->
    analytics/get_mmm_report(Ctx, AdAccountId, Token, #{}).

-spec analytics/get_mmm_report(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_get_mmm_report_response:openapi_get_mmm_report_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/get_mmm_report(Ctx, AdAccountId, Token, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/mmm_reports"],
    QS = lists:flatten([{<<"token">>, Token}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get the account analytics report created by the async call
%% This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
-spec analytics/get_report(ctx:ctx(), binary(), binary()) -> {ok, openapi_ads_analytics_get_async_response:openapi_ads_analytics_get_async_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/get_report(Ctx, AdAccountId, Token) ->
    analytics/get_report(Ctx, AdAccountId, Token, #{}).

-spec analytics/get_report(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_ads_analytics_get_async_response:openapi_ads_analytics_get_async_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
analytics/get_report(Ctx, AdAccountId, Token, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/reports"],
    QS = lists:flatten([{<<"token">>, Token}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete ads data for ad account in API Sandbox
%% Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
-spec sandbox/delete(ctx:ctx(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sandbox/delete(Ctx, AdAccountId) ->
    sandbox/delete(Ctx, AdAccountId, #{}).

-spec sandbox/delete(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sandbox/delete(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/sandbox"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List templates
%% Gets all Templates associated with an ad account ID.
-spec templates/list(ctx:ctx(), binary()) -> {ok, openapi_templates_list_200_response:openapi_templates_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
templates/list(Ctx, AdAccountId) ->
    templates/list(Ctx, AdAccountId, #{}).

-spec templates/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_templates_list_200_response:openapi_templates_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
templates/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/templates"],
    QS = lists:flatten([])++openapi_utils:optional_params(['page_size', 'order', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


