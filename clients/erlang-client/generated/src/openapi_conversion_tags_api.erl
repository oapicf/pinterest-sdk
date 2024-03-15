-module(openapi_conversion_tags_api).

-export([conversion_tags/create/3, conversion_tags/create/4,
         conversion_tags/get/3, conversion_tags/get/4,
         conversion_tags/list/2, conversion_tags/list/3,
         ocpm_eligible_conversion_tags/get/2, ocpm_eligible_conversion_tags/get/3,
         page_visit_conversion_tags/get/2, page_visit_conversion_tags/get/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create conversion tag
%% Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>
-spec conversion_tags/create(ctx:ctx(), binary(), openapi_conversion_tag_create:openapi_conversion_tag_create()) -> {ok, openapi_conversion_tag_response:openapi_conversion_tag_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_tags/create(Ctx, AdAccountId, OpenapiConversionTagCreate) ->
    conversion_tags/create(Ctx, AdAccountId, OpenapiConversionTagCreate, #{}).

-spec conversion_tags/create(ctx:ctx(), binary(), openapi_conversion_tag_create:openapi_conversion_tag_create(), maps:map()) -> {ok, openapi_conversion_tag_response:openapi_conversion_tag_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_tags/create(Ctx, AdAccountId, OpenapiConversionTagCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/conversion_tags"],
    QS = [],
    Headers = [],
    Body1 = OpenapiConversionTagCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get conversion tag
%% Get information about an existing conversion tag.
-spec conversion_tags/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_conversion_tag_response:openapi_conversion_tag_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_tags/get(Ctx, AdAccountId, ConversionTagId) ->
    conversion_tags/get(Ctx, AdAccountId, ConversionTagId, #{}).

-spec conversion_tags/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_conversion_tag_response:openapi_conversion_tag_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_tags/get(Ctx, AdAccountId, ConversionTagId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/conversion_tags/", ConversionTagId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get conversion tags
%% List conversion tags associated with an ad account.
-spec conversion_tags/list(ctx:ctx(), binary()) -> {ok, openapi_conversion_tag_list_response:openapi_conversion_tag_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_tags/list(Ctx, AdAccountId) ->
    conversion_tags/list(Ctx, AdAccountId, #{}).

-spec conversion_tags/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_conversion_tag_list_response:openapi_conversion_tag_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
conversion_tags/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/conversion_tags"],
    QS = lists:flatten([])++openapi_utils:optional_params(['filter_deleted'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Ocpm eligible conversion tags
%% Get Ocpm eligible conversion tag events for an ad account.
-spec ocpm_eligible_conversion_tags/get(ctx:ctx(), binary()) -> {ok, maps:map(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ocpm_eligible_conversion_tags/get(Ctx, AdAccountId) ->
    ocpm_eligible_conversion_tags/get(Ctx, AdAccountId, #{}).

-spec ocpm_eligible_conversion_tags/get(ctx:ctx(), binary(), maps:map()) -> {ok, maps:map(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ocpm_eligible_conversion_tags/get(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/conversion_tags/ocpm_eligible"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get page visit conversion tags
%% Get all page visit conversion tag events for an ad account.
-spec page_visit_conversion_tags/get(ctx:ctx(), binary()) -> {ok, openapi_page_visit_conversion_tags_get_200_response:openapi_page_visit_conversion_tags_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
page_visit_conversion_tags/get(Ctx, AdAccountId) ->
    page_visit_conversion_tags/get(Ctx, AdAccountId, #{}).

-spec page_visit_conversion_tags/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_page_visit_conversion_tags_get_200_response:openapi_page_visit_conversion_tags_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
page_visit_conversion_tags/get(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/conversion_tags/page_visit"],
    QS = lists:flatten([])++openapi_utils:optional_params(['page_size', 'order', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


