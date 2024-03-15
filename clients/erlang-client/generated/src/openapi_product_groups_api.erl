-module(openapi_product_groups_api).

-export([ad_accounts_catalogs_product_groups/list/2, ad_accounts_catalogs_product_groups/list/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get catalog product groups
%% This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.
-spec ad_accounts_catalogs_product_groups/list(ctx:ctx(), binary()) -> {ok, openapi_ad_accounts_catalogs_product_groups_list_200_response:openapi_ad_accounts_catalogs_product_groups_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts_catalogs_product_groups/list(Ctx, AdAccountId) ->
    ad_accounts_catalogs_product_groups/list(Ctx, AdAccountId, #{}).

-spec ad_accounts_catalogs_product_groups/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_ad_accounts_catalogs_product_groups_list_200_response:openapi_ad_accounts_catalogs_product_groups_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts_catalogs_product_groups/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/product_groups/catalogs"],
    QS = lists:flatten([])++openapi_utils:optional_params(['feed_profile_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


