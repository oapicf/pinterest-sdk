-module(openapi_ads_api).

-export([ad_previews/create/3, ad_previews/create/4,
         ad_targeting_analytics/get/8, ad_targeting_analytics/get/9,
         ads/analytics/6, ads/analytics/7,
         ads/create/3, ads/create/4,
         ads/get/3, ads/get/4,
         ads/list/2, ads/list/3,
         ads/update/3, ads/update/4,
         campaign_ad_preview/create/3, campaign_ad_preview/create/4,
         campaign_ad_preview/delete/3, campaign_ad_preview/delete/4,
         campaign_ad_preview/read/3, campaign_ad_preview/read/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create ad preview with pin or image
%% Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
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
%% Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
-spec ad_targeting_analytics/get(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), list(), openapi_granularity) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_targeting_analytics/get(Ctx, AdAccountId, AdIds, StartDate, EndDate, TargetingTypes, Columns, Granularity) ->
    ad_targeting_analytics/get(Ctx, AdAccountId, AdIds, StartDate, EndDate, TargetingTypes, Columns, Granularity, #{}).

-spec ad_targeting_analytics/get(ctx:ctx(), binary(), list(), calendar:date(), calendar:date(), list(), list(), openapi_granularity, maps:map()) -> {ok, openapi_metrics_response:openapi_metrics_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_targeting_analytics/get(Ctx, AdAccountId, AdIds, StartDate, EndDate, TargetingTypes, Columns, Granularity, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ads/targeting_analytics"],
    QS = lists:flatten([[{<<"ad_ids">>, X} || X <- AdIds], {<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"targeting_types">>, X} || X <- TargetingTypes], [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time', 'attribution_types', 'reporting_timezone', 'sort_columns', 'sort_ascending'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get ad analytics
%%     Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
-spec ads/analytics(ctx:ctx(), calendar:date(), calendar:date(), list(), openapi_granularity, binary()) -> {ok, [openapi_ads_analytics:openapi_ads_analytics()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/analytics(Ctx, StartDate, EndDate, Columns, Granularity, AdAccountId) ->
    ads/analytics(Ctx, StartDate, EndDate, Columns, Granularity, AdAccountId, #{}).

-spec ads/analytics(ctx:ctx(), calendar:date(), calendar:date(), list(), openapi_granularity, binary(), maps:map()) -> {ok, [openapi_ads_analytics:openapi_ads_analytics()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/analytics(Ctx, StartDate, EndDate, Columns, Granularity, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ads/analytics"],
    QS = lists:flatten([{<<"start_date">>, StartDate}, {<<"end_date">>, EndDate}, [{<<"columns">>, X} || X <- Columns], {<<"granularity">>, Granularity}])++openapi_utils:optional_params(['pin_ids', 'ad_ids', 'click_window_days', 'engagement_window_days', 'view_window_days', 'conversion_report_time', 'campaign_ids', 'reporting_timezone'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create ads
%% Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
-spec ads/create(ctx:ctx(), binary(), list()) -> {ok, openapi_ad_batch_write_response_model:openapi_ad_batch_write_response_model(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/create(Ctx, AdAccountId, OpenapiAdCreateArray) ->
    ads/create(Ctx, AdAccountId, OpenapiAdCreateArray, #{}).

-spec ads/create(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_ad_batch_write_response_model:openapi_ad_batch_write_response_model(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/create(Ctx, AdAccountId, OpenapiAdCreateArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ads"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdCreateArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get ad
%% Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
-spec ads/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_ad:openapi_ad(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/get(Ctx, AdId, AdAccountId) ->
    ads/get(Ctx, AdId, AdAccountId, #{}).

-spec ads/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_ad:openapi_ad(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/get(Ctx, AdId, AdAccountId, Optional) ->
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
%% List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
-spec ads/list(ctx:ctx(), binary()) -> {ok, openapi_ads_list_200_response:openapi_ads_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/list(Ctx, AdAccountId) ->
    ads/list(Ctx, AdAccountId, #{}).

-spec ads/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_ads_list_200_response:openapi_ads_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ads"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'order', 'campaign_ids', 'ad_group_ids', 'ad_ids', 'entity_statuses'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update ads
%% Update multiple existing ads
-spec ads/update(ctx:ctx(), binary(), list()) -> {ok, openapi_ad_batch_write_response_model:openapi_ad_batch_write_response_model(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/update(Ctx, AdAccountId, OpenapiAdBatchUpdateArray) ->
    ads/update(Ctx, AdAccountId, OpenapiAdBatchUpdateArray, #{}).

-spec ads/update(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_ad_batch_write_response_model:openapi_ad_batch_write_response_model(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads/update(Ctx, AdAccountId, OpenapiAdBatchUpdateArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ads"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdBatchUpdateArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create ad preview records for one or more ad groups
%% Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
-spec campaign_ad_preview/create(ctx:ctx(), binary(), list()) -> {ok, [openapi_campaign_ad_preview_create_200_response_inner:openapi_campaign_ad_preview_create_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaign_ad_preview/create(Ctx, AdAccountId, OpenapiCampaignAdPreviewCreateArray) ->
    campaign_ad_preview/create(Ctx, AdAccountId, OpenapiCampaignAdPreviewCreateArray, #{}).

-spec campaign_ad_preview/create(ctx:ctx(), binary(), list(), maps:map()) -> {ok, [openapi_campaign_ad_preview_create_200_response_inner:openapi_campaign_ad_preview_create_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaign_ad_preview/create(Ctx, AdAccountId, OpenapiCampaignAdPreviewCreateArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaign_ad_preview"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCampaignAdPreviewCreateArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete ad preview records for one or more ad groups
%% Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
-spec campaign_ad_preview/delete(ctx:ctx(), list(), binary()) -> {ok, [openapi_campaign_ad_preview_delete_200_response_inner:openapi_campaign_ad_preview_delete_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaign_ad_preview/delete(Ctx, AdGroupIds, AdAccountId) ->
    campaign_ad_preview/delete(Ctx, AdGroupIds, AdAccountId, #{}).

-spec campaign_ad_preview/delete(ctx:ctx(), list(), binary(), maps:map()) -> {ok, [openapi_campaign_ad_preview_delete_200_response_inner:openapi_campaign_ad_preview_delete_200_response_inner()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaign_ad_preview/delete(Ctx, AdGroupIds, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaign_ad_preview"],
    QS = lists:flatten([[{<<"ad_group_ids">>, X} || X <- AdGroupIds]])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Fetch ad preview records for one or more ad groups
%% Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
-spec campaign_ad_preview/read(ctx:ctx(), list(), binary()) -> {ok, [openapi_campaign_ad_preview:openapi_campaign_ad_preview()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaign_ad_preview/read(Ctx, AdGroupIds, AdAccountId) ->
    campaign_ad_preview/read(Ctx, AdGroupIds, AdAccountId, #{}).

-spec campaign_ad_preview/read(ctx:ctx(), list(), binary(), maps:map()) -> {ok, [openapi_campaign_ad_preview:openapi_campaign_ad_preview()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
campaign_ad_preview/read(Ctx, AdGroupIds, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/campaign_ad_preview"],
    QS = lists:flatten([[{<<"ad_group_ids">>, X} || X <- AdGroupIds]])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


