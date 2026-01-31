-module(openapi_notification_api).

-export([notification/post/2, notification/post/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Receive notifications from external partners.
%% Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.
-spec notification/post(ctx:ctx(), openapi_notification_post_request:openapi_notification_post_request()) -> {ok, openapi_notification_response:openapi_notification_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
notification/post(Ctx, OpenapiNotificationPostRequest) ->
    notification/post(Ctx, OpenapiNotificationPostRequest, #{}).

-spec notification/post(ctx:ctx(), openapi_notification_post_request:openapi_notification_post_request(), maps:map()) -> {ok, openapi_notification_response:openapi_notification_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
notification/post(Ctx, OpenapiNotificationPostRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/notifications"],
    QS = [],
    Headers = [],
    Body1 = OpenapiNotificationPostRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


