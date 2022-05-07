-module(openapi_boards_api).

-export([board_sections/create/3, board_sections/create/4,
         board_sections/delete/3, board_sections/delete/4,
         board_sections/list/2, board_sections/list/3,
         board_sections/list_pins/3, board_sections/list_pins/4,
         board_sections/update/4, board_sections/update/5,
         boards/create/2, boards/create/3,
         boards/delete/2, boards/delete/3,
         boards/get/2, boards/get/3,
         boards/list/1, boards/list/2,
         boards/list_pins/2, boards/list_pins/3,
         boards/update/3, boards/update/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create board section
%% Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
-spec board_sections/create(ctx:ctx(), binary(), openapi_board_section:openapi_board_section()) -> {ok, openapi_board_section:openapi_board_section(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
board_sections/create(Ctx, BoardId, OpenapiBoardSection) ->
    board_sections/create(Ctx, BoardId, OpenapiBoardSection, #{}).

-spec board_sections/create(ctx:ctx(), binary(), openapi_board_section:openapi_board_section(), maps:map()) -> {ok, openapi_board_section:openapi_board_section(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
board_sections/create(Ctx, BoardId, OpenapiBoardSection, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/boards/", BoardId, "/sections">>],
    QS = [],
    Headers = [],
    Body1 = OpenapiBoardSection,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete board section
%% Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
-spec board_sections/delete(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
board_sections/delete(Ctx, BoardId, SectionId) ->
    board_sections/delete(Ctx, BoardId, SectionId, #{}).

-spec board_sections/delete(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
board_sections/delete(Ctx, BoardId, SectionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/boards/", BoardId, "/sections/", SectionId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List board sections
%% Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
-spec board_sections/list(ctx:ctx(), binary()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
board_sections/list(Ctx, BoardId) ->
    board_sections/list(Ctx, BoardId, #{}).

-spec board_sections/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
board_sections/list(Ctx, BoardId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/boards/", BoardId, "/sections">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List Pins on board section
%% Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
-spec board_sections/list_pins(ctx:ctx(), binary(), binary()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
board_sections/list_pins(Ctx, BoardId, SectionId) ->
    board_sections/list_pins(Ctx, BoardId, SectionId, #{}).

-spec board_sections/list_pins(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
board_sections/list_pins(Ctx, BoardId, SectionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/boards/", BoardId, "/sections/", SectionId, "/pins">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update board section
%% Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
-spec board_sections/update(ctx:ctx(), binary(), binary(), openapi_board_section:openapi_board_section()) -> {ok, openapi_board_section:openapi_board_section(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
board_sections/update(Ctx, BoardId, SectionId, OpenapiBoardSection) ->
    board_sections/update(Ctx, BoardId, SectionId, OpenapiBoardSection, #{}).

-spec board_sections/update(ctx:ctx(), binary(), binary(), openapi_board_section:openapi_board_section(), maps:map()) -> {ok, openapi_board_section:openapi_board_section(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
board_sections/update(Ctx, BoardId, SectionId, OpenapiBoardSection, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/boards/", BoardId, "/sections/", SectionId, "">>],
    QS = [],
    Headers = [],
    Body1 = OpenapiBoardSection,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create board
%% Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
-spec boards/create(ctx:ctx(), openapi_board:openapi_board()) -> {ok, openapi_board:openapi_board(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards/create(Ctx, OpenapiBoard) ->
    boards/create(Ctx, OpenapiBoard, #{}).

-spec boards/create(ctx:ctx(), openapi_board:openapi_board(), maps:map()) -> {ok, openapi_board:openapi_board(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards/create(Ctx, OpenapiBoard, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/boards">>],
    QS = [],
    Headers = [],
    Body1 = OpenapiBoard,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete board
%% Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
-spec boards/delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards/delete(Ctx, BoardId) ->
    boards/delete(Ctx, BoardId, #{}).

-spec boards/delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards/delete(Ctx, BoardId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = [<<"/boards/", BoardId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get board
%% Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
-spec boards/get(ctx:ctx(), binary()) -> {ok, openapi_board:openapi_board(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards/get(Ctx, BoardId) ->
    boards/get(Ctx, BoardId, #{}).

-spec boards/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_board:openapi_board(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards/get(Ctx, BoardId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/boards/", BoardId, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List boards
%% Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
-spec boards/list(ctx:ctx()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards/list(Ctx) ->
    boards/list(Ctx, #{}).

-spec boards/list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards/list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/boards">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'privacy'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List Pins on board
%% Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
-spec boards/list_pins(ctx:ctx(), binary()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards/list_pins(Ctx, BoardId) ->
    boards/list_pins(Ctx, BoardId, #{}).

-spec boards/list_pins(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_paginated:openapi_paginated(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards/list_pins(Ctx, BoardId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/boards/", BoardId, "/pins">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update board
%% Update a board owned by the \"operating user_account\".
-spec boards/update(ctx:ctx(), binary(), openapi_board_update:openapi_board_update()) -> {ok, openapi_board:openapi_board(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards/update(Ctx, BoardId, OpenapiBoardUpdate) ->
    boards/update(Ctx, BoardId, OpenapiBoardUpdate, #{}).

-spec boards/update(ctx:ctx(), binary(), openapi_board_update:openapi_board_update(), maps:map()) -> {ok, openapi_board:openapi_board(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
boards/update(Ctx, BoardId, OpenapiBoardUpdate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = [<<"/boards/", BoardId, "">>],
    QS = [],
    Headers = [],
    Body1 = OpenapiBoardUpdate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


