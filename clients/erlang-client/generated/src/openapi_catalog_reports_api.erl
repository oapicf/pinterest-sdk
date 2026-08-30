-module(openapi_catalog_reports_api).

-export([reports/create/2, reports/create/3,
         reports/get/2, reports/get/3,
         reports/stats/2, reports/stats/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Build catalogs report
%% Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.
-spec reports/create(ctx:ctx(), openapi_catalogs_report_parameters:openapi_catalogs_report_parameters()) -> {ok, openapi_catalogs_create_report_response:openapi_catalogs_create_report_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reports/create(Ctx, OpenapiCatalogsReportParameters) ->
    reports/create(Ctx, OpenapiCatalogsReportParameters, #{}).

-spec reports/create(ctx:ctx(), openapi_catalogs_report_parameters:openapi_catalogs_report_parameters(), maps:map()) -> {ok, openapi_catalogs_create_report_response:openapi_catalogs_create_report_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reports/create(Ctx, OpenapiCatalogsReportParameters, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/catalogs/reports"],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiCatalogsReportParameters,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get catalogs report
%% This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
-spec reports/get(ctx:ctx(), binary()) -> {ok, openapi_catalogs_report:openapi_catalogs_report(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reports/get(Ctx, Token) ->
    reports/get(Ctx, Token, #{}).

-spec reports/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_catalogs_report:openapi_catalogs_report(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reports/get(Ctx, Token, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/reports"],
    QS = lists:flatten([{<<"token">>, Token}])++openapi_utils:optional_params(['ad_account_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List report stats
%% List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
-spec reports/stats(ctx:ctx(), openapi_catalogs_report_stats_parameters) -> {ok, openapi_reports_stats_200_response:openapi_reports_stats_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reports/stats(Ctx, Parameters) ->
    reports/stats(Ctx, Parameters, #{}).

-spec reports/stats(ctx:ctx(), openapi_catalogs_report_stats_parameters, maps:map()) -> {ok, openapi_reports_stats_200_response:openapi_reports_stats_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reports/stats(Ctx, Parameters, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/catalogs/reports/stats"],
    QS = lists:flatten([{<<"parameters">>, Parameters}])++openapi_utils:optional_params(['ad_account_id', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


