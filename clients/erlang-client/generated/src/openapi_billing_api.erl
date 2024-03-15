-module(openapi_billing_api).

-export([ads_credit/redeem/3, ads_credit/redeem/4,
         ads_credits_discounts/get/2, ads_credits_discounts/get/3,
         billing_profiles/get/3, billing_profiles/get/4,
         ssio_accounts/get/2, ssio_accounts/get/3,
         ssio_insertion_order/create/3, ssio_insertion_order/create/4,
         ssio_insertion_order/edit/3, ssio_insertion_order/edit/4,
         ssio_insertion_orders_status/get_by_ad_account/2, ssio_insertion_orders_status/get_by_ad_account/3,
         ssio_insertion_orders_status/get_by_pin_order_id/3, ssio_insertion_orders_status/get_by_pin_order_id/4,
         ssio_order_lines/get_by_ad_account/2, ssio_order_lines/get_by_ad_account/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Redeem ad credits
%% Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
-spec ads_credit/redeem(ctx:ctx(), binary(), openapi_ads_credit_redeem_request:openapi_ads_credit_redeem_request()) -> {ok, openapi_ads_credit_redeem_response:openapi_ads_credit_redeem_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads_credit/redeem(Ctx, AdAccountId, OpenapiAdsCreditRedeemRequest) ->
    ads_credit/redeem(Ctx, AdAccountId, OpenapiAdsCreditRedeemRequest, #{}).

-spec ads_credit/redeem(ctx:ctx(), binary(), openapi_ads_credit_redeem_request:openapi_ads_credit_redeem_request(), maps:map()) -> {ok, openapi_ads_credit_redeem_response:openapi_ads_credit_redeem_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads_credit/redeem(Ctx, AdAccountId, OpenapiAdsCreditRedeemRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ads_credit/redeem"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAdsCreditRedeemRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get ads credit discounts
%% Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
-spec ads_credits_discounts/get(ctx:ctx(), binary()) -> {ok, openapi_ads_credits_discounts_get_200_response:openapi_ads_credits_discounts_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads_credits_discounts/get(Ctx, AdAccountId) ->
    ads_credits_discounts/get(Ctx, AdAccountId, #{}).

-spec ads_credits_discounts/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_ads_credits_discounts_get_200_response:openapi_ads_credits_discounts_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ads_credits_discounts/get(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ads_credit/discounts"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get billing profiles
%% Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
-spec billing_profiles/get(ctx:ctx(), binary(), boolean()) -> {ok, openapi_billing_profiles_get_200_response:openapi_billing_profiles_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
billing_profiles/get(Ctx, AdAccountId, IsActive) ->
    billing_profiles/get(Ctx, AdAccountId, IsActive, #{}).

-spec billing_profiles/get(ctx:ctx(), binary(), boolean(), maps:map()) -> {ok, openapi_billing_profiles_get_200_response:openapi_billing_profiles_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
billing_profiles/get(Ctx, AdAccountId, IsActive, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/billing_profiles"],
    QS = lists:flatten([{<<"is_active">>, IsActive}])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Salesforce account details including bill-to information.
%% Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
-spec ssio_accounts/get(ctx:ctx(), binary()) -> {ok, openapi_s_sio_account_response:openapi_s_sio_account_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssio_accounts/get(Ctx, AdAccountId) ->
    ssio_accounts/get(Ctx, AdAccountId, #{}).

-spec ssio_accounts/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_s_sio_account_response:openapi_s_sio_account_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssio_accounts/get(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ssio/accounts"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create insertion order through SSIO.
%% Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
-spec ssio_insertion_order/create(ctx:ctx(), binary(), openapi_ssio_create_insertion_order_request:openapi_ssio_create_insertion_order_request()) -> {ok, openapi_s_sio_create_insertion_order_response:openapi_s_sio_create_insertion_order_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssio_insertion_order/create(Ctx, AdAccountId, OpenapiSsioCreateInsertionOrderRequest) ->
    ssio_insertion_order/create(Ctx, AdAccountId, OpenapiSsioCreateInsertionOrderRequest, #{}).

-spec ssio_insertion_order/create(ctx:ctx(), binary(), openapi_ssio_create_insertion_order_request:openapi_ssio_create_insertion_order_request(), maps:map()) -> {ok, openapi_s_sio_create_insertion_order_response:openapi_s_sio_create_insertion_order_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssio_insertion_order/create(Ctx, AdAccountId, OpenapiSsioCreateInsertionOrderRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ssio/insertion_orders"],
    QS = [],
    Headers = [],
    Body1 = OpenapiSsioCreateInsertionOrderRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Edit insertion order through SSIO.
%% Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
-spec ssio_insertion_order/edit(ctx:ctx(), binary(), openapi_ssio_edit_insertion_order_request:openapi_ssio_edit_insertion_order_request()) -> {ok, openapi_s_sio_edit_insertion_order_response:openapi_s_sio_edit_insertion_order_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssio_insertion_order/edit(Ctx, AdAccountId, OpenapiSsioEditInsertionOrderRequest) ->
    ssio_insertion_order/edit(Ctx, AdAccountId, OpenapiSsioEditInsertionOrderRequest, #{}).

-spec ssio_insertion_order/edit(ctx:ctx(), binary(), openapi_ssio_edit_insertion_order_request:openapi_ssio_edit_insertion_order_request(), maps:map()) -> {ok, openapi_s_sio_edit_insertion_order_response:openapi_s_sio_edit_insertion_order_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssio_insertion_order/edit(Ctx, AdAccountId, OpenapiSsioEditInsertionOrderRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ssio/insertion_orders"],
    QS = [],
    Headers = [],
    Body1 = OpenapiSsioEditInsertionOrderRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get insertion order status by ad account id.
%% Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
-spec ssio_insertion_orders_status/get_by_ad_account(ctx:ctx(), binary()) -> {ok, openapi_ssio_insertion_orders_status_get_by_ad_account_200_response:openapi_ssio_insertion_orders_status_get_by_ad_account_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssio_insertion_orders_status/get_by_ad_account(Ctx, AdAccountId) ->
    ssio_insertion_orders_status/get_by_ad_account(Ctx, AdAccountId, #{}).

-spec ssio_insertion_orders_status/get_by_ad_account(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_ssio_insertion_orders_status_get_by_ad_account_200_response:openapi_ssio_insertion_orders_status_get_by_ad_account_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssio_insertion_orders_status/get_by_ad_account(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ssio/insertion_orders/status"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get insertion order status by pin order id.
%% Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
-spec ssio_insertion_orders_status/get_by_pin_order_id(ctx:ctx(), binary(), binary()) -> {ok, openapi_s_sio_insertion_order_status_response:openapi_s_sio_insertion_order_status_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssio_insertion_orders_status/get_by_pin_order_id(Ctx, AdAccountId, PinOrderId) ->
    ssio_insertion_orders_status/get_by_pin_order_id(Ctx, AdAccountId, PinOrderId, #{}).

-spec ssio_insertion_orders_status/get_by_pin_order_id(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_s_sio_insertion_order_status_response:openapi_s_sio_insertion_order_status_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssio_insertion_orders_status/get_by_pin_order_id(Ctx, AdAccountId, PinOrderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ssio/insertion_orders/", PinOrderId, "/status"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Salesforce order lines by ad account id.
%% Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
-spec ssio_order_lines/get_by_ad_account(ctx:ctx(), binary()) -> {ok, openapi_ssio_order_lines_get_by_ad_account_200_response:openapi_ssio_order_lines_get_by_ad_account_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssio_order_lines/get_by_ad_account(Ctx, AdAccountId) ->
    ssio_order_lines/get_by_ad_account(Ctx, AdAccountId, #{}).

-spec ssio_order_lines/get_by_ad_account(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_ssio_order_lines_get_by_ad_account_200_response:openapi_ssio_order_lines_get_by_ad_account_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssio_order_lines/get_by_ad_account(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/ssio/order_lines"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'pin_order_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


