-module(openapi_business_access_relationships_api).

-export([brand_accounts/create/3, brand_accounts/create/4,
         brand_accounts/update/4, brand_accounts/update/5,
         delete_business_membership/3, delete_business_membership/4,
         delete_business_partners/3, delete_business_partners/4,
         get/business_employers/1, get/business_employers/2,
         get/business_members/2, get/business_members/3,
         get/business_partners/2, get/business_partners/3,
         system_user/update/4, system_user/update/5,
         update/business_memberships/3, update/business_memberships/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create a Brand Account
%% Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
-spec brand_accounts/create(ctx:ctx(), binary(), openapi_brand_account_create:openapi_brand_account_create()) -> {ok, openapi_brand_account:openapi_brand_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
brand_accounts/create(Ctx, BusinessHierarchyId, OpenapiBrandAccountCreate) ->
    brand_accounts/create(Ctx, BusinessHierarchyId, OpenapiBrandAccountCreate, #{}).

-spec brand_accounts/create(ctx:ctx(), binary(), openapi_brand_account_create:openapi_brand_account_create(), maps:map()) -> {ok, openapi_brand_account:openapi_brand_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
brand_accounts/create(Ctx, BusinessHierarchyId, OpenapiBrandAccountCreate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/business_access/business_hierarchy/", BusinessHierarchyId, "/brand_accounts"],
    QS = [],
    Headers = [],
    Body1 = OpenapiBrandAccountCreate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update a Brand Account
%% Update an existing Brand Account
-spec brand_accounts/update(ctx:ctx(), binary(), binary(), openapi_brand_account_update:openapi_brand_account_update()) -> {ok, openapi_brand_account:openapi_brand_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
brand_accounts/update(Ctx, BrandAccountId, BusinessHierarchyId, OpenapiBrandAccountUpdate) ->
    brand_accounts/update(Ctx, BrandAccountId, BusinessHierarchyId, OpenapiBrandAccountUpdate, #{}).

-spec brand_accounts/update(ctx:ctx(), binary(), binary(), openapi_brand_account_update:openapi_brand_account_update(), maps:map()) -> {ok, openapi_brand_account:openapi_brand_account(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
brand_accounts/update(Ctx, BrandAccountId, BusinessHierarchyId, OpenapiBrandAccountUpdate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/business_access/business_hierarchy/", BusinessHierarchyId, "/brand_accounts/", BrandAccountId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiBrandAccountUpdate,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Terminate business memberships
%% Terminate memberships between the specified members and your business.
-spec delete_business_membership(ctx:ctx(), binary(), openapi_delete_business_membership_body:openapi_delete_business_membership_body()) -> {ok, openapi_delete_business_membership_200_response:openapi_delete_business_membership_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_business_membership(Ctx, BusinessId, OpenapiDeleteBusinessMembershipBody) ->
    delete_business_membership(Ctx, BusinessId, OpenapiDeleteBusinessMembershipBody, #{}).

-spec delete_business_membership(ctx:ctx(), binary(), openapi_delete_business_membership_body:openapi_delete_business_membership_body(), maps:map()) -> {ok, openapi_delete_business_membership_200_response:openapi_delete_business_membership_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_business_membership(Ctx, BusinessId, OpenapiDeleteBusinessMembershipBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/members"],
    QS = [],
    Headers = [],
    Body1 = OpenapiDeleteBusinessMembershipBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Terminate business partnerships
%% Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
-spec delete_business_partners(ctx:ctx(), binary(), openapi_delete_business_partners_delete:openapi_delete_business_partners_delete()) -> {ok, openapi_delete_business_partners:openapi_delete_business_partners(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_business_partners(Ctx, BusinessId, OpenapiDeleteBusinessPartnersDelete) ->
    delete_business_partners(Ctx, BusinessId, OpenapiDeleteBusinessPartnersDelete, #{}).

-spec delete_business_partners(ctx:ctx(), binary(), openapi_delete_business_partners_delete:openapi_delete_business_partners_delete(), maps:map()) -> {ok, openapi_delete_business_partners:openapi_delete_business_partners(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_business_partners(Ctx, BusinessId, OpenapiDeleteBusinessPartnersDelete, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/partners"],
    QS = [],
    Headers = [],
    Body1 = OpenapiDeleteBusinessPartnersDelete,
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
    QS = lists:flatten([])++openapi_utils:optional_params(['assets_summary', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get business members
%% Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
-spec get/business_members(ctx:ctx(), binary()) -> {ok, openapi_get_business_employers_200_response:openapi_get_business_employers_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get/business_members(Ctx, BusinessId) ->
    get/business_members(Ctx, BusinessId, #{}).

-spec get/business_members(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_get_business_employers_200_response:openapi_get_business_employers_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get/business_members(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/members"],
    QS = lists:flatten([])++openapi_utils:optional_params(['fetch_system_users', 'assets_summary', 'business_roles', 'member_ids', 'start_index', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get business partners
%% Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
-spec get/business_partners(ctx:ctx(), binary()) -> {ok, openapi_get_business_employers_200_response:openapi_get_business_employers_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get/business_partners(Ctx, BusinessId) ->
    get/business_partners(Ctx, BusinessId, #{}).

-spec get/business_partners(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_get_business_employers_200_response:openapi_get_business_employers_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get/business_partners(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/partners"],
    QS = lists:flatten([])++openapi_utils:optional_params(['assets_summary', 'partner_type', 'partner_ids', 'start_index', 'sort_ascending', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update a system user information.
%% Update a system user information such as name.
-spec system_user/update(ctx:ctx(), binary(), binary(), openapi_system_user_update_with_required_body:openapi_system_user_update_with_required_body()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
system_user/update(Ctx, BusinessId, SystemUserId, OpenapiSystemUserUpdateWithRequiredBody) ->
    system_user/update(Ctx, BusinessId, SystemUserId, OpenapiSystemUserUpdateWithRequiredBody, #{}).

-spec system_user/update(ctx:ctx(), binary(), binary(), openapi_system_user_update_with_required_body:openapi_system_user_update_with_required_body(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
system_user/update(Ctx, BusinessId, SystemUserId, OpenapiSystemUserUpdateWithRequiredBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/system_users/", SystemUserId, ""],
    QS = [],
    Headers = [],
    Body1 = OpenapiSystemUserUpdateWithRequiredBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update member's business role
%% Update a member's business role within the business.
-spec update/business_memberships(ctx:ctx(), binary(), list()) -> {ok, openapi_update_business_memberships_response:openapi_update_business_memberships_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update/business_memberships(Ctx, BusinessId, OpenapiBusinessMembershipMemberArray) ->
    update/business_memberships(Ctx, BusinessId, OpenapiBusinessMembershipMemberArray, #{}).

-spec update/business_memberships(ctx:ctx(), binary(), list(), maps:map()) -> {ok, openapi_update_business_memberships_response:openapi_update_business_memberships_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update/business_memberships(Ctx, BusinessId, OpenapiBusinessMembershipMemberArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/members"],
    QS = [],
    Headers = [],
    Body1 = OpenapiBusinessMembershipMemberArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


