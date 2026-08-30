-module(openapi_conversion_events_api).

-export([events/create/3, events/create/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Send conversions
%% The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their `ad_account_id`. The request body should be a JSON object. - This endpoint requires an `access_token` be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is `Authorization: Bearer <access_token>`). - The token's `user_account` must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
-spec events/create(ctx:ctx(), binary(), openapi_conversion_events_create:openapi_conversion_events_create()) -> {ok, openapi_conversion_events:openapi_conversion_events(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
events/create(Ctx, AdAccountId, OpenapiConversionEventsCreate) ->
    events/create(Ctx, AdAccountId, OpenapiConversionEventsCreate, #{}).

-spec events/create(ctx:ctx(), binary(), openapi_conversion_events_create:openapi_conversion_events_create(), maps:map()) -> {ok, openapi_conversion_events:openapi_conversion_events(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
events/create(Ctx, AdAccountId, OpenapiConversionEventsCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/events"],
    QS = lists:flatten([])++openapi_utils:optional_params(['test'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiConversionEventsCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


