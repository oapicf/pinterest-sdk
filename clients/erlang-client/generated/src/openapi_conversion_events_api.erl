-module(openapi_conversion_events_api).

-export([events/create/3, events/create/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Send conversions
%% The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversions/\">Conversions Guide</a> for more details. - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
-spec events/create(ctx:ctx(), binary(), openapi_conversion_events:openapi_conversion_events()) -> {ok, openapi_conversion_api_response:openapi_conversion_api_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
events/create(Ctx, AdAccountId, OpenapiConversionEvents) ->
    events/create(Ctx, AdAccountId, OpenapiConversionEvents, #{}).

-spec events/create(ctx:ctx(), binary(), openapi_conversion_events:openapi_conversion_events(), maps:map()) -> {ok, openapi_conversion_api_response:openapi_conversion_api_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
events/create(Ctx, AdAccountId, OpenapiConversionEvents, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/events"],
    QS = lists:flatten([])++openapi_utils:optional_params(['test'], _OptionalParams),
    Headers = [],
    Body1 = OpenapiConversionEvents,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


