-module(openapi_ad_groups_api).

-export([ad_groups/analytics/7, ad_groups/analytics/8,
         ad_groups/audience_sizing/3, ad_groups/audience_sizing/4,
         ad_groups/create/3, ad_groups/create/4,
         ad_groups/get/3, ad_groups/get/4,
         ad_groups/list/2, ad_groups/list/3,
         ad_groups/update/3, ad_groups/update/4,
         ad_groups_bid_floor/get/3, ad_groups_bid_floor/get/4,
         ad_groups_targeting_analytics/get/8, ad_groups_targeting_analytics/get/9]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get ad group analytics
%% Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
-spec ad_groups/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity) -> {ok, [openapi_ad_groups_analytics_response_inner:openapi_ad_groups_analytics_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/analytics(Ctx, AdAccountId, StartDate, EndDate, AdGroupIds, Columns, Granularity) ->
    ad_groups/analytics(Ctx, AdAccountId, StartDate, EndDate, AdGroupIds, Columns, Granularity, #{}).

-spec ad_groups/analytics(ctx:ctx(), binary(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, maps:map()) -> {ok, [openapi_ad_groups_analytics_response_inner:openapi_ad_groups_analytics_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/analytics(Ctx, AdAccountId, StartDate, EndDate, AdGroupIds, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups/analytics"],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"ad_group_ids">>, X} || X <- AdGroupIds], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get audience sizing
%% Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
-spec ad_groups/audience_sizing(ctx:ctx(), binary()) -> {ok, openapi_ad_group_audience_sizing_response:openapi_ad_group_audience_sizing_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/audience_sizing(Ctx, AdAccountId) ->
    ad_groups/audience_sizing(Ctx, AdAccountId, #{}).

-spec ad_groups/audience_sizing(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_ad_group_audience_sizing_response:openapi_ad_group_audience_sizing_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/audience_sizing(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups/audience_sizing"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdGroupAudienceSizingRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create ad groups
%% Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.
-spec ad_groups/create(ctx:ctx(), binary(), list()) -> {ok, openapi_ad_group_array_response:openapi_ad_group_array_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/create(Ctx, AdAccountId, OpenapiAdGroupCreateRequestArray) ->
    ad_groups/create(Ctx, AdAccountId, OpenapiAdGroupCreateRequestArray, #{}).

-spec ad_groups/create(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_ad_group_array_response:openapi_ad_group_array_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/create(Ctx, AdAccountId, OpenapiAdGroupCreateRequestArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdGroupCreateRequestArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get ad group
%% Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
-spec ad_groups/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_ad_group_response:openapi_ad_group_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/get(Ctx, AdAccountId, AdGroupId) ->
    ad_groups/get(Ctx, AdAccountId, AdGroupId, #{}).

-spec ad_groups/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_ad_group_response:openapi_ad_group_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/get(Ctx, AdAccountId, AdGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups/", AdGroupId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List ad groups
%% List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.
-spec ad_groups/list(ctx:ctx(), binary()) -> {ok, openapi_ad_groups_list_200_response:openapi_ad_groups_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/list(Ctx, AdAccountId) ->
    ad_groups/list(Ctx, AdAccountId, #{}).

-spec ad_groups/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_ad_groups_list_200_response:openapi_ad_groups_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups"],
    QS = lists:flatten([])++openapi_utils:optional_params(['campaign_ids', 'ad_group_ids', 'entity_statuses', 'page_size', 'order', 'bookmark', 'translate_interests_to_names'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update ad groups
%% Update multiple existing ad groups.
-spec ad_groups/update(ctx:ctx(), binary(), list()) -> {ok, openapi_ad_group_array_response:openapi_ad_group_array_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/update(Ctx, AdAccountId, OpenapiAdGroupUpdateRequestArray) ->
    ad_groups/update(Ctx, AdAccountId, OpenapiAdGroupUpdateRequestArray, #{}).

-spec ad_groups/update(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_ad_group_array_response:openapi_ad_group_array_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/update(Ctx, AdAccountId, OpenapiAdGroupUpdateRequestArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdGroupUpdateRequestArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get bid floors
%% List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
-spec ad_groups_bid_floor/get(ctx:ctx(), binary(), openapi_bid_floor_request:openapi_bid_floor_request()) -> {ok, openapi_bid_floor:openapi_bid_floor(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_bid_floor/get(Ctx, AdAccountId, OpenapiBidFloorRequest) ->
    ad_groups_bid_floor/get(Ctx, AdAccountId, OpenapiBidFloorRequest, #{}).

-spec ad_groups_bid_floor/get(ctx:ctx(), binary(), openapi_bid_floor_request:openapi_bid_floor_request(), maps:map()) -> {ok, openapi_bid_floor:openapi_bid_floor(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_bid_floor/get(Ctx, AdAccountId, OpenapiBidFloorRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/bid_floor"],
    QS = [],
    Headers = [],
    Body1 = OpenapiBidFloorRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get targeting analytics for ad groups
%% Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
-spec ad_groups_targeting_analytics/get(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), list(), openapi_granularity) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_targeting_analytics/get(Ctx, AdAccountId, AdGroupIds, StartDate, EndDate, TargetingTypes, Columns, Granularity) ->
    ad_groups_targeting_analytics/get(Ctx, AdAccountId, AdGroupIds, StartDate, EndDate, TargetingTypes, Columns, Granularity, #{}).

-spec ad_groups_targeting_analytics/get(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, maps:map()) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_targeting_analytics/get(Ctx, AdAccountId, AdGroupIds, StartDate, EndDate, TargetingTypes, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups/targeting_analytics"],
    QS = lists:flatten([[{<<"ad_group_ids">>, X} || X <- AdGroupIds], {<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"targeting_types">>, X} || X <- TargetingTypes], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time', 'attribution_types'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


