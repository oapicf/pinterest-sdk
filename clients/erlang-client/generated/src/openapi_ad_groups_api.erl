-module(openapi_ad_groups_api).

-export([ad_groups/analytics/7, ad_groups/analytics/8,
         ad_groups/audience_sizing/3, ad_groups/audience_sizing/4,
         ad_groups/create/3, ad_groups/create/4,
         ad_groups/get/3, ad_groups/get/4,
         ad_groups/list/2, ad_groups/list/3,
         ad_groups/update/3, ad_groups/update/4,
         ad_groups_bid_floor/get/3, ad_groups_bid_floor/get/4,
         ad_groups_dynamic_titles/download_csv/3, ad_groups_dynamic_titles/download_csv/4,
         ad_groups_dynamic_titles/get_status/3, ad_groups_dynamic_titles/get_status/4,
         ad_groups_dynamic_titles/get_upload_url/3, ad_groups_dynamic_titles/get_upload_url/4,
         ad_groups_dynamic_titles/process_csv/4, ad_groups_dynamic_titles/process_csv/5,
         ad_groups_targeting_analytics/get/8, ad_groups_targeting_analytics/get/9,
         get_ad_groups_by_promotion_ids/list/3, get_ad_groups_by_promotion_ids/list/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get ad group analytics
%% Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
-spec ad_groups/analytics(ctx:ctx(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, binary()) -> {ok, [openapi_ad_groups_analytics_metrics:openapi_ad_groups_analytics_metrics()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/analytics(Ctx, StartDate, EndDate, AdGroupIds, Columns, Granularity, AdAccountId) ->
    ad_groups/analytics(Ctx, StartDate, EndDate, AdGroupIds, Columns, Granularity, AdAccountId, #{}).

-spec ad_groups/analytics(ctx:ctx(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, binary(), maps:map()) -> {ok, [openapi_ad_groups_analytics_metrics:openapi_ad_groups_analytics_metrics()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/analytics(Ctx, StartDate, EndDate, AdGroupIds, Columns, Granularity, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups/analytics"],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"ad_group_ids">>, X} || X <- AdGroupIds], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time', 'aggregate_report_rows', 'reporting_timezone'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get audience sizing
%% Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
-spec ad_groups/audience_sizing(ctx:ctx(), binary(), openapi_ad_group_audience_sizing_create:openapi_ad_group_audience_sizing_create()) -> {ok, openapi_ad_group_audience_sizing:openapi_ad_group_audience_sizing(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/audience_sizing(Ctx, AdAccountId, OpenapiAdGroupAudienceSizingCreate) ->
    ad_groups/audience_sizing(Ctx, AdAccountId, OpenapiAdGroupAudienceSizingCreate, #{}).

-spec ad_groups/audience_sizing(ctx:ctx(), binary(), openapi_ad_group_audience_sizing_create:openapi_ad_group_audience_sizing_create(), maps:map()) -> {ok, openapi_ad_group_audience_sizing:openapi_ad_group_audience_sizing(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/audience_sizing(Ctx, AdAccountId, OpenapiAdGroupAudienceSizingCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups/audience_sizing"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdGroupAudienceSizingCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create ad groups
%% Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
-spec ad_groups/create(ctx:ctx(), binary(), list()) -> {ok, openapi_ad_groups_create_200_response:openapi_ad_groups_create_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/create(Ctx, AdAccountId, OpenapiAdGroupCreateCreateArray) ->
    ad_groups/create(Ctx, AdAccountId, OpenapiAdGroupCreateCreateArray, #{}).

-spec ad_groups/create(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_ad_groups_create_200_response:openapi_ad_groups_create_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/create(Ctx, AdAccountId, OpenapiAdGroupCreateCreateArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdGroupCreateCreateArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get ad group
%% Get a specific ad group given the ad group ID.
-spec ad_groups/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_ad_group:openapi_ad_group(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/get(Ctx, AdGroupId, AdAccountId) ->
    ad_groups/get(Ctx, AdGroupId, AdAccountId, #{}).

-spec ad_groups/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_ad_group:openapi_ad_group(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/get(Ctx, AdGroupId, AdAccountId, Optional) ->
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
%% List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
-spec ad_groups/list(ctx:ctx(), binary()) -> {ok, openapi_ad_groups_list_200_response:openapi_ad_groups_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/list(Ctx, AdAccountId) ->
    ad_groups/list(Ctx, AdAccountId, #{}).

-spec ad_groups/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_ad_groups_list_200_response:openapi_ad_groups_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'order', 'campaign_ids', 'ad_group_ids', 'entity_statuses', 'translate_interests_to_names'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update ad groups
%% Update multiple existing ad groups.
-spec ad_groups/update(ctx:ctx(), binary(), list()) -> {ok, openapi_ad_groups_create_200_response:openapi_ad_groups_create_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/update(Ctx, AdAccountId, OpenapiAdGroupUpdateBatchUpdateArray) ->
    ad_groups/update(Ctx, AdAccountId, OpenapiAdGroupUpdateBatchUpdateArray, #{}).

-spec ad_groups/update(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_ad_groups_create_200_response:openapi_ad_groups_create_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups/update(Ctx, AdAccountId, OpenapiAdGroupUpdateBatchUpdateArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdGroupUpdateBatchUpdateArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get bid floors
%% List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
-spec ad_groups_bid_floor/get(ctx:ctx(), binary(), openapi_bid_floor_create:openapi_bid_floor_create()) -> {ok, openapi_bid_floor:openapi_bid_floor(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_bid_floor/get(Ctx, AdAccountId, OpenapiBidFloorCreate) ->
    ad_groups_bid_floor/get(Ctx, AdAccountId, OpenapiBidFloorCreate, #{}).

-spec ad_groups_bid_floor/get(ctx:ctx(), binary(), openapi_bid_floor_create:openapi_bid_floor_create(), maps:map()) -> {ok, openapi_bid_floor:openapi_bid_floor(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_bid_floor/get(Ctx, AdAccountId, OpenapiBidFloorCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/bid_floor"],
    QS = [],
    Headers = [],
    Body1 = OpenapiBidFloorCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get dynamic titles CSV download URL
%% Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
-spec ad_groups_dynamic_titles/download_csv(ctx:ctx(), binary(), binary()) -> {ok, openapi_dynamic_titles_download_csv:openapi_dynamic_titles_download_csv(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_dynamic_titles/download_csv(Ctx, AdAccountId, AdGroupId) ->
    ad_groups_dynamic_titles/download_csv(Ctx, AdAccountId, AdGroupId, #{}).

-spec ad_groups_dynamic_titles/download_csv(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_dynamic_titles_download_csv:openapi_dynamic_titles_download_csv(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_dynamic_titles/download_csv(Ctx, AdAccountId, AdGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups/", AdGroupId, "/dynamic_titles/csv"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get dynamic titles status
%% Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
-spec ad_groups_dynamic_titles/get_status(ctx:ctx(), binary(), binary()) -> {ok, openapi_dynamic_titles_get_status:openapi_dynamic_titles_get_status(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_dynamic_titles/get_status(Ctx, AdAccountId, AdGroupId) ->
    ad_groups_dynamic_titles/get_status(Ctx, AdAccountId, AdGroupId, #{}).

-spec ad_groups_dynamic_titles/get_status(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_dynamic_titles_get_status:openapi_dynamic_titles_get_status(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_dynamic_titles/get_status(Ctx, AdAccountId, AdGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups/", AdGroupId, "/dynamic_titles/status"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get dynamic titles upload URL
%% Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
-spec ad_groups_dynamic_titles/get_upload_url(ctx:ctx(), binary(), binary()) -> {ok, openapi_dynamic_titles_upload_url:openapi_dynamic_titles_upload_url(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_dynamic_titles/get_upload_url(Ctx, AdAccountId, AdGroupId) ->
    ad_groups_dynamic_titles/get_upload_url(Ctx, AdAccountId, AdGroupId, #{}).

-spec ad_groups_dynamic_titles/get_upload_url(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_dynamic_titles_upload_url:openapi_dynamic_titles_upload_url(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_dynamic_titles/get_upload_url(Ctx, AdAccountId, AdGroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups/", AdGroupId, "/dynamic_titles/uploads"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Process dynamic titles CSV
%% Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
-spec ad_groups_dynamic_titles/process_csv(ctx:ctx(), binary(), binary(), openapi_dynamic_titles_process_csv_create:openapi_dynamic_titles_process_csv_create()) -> {ok, openapi_dynamic_titles_process_csv:openapi_dynamic_titles_process_csv(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_dynamic_titles/process_csv(Ctx, AdAccountId, AdGroupId, OpenapiDynamicTitlesProcessCsvCreate) ->
    ad_groups_dynamic_titles/process_csv(Ctx, AdAccountId, AdGroupId, OpenapiDynamicTitlesProcessCsvCreate, #{}).

-spec ad_groups_dynamic_titles/process_csv(ctx:ctx(), binary(), binary(), openapi_dynamic_titles_process_csv_create:openapi_dynamic_titles_process_csv_create(), maps:map()) -> {ok, openapi_dynamic_titles_process_csv:openapi_dynamic_titles_process_csv(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_dynamic_titles/process_csv(Ctx, AdAccountId, AdGroupId, OpenapiDynamicTitlesProcessCsvCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups/", AdGroupId, "/dynamic_titles"],
    QS = [],
    Headers = [],
    Body1 = OpenapiDynamicTitlesProcessCsvCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get targeting analytics for ad groups
%% Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
-spec ad_groups_targeting_analytics/get(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), list(), openapi_granularity) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_targeting_analytics/get(Ctx, AdAccountId, AdGroupIds, StartDate, EndDate, TargetingTypes, Columns, Granularity) ->
    ad_groups_targeting_analytics/get(Ctx, AdAccountId, AdGroupIds, StartDate, EndDate, TargetingTypes, Columns, Granularity, #{}).

-spec ad_groups_targeting_analytics/get(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, maps:map()) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_groups_targeting_analytics/get(Ctx, AdAccountId, AdGroupIds, StartDate, EndDate, TargetingTypes, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ad_groups/targeting_analytics"],
    QS = lists:flatten([[{<<"ad_group_ids">>, X} || X <- AdGroupIds], {<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"targeting_types">>, X} || X <- TargetingTypes], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time', 'attribution_types', 'reporting_timezone', 'sort_columns', 'sort_ascending'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List of ad groups using promotions IDs.
%%   Get a list of ad groups that are associated with those promotion ids
-spec get_ad_groups_by_promotion_ids/list(ctx:ctx(), binary(), list()) -> {ok, openapi_ad_groups_list_200_response:openapi_ad_groups_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_ad_groups_by_promotion_ids/list(Ctx, AdAccountId, PromotionIds) ->
    get_ad_groups_by_promotion_ids/list(Ctx, AdAccountId, PromotionIds, #{}).

-spec get_ad_groups_by_promotion_ids/list(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_ad_groups_list_200_response:openapi_ad_groups_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_ad_groups_by_promotion_ids/list(Ctx, AdAccountId, PromotionIds, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/promotion_applied_entities"],
    QS = lists:flatten([[{<<"promotion_ids">>, X} || X <- PromotionIds]])++openapi_utils:optional_params(['bookmark', 'page_size', 'order'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


