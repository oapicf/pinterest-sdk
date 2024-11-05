-module(openapi_business_access_invite_api).

-export([asset_access_requests/create/3, asset_access_requests/create/4,
         cancel_invites_or_requests/3, cancel_invites_or_requests/4,
         create_asset_invites/3, create_asset_invites/4,
         create_membership_or_partnership_invites/3, create_membership_or_partnership_invites/4,
         get/invites/2, get/invites/3,
         respond_business_access_invites/2, respond_business_access_invites/3]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create a request to access an existing partner's assets.
%% Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
-spec asset_access_requests/create(ctx:ctx(), binary(), openapi_create_asset_access_request_body:openapi_create_asset_access_request_body()) -> {ok, openapi_create_asset_access_request_response:openapi_create_asset_access_request_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
asset_access_requests/create(Ctx, BusinessId, OpenapiCreateAssetAccessRequestBody) ->
    asset_access_requests/create(Ctx, BusinessId, OpenapiCreateAssetAccessRequestBody, #{}).

-spec asset_access_requests/create(ctx:ctx(), binary(), openapi_create_asset_access_request_body:openapi_create_asset_access_request_body(), maps:map()) -> {ok, openapi_create_asset_access_request_response:openapi_create_asset_access_request_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
asset_access_requests/create(Ctx, BusinessId, OpenapiCreateAssetAccessRequestBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/requests/assets/access"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateAssetAccessRequestBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Cancel invites/requests
%% Cancel membership/partnership invites and/or requests.
-spec cancel_invites_or_requests(ctx:ctx(), binary(), openapi_cancel_invites_body:openapi_cancel_invites_body()) -> {ok, openapi_delete_invites_results_response_array:openapi_delete_invites_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_invites_or_requests(Ctx, BusinessId, OpenapiCancelInvitesBody) ->
    cancel_invites_or_requests(Ctx, BusinessId, OpenapiCancelInvitesBody, #{}).

-spec cancel_invites_or_requests(ctx:ctx(), binary(), openapi_cancel_invites_body:openapi_cancel_invites_body(), maps:map()) -> {ok, openapi_delete_invites_results_response_array:openapi_delete_invites_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_invites_or_requests(Ctx, BusinessId, OpenapiCancelInvitesBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/invites"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCancelInvitesBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update invite/request with an asset permission
%% Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
-spec create_asset_invites(ctx:ctx(), binary(), openapi_create_asset_invites_request:openapi_create_asset_invites_request()) -> {ok, openapi_update_invites_results_response_array:openapi_update_invites_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_asset_invites(Ctx, BusinessId, OpenapiCreateAssetInvitesRequest) ->
    create_asset_invites(Ctx, BusinessId, OpenapiCreateAssetInvitesRequest, #{}).

-spec create_asset_invites(ctx:ctx(), binary(), openapi_create_asset_invites_request:openapi_create_asset_invites_request(), maps:map()) -> {ok, openapi_update_invites_results_response_array:openapi_update_invites_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_asset_invites(Ctx, BusinessId, OpenapiCreateAssetInvitesRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/invites/assets/access"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateAssetInvitesRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create invites or requests
%% Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
-spec create_membership_or_partnership_invites(ctx:ctx(), binary(), openapi_create_membership_or_partnership_invites_body:openapi_create_membership_or_partnership_invites_body()) -> {ok, openapi_create_invites_results_response_array:openapi_create_invites_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_membership_or_partnership_invites(Ctx, BusinessId, OpenapiCreateMembershipOrPartnershipInvitesBody) ->
    create_membership_or_partnership_invites(Ctx, BusinessId, OpenapiCreateMembershipOrPartnershipInvitesBody, #{}).

-spec create_membership_or_partnership_invites(ctx:ctx(), binary(), openapi_create_membership_or_partnership_invites_body:openapi_create_membership_or_partnership_invites_body(), maps:map()) -> {ok, openapi_create_invites_results_response_array:openapi_create_invites_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_membership_or_partnership_invites(Ctx, BusinessId, OpenapiCreateMembershipOrPartnershipInvitesBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/invites"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateMembershipOrPartnershipInvitesBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get invites/requests
%% Get the membership/partnership invites and/or requests for the authorized user.
-spec get/invites(ctx:ctx(), binary()) -> {ok, openapi_get_invites_200_response:openapi_get_invites_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get/invites(Ctx, BusinessId) ->
    get/invites(Ctx, BusinessId, #{}).

-spec get/invites(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_get_invites_200_response:openapi_get_invites_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get/invites(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/invites"],
    QS = lists:flatten([])++openapi_utils:optional_params(['is_member', 'invite_status', 'invite_type', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Accept or decline an invite/request
%% Accept or decline invites or requests.
-spec respond_business_access_invites(ctx:ctx(), openapi_auth_respond_invites_body:openapi_auth_respond_invites_body()) -> {ok, openapi_respond_to_invites_response_array:openapi_respond_to_invites_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
respond_business_access_invites(Ctx, OpenapiAuthRespondInvitesBody) ->
    respond_business_access_invites(Ctx, OpenapiAuthRespondInvitesBody, #{}).

-spec respond_business_access_invites(ctx:ctx(), openapi_auth_respond_invites_body:openapi_auth_respond_invites_body(), maps:map()) -> {ok, openapi_respond_to_invites_response_array:openapi_respond_to_invites_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
respond_business_access_invites(Ctx, OpenapiAuthRespondInvitesBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/businesses/invites"],
    QS = [],
    Headers = [],
    Body1 = OpenapiAuthRespondInvitesBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


