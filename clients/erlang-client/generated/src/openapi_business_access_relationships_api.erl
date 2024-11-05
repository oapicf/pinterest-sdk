-module(openapi_business_access_relationships_api).

-export([delete_business_membership/3, delete_business_membership/4,
         delete_business_partners/3, delete_business_partners/4,
         get/business_employers/1, get/business_employers/2,
         get/business_members/2, get/business_members/3,
         get/business_partners/2, get/business_partners/3,
         update/business_memberships/3, update/business_memberships/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Terminate business memberships
%% Terminate memberships between the specified members and your business.
-spec delete_business_membership(ctx:ctx(), binary(), openapi_members_to_delete_body:openapi_members_to_delete_body()) -> {ok, openapi_deleted_members_response:openapi_deleted_members_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_business_membership(Ctx, BusinessId, OpenapiMembersToDeleteBody) ->
    delete_business_membership(Ctx, BusinessId, OpenapiMembersToDeleteBody, #{}).

-spec delete_business_membership(ctx:ctx(), binary(), openapi_members_to_delete_body:openapi_members_to_delete_body(), maps:map()) -> {ok, openapi_deleted_members_response:openapi_deleted_members_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_business_membership(Ctx, BusinessId, OpenapiMembersToDeleteBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/members"],
    QS = [],
    Headers = [],
    Body1 = OpenapiMembersToDeleteBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Terminate business partnerships
%% Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
-spec delete_business_partners(ctx:ctx(), binary(), openapi_delete_partners_request:openapi_delete_partners_request()) -> {ok, openapi_delete_partners_response:openapi_delete_partners_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_business_partners(Ctx, BusinessId, OpenapiDeletePartnersRequest) ->
    delete_business_partners(Ctx, BusinessId, OpenapiDeletePartnersRequest, #{}).

-spec delete_business_partners(ctx:ctx(), binary(), openapi_delete_partners_request:openapi_delete_partners_request(), maps:map()) -> {ok, openapi_delete_partners_response:openapi_delete_partners_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_business_partners(Ctx, BusinessId, OpenapiDeletePartnersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/partners"],
    QS = [],
    Headers = [],
    Body1 = OpenapiDeletePartnersRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List business employers for user
%% Get all of the viewing user's business employers.
-spec get/business_employers(ctx:ctx()) -> {ok, openapi_get_business_employers_200_response:openapi_get_business_employers_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get/business_employers(Ctx) ->
    get/business_employers(Ctx, #{}).

-spec get/business_employers(ctx:ctx(), maps:map()) -> {ok, openapi_get_business_employers_200_response:openapi_get_business_employers_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get/business_employers(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/employers"],
    QS = lists:flatten([])++openapi_utils:optional_params(['page_size', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get business members
%% Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
-spec get/business_members(ctx:ctx(), binary()) -> {ok, openapi_get_business_members_200_response:openapi_get_business_members_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get/business_members(Ctx, BusinessId) ->
    get/business_members(Ctx, BusinessId, #{}).

-spec get/business_members(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_get_business_members_200_response:openapi_get_business_members_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get/business_members(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/members"],
    QS = lists:flatten([])++openapi_utils:optional_params(['assets_summary', 'business_roles', 'member_ids', 'start_index', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get business partners
%% Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
-spec get/business_partners(ctx:ctx(), binary()) -> {ok, openapi_get_business_partners_200_response:openapi_get_business_partners_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get/business_partners(Ctx, BusinessId) ->
    get/business_partners(Ctx, BusinessId, #{}).

-spec get/business_partners(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_get_business_partners_200_response:openapi_get_business_partners_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get/business_partners(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/partners"],
    QS = lists:flatten([])++openapi_utils:optional_params(['assets_summary', 'partner_type', 'partner_ids', 'start_index', 'page_size', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update member's business role
%% Update a member's business role within the business.
-spec update/business_memberships(ctx:ctx(), binary(), list()) -> {ok, openapi_update_member_results_response_array:openapi_update_member_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update/business_memberships(Ctx, BusinessId, OpenapiUpdateMemberBusinessRoleBodyArray) ->
    update/business_memberships(Ctx, BusinessId, OpenapiUpdateMemberBusinessRoleBodyArray, #{}).

-spec update/business_memberships(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_update_member_results_response_array:openapi_update_member_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update/business_memberships(Ctx, BusinessId, OpenapiUpdateMemberBusinessRoleBodyArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/members"],
    QS = [],
    Headers = [],
    Body1 = OpenapiUpdateMemberBusinessRoleBodyArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


