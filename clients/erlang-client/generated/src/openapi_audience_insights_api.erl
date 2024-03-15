-module(openapi_audience_insights_api).

-export([audience_insights/get/3, audience_insights/get/4,
         audience_insights_scope_and_type/get/2, audience_insights_scope_and_type/get/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Get audience insights
%% Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
-spec audience_insights/get(ctx:ctx(), binary(), openapi_audience_insight_type) -> {ok, openapi_audience_insights_response:openapi_audience_insights_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audience_insights/get(Ctx, AdAccountId, AudienceInsightType) ->
    audience_insights/get(Ctx, AdAccountId, AudienceInsightType, #{}).

-spec audience_insights/get(ctx:ctx(), binary(), openapi_audience_insight_type, maps:map()) -> {ok, openapi_audience_insights_response:openapi_audience_insights_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audience_insights/get(Ctx, AdAccountId, AudienceInsightType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/audience_insights"],
    QS = lists:flatten([{<<"audience_insight_type">>, AudienceInsightType}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get audience insights scope and type
%% Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
-spec audience_insights_scope_and_type/get(ctx:ctx(), binary()) -> {ok, openapi_audience_definition_response:openapi_audience_definition_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audience_insights_scope_and_type/get(Ctx, AdAccountId) ->
    audience_insights_scope_and_type/get(Ctx, AdAccountId, #{}).

-spec audience_insights_scope_and_type/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_audience_definition_response:openapi_audience_definition_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audience_insights_scope_and_type/get(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/insights/audiences"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


