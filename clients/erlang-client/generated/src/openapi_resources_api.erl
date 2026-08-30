-module(openapi_resources_api).

-export([ad_account_countries/get/1, ad_account_countries/get/2,
         delivery_metrics/get/1, delivery_metrics/get/2,
         interest_targeting_options/get/2, interest_targeting_options/get/3,
         lead_form_questions/get/1, lead_form_questions/get/2,
         metrics_ready_state/get/2, metrics_ready_state/get/3,
         targeting_options/get/2, targeting_options/get/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get ad accounts countries
%% Get Ad Accounts countries
-spec ad_account_countries/get(ctx:ctx()) -> {ok, openapi_ad_account_countries_get_200_response:openapi_ad_account_countries_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_account_countries/get(Ctx) ->
    ad_account_countries/get(Ctx, #{}).

-spec ad_account_countries/get(ctx:ctx(), maps:map()) -> {ok, openapi_ad_account_countries_get_200_response:openapi_ad_account_countries_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_account_countries/get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/resources/ad_account_countries"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get available metrics' definitions
%% Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
-spec delivery_metrics/get(ctx:ctx()) -> {ok, openapi_delivery_metrics_get_200_response:openapi_delivery_metrics_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delivery_metrics/get(Ctx) ->
    delivery_metrics/get(Ctx, #{}).

-spec delivery_metrics/get(ctx:ctx(), maps:map()) -> {ok, openapi_delivery_metrics_get_200_response:openapi_delivery_metrics_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delivery_metrics/get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/resources/delivery_metrics"],
    QS = lists:flatten([])++openapi_utils:optional_params(['report_type'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get interest details
%% Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.
-spec interest_targeting_options/get(ctx:ctx(), binary()) -> {ok, openapi_single_interest_targeting_option:openapi_single_interest_targeting_option(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
interest_targeting_options/get(Ctx, InterestId) ->
    interest_targeting_options/get(Ctx, InterestId, #{}).

-spec interest_targeting_options/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_single_interest_targeting_option:openapi_single_interest_targeting_option(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
interest_targeting_options/get(Ctx, InterestId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/resources/targeting/interests/", InterestId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get lead form questions
%% Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
-spec lead_form_questions/get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
lead_form_questions/get(Ctx) ->
    lead_form_questions/get(Ctx, #{}).

-spec lead_form_questions/get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
lead_form_questions/get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/resources/lead_form_questions"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get metrics ready state
%% Learn whether conversion or non-conversion metrics are finalized and ready to query.
-spec metrics_ready_state/get(ctx:ctx(), binary()) -> {ok, openapi_book_closed:openapi_book_closed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metrics_ready_state/get(Ctx, Date) ->
    metrics_ready_state/get(Ctx, Date, #{}).

-spec metrics_ready_state/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_book_closed:openapi_book_closed(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metrics_ready_state/get(Ctx, Date, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/resources/metrics_ready_state"],
    QS = lists:flatten([{<<"date">>, Date}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get targeting options
%%     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```
-spec targeting_options/get(ctx:ctx(), openapi_public_targeting_type) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
targeting_options/get(Ctx, TargetingType) ->
    targeting_options/get(Ctx, TargetingType, #{}).

-spec targeting_options/get(ctx:ctx(), openapi_public_targeting_type, maps:map()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
targeting_options/get(Ctx, TargetingType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/resources/targeting/", TargetingType, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['ad_account_id', 'client_id', 'oauth_signature', 'timestamp'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


