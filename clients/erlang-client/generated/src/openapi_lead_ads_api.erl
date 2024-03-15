-module(openapi_lead_ads_api).

-export([ad_accounts_subscriptions/del_by_id/3, ad_accounts_subscriptions/del_by_id/4,
         ad_accounts_subscriptions/get_by_id/3, ad_accounts_subscriptions/get_by_id/4,
         ad_accounts_subscriptions/get_list/2, ad_accounts_subscriptions/get_list/3,
         ad_accounts_subscriptions/post/3, ad_accounts_subscriptions/post/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Delete lead ads subscription
%% Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
-spec ad_accounts_subscriptions/del_by_id(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts_subscriptions/del_by_id(Ctx, AdAccountId, SubscriptionId) ->
    ad_accounts_subscriptions/del_by_id(Ctx, AdAccountId, SubscriptionId, #{}).

-spec ad_accounts_subscriptions/del_by_id(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts_subscriptions/del_by_id(Ctx, AdAccountId, SubscriptionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/leads/subscriptions/", SubscriptionId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get lead ads subscription
%% Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
-spec ad_accounts_subscriptions/get_by_id(ctx:ctx(), binary(), binary()) -> {ok, openapi_ad_account_get_subscription_response:openapi_ad_account_get_subscription_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts_subscriptions/get_by_id(Ctx, AdAccountId, SubscriptionId) ->
    ad_accounts_subscriptions/get_by_id(Ctx, AdAccountId, SubscriptionId, #{}).

-spec ad_accounts_subscriptions/get_by_id(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_ad_account_get_subscription_response:openapi_ad_account_get_subscription_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts_subscriptions/get_by_id(Ctx, AdAccountId, SubscriptionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/leads/subscriptions/", SubscriptionId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get lead ads subscriptions
%% Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
-spec ad_accounts_subscriptions/get_list(ctx:ctx(), binary()) -> {ok, openapi_ad_accounts_subscriptions_get_list_200_response:openapi_ad_accounts_subscriptions_get_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts_subscriptions/get_list(Ctx, AdAccountId) ->
    ad_accounts_subscriptions/get_list(Ctx, AdAccountId, #{}).

-spec ad_accounts_subscriptions/get_list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_ad_accounts_subscriptions_get_list_200_response:openapi_ad_accounts_subscriptions_get_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts_subscriptions/get_list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/leads/subscriptions"],
    QS = lists:flatten([])++openapi_utils:optional_params(['page_size', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create lead ads subscription
%% Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
-spec ad_accounts_subscriptions/post(ctx:ctx(), binary(), openapi_ad_account_create_subscription_request:openapi_ad_account_create_subscription_request()) -> {ok, openapi_ad_account_create_subscription_response:openapi_ad_account_create_subscription_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts_subscriptions/post(Ctx, AdAccountId, OpenapiAdAccountCreateSubscriptionRequest) ->
    ad_accounts_subscriptions/post(Ctx, AdAccountId, OpenapiAdAccountCreateSubscriptionRequest, #{}).

-spec ad_accounts_subscriptions/post(ctx:ctx(), binary(), openapi_ad_account_create_subscription_request:openapi_ad_account_create_subscription_request(), maps:map()) -> {ok, openapi_ad_account_create_subscription_response:openapi_ad_account_create_subscription_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts_subscriptions/post(Ctx, AdAccountId, OpenapiAdAccountCreateSubscriptionRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/leads/subscriptions"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdAccountCreateSubscriptionRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


