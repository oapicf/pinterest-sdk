-module(openapi_labels_api).

-export([labels/apply/4, labels/apply/5,
         labels/create/3, labels/create/4,
         labels/list/2, labels/list/3,
         labels/remove/4, labels/remove/5,
         labels/update/3, labels/update/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Apply label to entity
%%   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
-spec labels/apply(ctx:ctx(), binary(), binary(), openapi_labeled_entities_create:openapi_labeled_entities_create()) -> {ok, openapi_labeled_entities:openapi_labeled_entities(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
labels/apply(Ctx, AdAccountId, LabelId, OpenapiLabeledEntitiesCreate) ->
    labels/apply(Ctx, AdAccountId, LabelId, OpenapiLabeledEntitiesCreate, #{}).

-spec labels/apply(ctx:ctx(), binary(), binary(), openapi_labeled_entities_create:openapi_labeled_entities_create(), maps:map()) -> {ok, openapi_labeled_entities:openapi_labeled_entities(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
labels/apply(Ctx, AdAccountId, LabelId, OpenapiLabeledEntitiesCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/labels/", LabelId, "/apply"],
    QS = [],
    Headers = [],
    Body1 = OpenapiLabeledEntitiesCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create labels
%% [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
-spec labels/create(ctx:ctx(), binary(), openapi_label_create_request:openapi_label_create_request()) -> {ok, openapi_labels_response:openapi_labels_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
labels/create(Ctx, AdAccountId, OpenapiLabelCreateRequest) ->
    labels/create(Ctx, AdAccountId, OpenapiLabelCreateRequest, #{}).

-spec labels/create(ctx:ctx(), binary(), openapi_label_create_request:openapi_label_create_request(), maps:map()) -> {ok, openapi_labels_response:openapi_labels_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
labels/create(Ctx, AdAccountId, OpenapiLabelCreateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/labels"],
    QS = [],
    Headers = [],
    Body1 = OpenapiLabelCreateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List labels
%% [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
-spec labels/list(ctx:ctx(), binary()) -> {ok, openapi_labels_list_200_response:openapi_labels_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
labels/list(Ctx, AdAccountId) ->
    labels/list(Ctx, AdAccountId, #{}).

-spec labels/list(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_labels_list_200_response:openapi_labels_list_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
labels/list(Ctx, AdAccountId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/labels"],
    QS = lists:flatten([])++openapi_utils:optional_params(['campaign_ids', 'label_ids', 'entity_statuses', 'label_types', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Remove label from entities
%%   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
-spec labels/remove(ctx:ctx(), binary(), binary(), openapi_labeled_entities_create:openapi_labeled_entities_create()) -> {ok, openapi_labeled_entities:openapi_labeled_entities(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
labels/remove(Ctx, AdAccountId, LabelId, OpenapiLabeledEntitiesCreate) ->
    labels/remove(Ctx, AdAccountId, LabelId, OpenapiLabeledEntitiesCreate, #{}).

-spec labels/remove(ctx:ctx(), binary(), binary(), openapi_labeled_entities_create:openapi_labeled_entities_create(), maps:map()) -> {ok, openapi_labeled_entities:openapi_labeled_entities(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
labels/remove(Ctx, AdAccountId, LabelId, OpenapiLabeledEntitiesCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/labels/", LabelId, "/remove"],
    QS = [],
    Headers = [],
    Body1 = OpenapiLabeledEntitiesCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update labels
%% [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
-spec labels/update(ctx:ctx(), binary(), openapi_label_update_request:openapi_label_update_request()) -> {ok, openapi_labels_response:openapi_labels_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
labels/update(Ctx, AdAccountId, OpenapiLabelUpdateRequest) ->
    labels/update(Ctx, AdAccountId, OpenapiLabelUpdateRequest, #{}).

-spec labels/update(ctx:ctx(), binary(), openapi_label_update_request:openapi_label_update_request(), maps:map()) -> {ok, openapi_labels_response:openapi_labels_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
labels/update(Ctx, AdAccountId, OpenapiLabelUpdateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/ad_accounts/", AdAccountId, "/labels"],
    QS = [],
    Headers = [],
    Body1 = OpenapiLabelUpdateRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


