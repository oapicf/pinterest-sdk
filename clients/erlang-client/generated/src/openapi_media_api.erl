-module(openapi_media_api).

-export([media/create/2, media/create/3,
         media/get/2, media/get/3,
         media/list/1, media/list/2]).

-define(BASE_URL, <<"/v5">>).

%% @doc Register media upload
%% Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
-spec media/create(ctx:ctx(), openapi_media_upload_request:openapi_media_upload_request()) -> {ok, openapi_media_upload:openapi_media_upload(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
media/create(Ctx, OpenapiMediaUploadRequest) ->
    media/create(Ctx, OpenapiMediaUploadRequest, #{}).

-spec media/create(ctx:ctx(), openapi_media_upload_request:openapi_media_upload_request(), maps:map()) -> {ok, openapi_media_upload:openapi_media_upload(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
media/create(Ctx, OpenapiMediaUploadRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/media"],
    QS = [],
    Headers = [],
    Body1 = OpenapiMediaUploadRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get media upload details
%% Get details for a registered media upload, including its current status.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
-spec media/get(ctx:ctx(), binary()) -> {ok, openapi_media_upload_details:openapi_media_upload_details(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
media/get(Ctx, MediaId) ->
    media/get(Ctx, MediaId, #{}).

-spec media/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_media_upload_details:openapi_media_upload_details(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
media/get(Ctx, MediaId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/media/", MediaId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List media uploads
%% List media uploads filtered by given parameters.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
-spec media/list(ctx:ctx()) -> {ok, openapi_media_list_200_response:openapi_media_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
media/list(Ctx) ->
    media/list(Ctx, #{}).

-spec media/list(ctx:ctx(), maps:map()) -> {ok, openapi_media_list_200_response:openapi_media_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
media/list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/media"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


