-module(openapi_keywords_api).

-export([country_keywords_metrics/get/4, country_keywords_metrics/get/5,
         keywords/create/3, keywords/create/4,
         keywords/get/2, keywords/get/3,
         keywords/update/3, keywords/update/4,
         trending_keywords/list/3, trending_keywords/list/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get country's keyword metrics
%% See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
-spec country_keywords_metrics/get(ctx:ctx(), binary(), binary(), list()) -> {ok, openapi_keywords_metrics_array_response:openapi_keywords_metrics_array_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
country_keywords_metrics/get(Ctx, AdAccountId, CountryCode, Keywords) ->
    country_keywords_metrics/get(Ctx, AdAccountId, CountryCode, Keywords, #{}).

-spec country_keywords_metrics/get(ctx:ctx(), binary(), binary(), list(), maps:map()) -> {ok, openapi_keywords_metrics_array_response:openapi_keywords_metrics_array_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
country_keywords_metrics/get(Ctx, AdAccountId, CountryCode, Keywords, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/keywords/metrics"],
    QS = lists:flatten([{<<"country_code">>, CountryCode}, [{<<"keywords">>, X} || X <- Keywords]])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create keywords
%% <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>
-spec keywords/create(ctx:ctx(), binary(), openapi_keywords_request:openapi_keywords_request()) -> {ok, openapi_keywords_response:openapi_keywords_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keywords/create(Ctx, AdAccountId, OpenapiKeywordsRequest) ->
    keywords/create(Ctx, AdAccountId, OpenapiKeywordsRequest, #{}).

-spec keywords/create(ctx:ctx(), binary(), openapi_keywords_request:openapi_keywords_request(), maps:map()) -> {ok, openapi_keywords_response:openapi_keywords_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keywords/create(Ctx, AdAccountId, OpenapiKeywordsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/keywords"],
    QS = [],
    Headers = [],
    Body1 = OpenapiKeywordsRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get keywords
%% <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
-spec keywords/get(ctx:ctx(), binary()) -> {ok, openapi_keywords_get_200_response:openapi_keywords_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keywords/get(Ctx, AdAccountId) ->
    keywords/get(Ctx, AdAccountId, #{}).

-spec keywords/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_keywords_get_200_response:openapi_keywords_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keywords/get(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/keywords"],
    QS = lists:flatten([])++openapi_utils:optional_params(['campaign_id', 'ad_group_id', 'match_types', 'page_size', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update keywords
%% <p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>
-spec keywords/update(ctx:ctx(), binary(), openapi_keyword_update_body:openapi_keyword_update_body()) -> {ok, openapi_keywords_response:openapi_keywords_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keywords/update(Ctx, AdAccountId, OpenapiKeywordUpdateBody) ->
    keywords/update(Ctx, AdAccountId, OpenapiKeywordUpdateBody, #{}).

-spec keywords/update(ctx:ctx(), binary(), openapi_keyword_update_body:openapi_keyword_update_body(), maps:map()) -> {ok, openapi_keywords_response:openapi_keywords_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keywords/update(Ctx, AdAccountId, OpenapiKeywordUpdateBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/keywords"],
    QS = [],
    Headers = [],
    Body1 = OpenapiKeywordUpdateBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List trending keywords
%% <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>.
-spec trending_keywords/list(ctx:ctx(), openapi_trends_supported_region, openapi_trend_type) -> {ok, openapi_trending_keywords_response:openapi_trending_keywords_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
trending_keywords/list(Ctx, Region, TrendType) ->
    trending_keywords/list(Ctx, Region, TrendType, #{}).

-spec trending_keywords/list(ctx:ctx(), openapi_trends_supported_region, openapi_trend_type, maps:map()) -> {ok, openapi_trending_keywords_response:openapi_trending_keywords_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
trending_keywords/list(Ctx, Region, TrendType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/trends/keywords/", Region, "/top/", TrendType, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['interests', 'genders', 'ages', 'normalize_against_group', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


