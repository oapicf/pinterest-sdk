-module(openapi_audience_sharing_api).

-export([ad_accounts_audiences_shared_accounts/list/4, ad_accounts_audiences_shared_accounts/list/5,
         business_account_audiences_shared_accounts/list/4, business_account_audiences_shared_accounts/list/5,
         shared_audiences_for_business/list/2, shared_audiences_for_business/list/3,
         update_ad_account_to_ad_account_shared_audience/3, update_ad_account_to_ad_account_shared_audience/4,
         update_ad_account_to_business_shared_audience/3, update_ad_account_to_business_shared_audience/4,
         update_business_to_ad_account_shared_audience/3, update_business_to_ad_account_shared_audience/4,
         update_business_to_business_shared_audience/3, update_business_to_business_shared_audience/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc List accounts with access to an audience owned by an ad account
%% List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
-spec ad_accounts_audiences_shared_accounts/list(ctx:ctx(), binary(), binary(), openapi_audience_account_type) -> {ok, openapi_ad_accounts_audiences_shared_accounts_list_200_response:openapi_ad_accounts_audiences_shared_accounts_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts_audiences_shared_accounts/list(Ctx, AdAccountId, AudienceId, AccountType) ->
    ad_accounts_audiences_shared_accounts/list(Ctx, AdAccountId, AudienceId, AccountType, #{}).

-spec ad_accounts_audiences_shared_accounts/list(ctx:ctx(), binary(), binary(), openapi_audience_account_type, maps:map()) -> {ok, openapi_ad_accounts_audiences_shared_accounts_list_200_response:openapi_ad_accounts_audiences_shared_accounts_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ad_accounts_audiences_shared_accounts/list(Ctx, AdAccountId, AudienceId, AccountType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/audiences/shared/accounts"],
    QS = lists:flatten([{<<"audience_id">>, AudienceId}, {<<"account_type">>, AccountType}])++openapi_utils:optional_params(['page_size', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List accounts with access to an audience owned by a business
%% List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
-spec business_account_audiences_shared_accounts/list(ctx:ctx(), binary(), binary(), openapi_audience_account_type) -> {ok, openapi_ad_accounts_audiences_shared_accounts_list_200_response:openapi_ad_accounts_audiences_shared_accounts_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_account_audiences_shared_accounts/list(Ctx, BusinessId, AudienceId, AccountType) ->
    business_account_audiences_shared_accounts/list(Ctx, BusinessId, AudienceId, AccountType, #{}).

-spec business_account_audiences_shared_accounts/list(ctx:ctx(), binary(), binary(), openapi_audience_account_type, maps:map()) -> {ok, openapi_ad_accounts_audiences_shared_accounts_list_200_response:openapi_ad_accounts_audiences_shared_accounts_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_account_audiences_shared_accounts/list(Ctx, BusinessId, AudienceId, AccountType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/audiences/shared/accounts"],
    QS = lists:flatten([{<<"audience_id">>, AudienceId}, {<<"account_type">>, AccountType}])++openapi_utils:optional_params(['page_size', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List received audiences for a business
%% Get a list of received audiences for the given business.
-spec shared_audiences_for_business/list(ctx:ctx(), binary()) -> {ok, openapi_audiences_list_200_response:openapi_audiences_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
shared_audiences_for_business/list(Ctx, BusinessId) ->
    shared_audiences_for_business/list(Ctx, BusinessId, #{}).

-spec shared_audiences_for_business/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_audiences_list_200_response:openapi_audiences_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
shared_audiences_for_business/list(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/audiences"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'order', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update audience sharing between ad accounts
%% From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
-spec update_ad_account_to_ad_account_shared_audience(ctx:ctx(), binary(), openapi_shared_audience:openapi_shared_audience()) -> {ok, openapi_shared_audience_response:openapi_shared_audience_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_ad_account_to_ad_account_shared_audience(Ctx, AdAccountId, OpenapiSharedAudience) ->
    update_ad_account_to_ad_account_shared_audience(Ctx, AdAccountId, OpenapiSharedAudience, #{}).

-spec update_ad_account_to_ad_account_shared_audience(ctx:ctx(), binary(), openapi_shared_audience:openapi_shared_audience(), maps:map()) -> {ok, openapi_shared_audience_response:openapi_shared_audience_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_ad_account_to_ad_account_shared_audience(Ctx, AdAccountId, OpenapiSharedAudience, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/audiences/ad_accounts/shared"],
    QS = [],
    Headers = [],
    Body1 = OpenapiSharedAudience,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update audience sharing from an ad account to businesses
%% From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
-spec update_ad_account_to_business_shared_audience(ctx:ctx(), binary(), openapi_business_shared_audience:openapi_business_shared_audience()) -> {ok, openapi_business_shared_audience_response:openapi_business_shared_audience_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_ad_account_to_business_shared_audience(Ctx, AdAccountId, OpenapiBusinessSharedAudience) ->
    update_ad_account_to_business_shared_audience(Ctx, AdAccountId, OpenapiBusinessSharedAudience, #{}).

-spec update_ad_account_to_business_shared_audience(ctx:ctx(), binary(), openapi_business_shared_audience:openapi_business_shared_audience(), maps:map()) -> {ok, openapi_business_shared_audience_response:openapi_business_shared_audience_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_ad_account_to_business_shared_audience(Ctx, AdAccountId, OpenapiBusinessSharedAudience, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/audiences/businesses/shared"],
    QS = [],
    Headers = [],
    Body1 = OpenapiBusinessSharedAudience,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update audience sharing from a business to ad accounts
%% From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
-spec update_business_to_ad_account_shared_audience(ctx:ctx(), binary(), openapi_shared_audience:openapi_shared_audience()) -> {ok, openapi_shared_audience_response:openapi_shared_audience_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_business_to_ad_account_shared_audience(Ctx, BusinessId, OpenapiSharedAudience) ->
    update_business_to_ad_account_shared_audience(Ctx, BusinessId, OpenapiSharedAudience, #{}).

-spec update_business_to_ad_account_shared_audience(ctx:ctx(), binary(), openapi_shared_audience:openapi_shared_audience(), maps:map()) -> {ok, openapi_shared_audience_response:openapi_shared_audience_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_business_to_ad_account_shared_audience(Ctx, BusinessId, OpenapiSharedAudience, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/audiences/ad_accounts/shared"],
    QS = [],
    Headers = [],
    Body1 = OpenapiSharedAudience,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update audience sharing between businesses
%% From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
-spec update_business_to_business_shared_audience(ctx:ctx(), binary(), openapi_business_shared_audience:openapi_business_shared_audience()) -> {ok, openapi_business_shared_audience_response:openapi_business_shared_audience_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_business_to_business_shared_audience(Ctx, BusinessId, OpenapiBusinessSharedAudience) ->
    update_business_to_business_shared_audience(Ctx, BusinessId, OpenapiBusinessSharedAudience, #{}).

-spec update_business_to_business_shared_audience(ctx:ctx(), binary(), openapi_business_shared_audience:openapi_business_shared_audience(), maps:map()) -> {ok, openapi_business_shared_audience_response:openapi_business_shared_audience_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_business_to_business_shared_audience(Ctx, BusinessId, OpenapiBusinessSharedAudience, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/audiences/businesses/shared"],
    QS = [],
    Headers = [],
    Body1 = OpenapiBusinessSharedAudience,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


