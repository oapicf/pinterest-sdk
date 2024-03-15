-module(openapi_ads_api).

-export([ad_previews/create/3, ad_previews/create/4,
         ad_targeting_analytics/get/8, ad_targeting_analytics/get/9,
         ads/analytics/7, ads/analytics/8,
         ads/create/3, ads/create/4,
         ads/get/3, ads/get/4,
         ads/list/2, ads/list/3,
         ads/update/3, ads/update/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create ad preview with pin or image
%% Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
-spec ad_previews/create(ctx:ctx(), binary(), openapi_ad_preview_request:openapi_ad_preview_request()) -> {ok, openapi_ad_preview_url_response:openapi_ad_preview_url_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_previews/create(Ctx, AdAccountId, OpenapiAdPreviewRequest) ->
    ad_previews/create(Ctx, AdAccountId, OpenapiAdPreviewRequest, #{}).

-spec ad_previews/create(ctx:ctx(), binary(), openapi_ad_preview_request:openapi_ad_preview_request(), maps:map()) -> {ok, openapi_ad_preview_url_response:openapi_ad_preview_url_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_previews/create(Ctx, AdAccountId, OpenapiAdPreviewRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_previews"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdPreviewRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get targeting analytics for ads
%% Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
-spec ad_targeting_analytics/get(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), list(), openapi_granularity) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_targeting_analytics/get(Ctx, AdAccountId, AdIds, StartDate, EndDate, TargetingTypes, Columns, Granularity) ->
    ad_targeting_analytics/get(Ctx, AdAccountId, AdIds, StartDate, EndDate, TargetingTypes, Columns, Granularity, #{}).

-spec ad_targeting_analytics/get(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, maps:map()) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_targeting_analytics/get(Ctx, AdAccountId, AdIds, StartDate, EndDate, TargetingTypes, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ads/targeting_analytics"],
    QS = lists:flatten([[{<<"ad_ids">>, X} || X <- AdIds], {<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"targeting_types">>, X} || X <- TargetingTypes], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time', 'attribution_types'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get ad analytics
%% Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
-spec ads/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity) -> {ok, [openapi_ads_analytics_response_inner:openapi_ads_analytics_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/analytics(Ctx, AdAccountId, StartDate, EndDate, AdIds, Columns, Granularity) ->
    ads/analytics(Ctx, AdAccountId, StartDate, EndDate, AdIds, Columns, Granularity, #{}).

-spec ads/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, maps:map()) -> {ok, [openapi_ads_analytics_response_inner:openapi_ads_analytics_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/analytics(Ctx, AdAccountId, StartDate, EndDate, AdIds, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ads/analytics"],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"ad_ids">>, X} || X <- AdIds], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create ads
%% Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
-spec ads/create(ctx:ctx(), binary(), list()) -> {ok, openapi_ad_array_response:openapi_ad_array_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/create(Ctx, AdAccountId, OpenapiAdCreateRequestArray) ->
    ads/create(Ctx, AdAccountId, OpenapiAdCreateRequestArray, #{}).

-spec ads/create(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_ad_array_response:openapi_ad_array_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/create(Ctx, AdAccountId, OpenapiAdCreateRequestArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ads"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdCreateRequestArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get ad
%% Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
-spec ads/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_ad_response:openapi_ad_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/get(Ctx, AdAccountId, AdId) ->
    ads/get(Ctx, AdAccountId, AdId, #{}).

-spec ads/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_ad_response:openapi_ad_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/get(Ctx, AdAccountId, AdId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ads/", AdId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List ads
%% List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.
-spec ads/list(ctx:ctx(), binary()) -> {ok, openapi_ads_list_200_response:openapi_ads_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/list(Ctx, AdAccountId) ->
    ads/list(Ctx, AdAccountId, #{}).

-spec ads/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_ads_list_200_response:openapi_ads_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ads"],
    QS = lists:flatten([])++openapi_utils:optional_params(['campaign_ids', 'ad_group_ids', 'ad_ids', 'entity_statuses', 'page_size', 'order', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update ads
%% Update multiple existing ads
-spec ads/update(ctx:ctx(), binary(), list()) -> {ok, openapi_ad_array_response:openapi_ad_array_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/update(Ctx, AdAccountId, OpenapiAdUpdateRequestArray) ->
    ads/update(Ctx, AdAccountId, OpenapiAdUpdateRequestArray, #{}).

-spec ads/update(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_ad_array_response:openapi_ad_array_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/update(Ctx, AdAccountId, OpenapiAdUpdateRequestArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ads"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdUpdateRequestArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


