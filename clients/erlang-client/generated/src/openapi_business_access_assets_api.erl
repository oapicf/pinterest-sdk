-module(openapi_business_access_assets_api).

-export([asset_group/create/3, asset_group/create/4,
         asset_group/delete/3, asset_group/delete/4,
         asset_group/update/3, asset_group/update/4,
         business_asset_members/get/3, business_asset_members/get/4,
         business_asset_partners/get/3, business_asset_partners/get/4,
         business_assets/get/2, business_assets/get/3,
         business_member_assets/get/3, business_member_assets/get/4,
         business_members_asset_access/delete/3, business_members_asset_access/delete/4,
         business_members_asset_access/update/3, business_members_asset_access/update/4,
         business_partner_asset_access/get/3, business_partner_asset_access/get/4,
         delete_partner_asset_access_handler_impl/3, delete_partner_asset_access_handler_impl/4,
         update_partner_asset_access_handler_impl/3, update_partner_asset_access_handler_impl/4]).

-define(BASE_URL, <<"/v5">>).

%% @doc Create a new asset group.
%% Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.
-spec asset_group/create(ctx:ctx(), binary(), openapi_create_asset_group_body:openapi_create_asset_group_body()) -> {ok, openapi_create_asset_group_response:openapi_create_asset_group_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
asset_group/create(Ctx, BusinessId, OpenapiCreateAssetGroupBody) ->
    asset_group/create(Ctx, BusinessId, OpenapiCreateAssetGroupBody, #{}).

-spec asset_group/create(ctx:ctx(), binary(), openapi_create_asset_group_body:openapi_create_asset_group_body(), maps:map()) -> {ok, openapi_create_asset_group_response:openapi_create_asset_group_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
asset_group/create(Ctx, BusinessId, OpenapiCreateAssetGroupBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/asset_groups"],
    QS = [],
    Headers = [],
    Body1 = OpenapiCreateAssetGroupBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete asset groups.
%% Delete a batch of asset groups.
-spec asset_group/delete(ctx:ctx(), binary(), openapi_delete_asset_group_body:openapi_delete_asset_group_body()) -> {ok, openapi_delete_asset_group_response:openapi_delete_asset_group_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
asset_group/delete(Ctx, BusinessId, OpenapiDeleteAssetGroupBody) ->
    asset_group/delete(Ctx, BusinessId, OpenapiDeleteAssetGroupBody, #{}).

-spec asset_group/delete(ctx:ctx(), binary(), openapi_delete_asset_group_body:openapi_delete_asset_group_body(), maps:map()) -> {ok, openapi_delete_asset_group_response:openapi_delete_asset_group_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
asset_group/delete(Ctx, BusinessId, OpenapiDeleteAssetGroupBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/asset_groups"],
    QS = [],
    Headers = [],
    Body1 = OpenapiDeleteAssetGroupBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update asset groups.
%% Update a batch of asset groups with the specified parameters.
-spec asset_group/update(ctx:ctx(), binary(), openapi_update_asset_group_body:openapi_update_asset_group_body()) -> {ok, openapi_update_asset_group_response:openapi_update_asset_group_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
asset_group/update(Ctx, BusinessId, OpenapiUpdateAssetGroupBody) ->
    asset_group/update(Ctx, BusinessId, OpenapiUpdateAssetGroupBody, #{}).

-spec asset_group/update(ctx:ctx(), binary(), openapi_update_asset_group_body:openapi_update_asset_group_body(), maps:map()) -> {ok, openapi_update_asset_group_response:openapi_update_asset_group_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
asset_group/update(Ctx, BusinessId, OpenapiUpdateAssetGroupBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/asset_groups"],
    QS = [],
    Headers = [],
    Body1 = OpenapiUpdateAssetGroupBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get members with access to asset
%% Get all the members the requesting business has granted access to on the given asset.
-spec business_asset_members/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_business_asset_members_get_200_response:openapi_business_asset_members_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_asset_members/get(Ctx, BusinessId, AssetId) ->
    business_asset_members/get(Ctx, BusinessId, AssetId, #{}).

-spec business_asset_members/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_business_asset_members_get_200_response:openapi_business_asset_members_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_asset_members/get(Ctx, BusinessId, AssetId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/assets/", AssetId, "/members"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bookmark', 'page_size', 'start_index'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get partners with access to asset
%% Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
-spec business_asset_partners/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_business_asset_partners_get_200_response:openapi_business_asset_partners_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_asset_partners/get(Ctx, BusinessId, AssetId) ->
    business_asset_partners/get(Ctx, BusinessId, AssetId, #{}).

-spec business_asset_partners/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_business_asset_partners_get_200_response:openapi_business_asset_partners_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_asset_partners/get(Ctx, BusinessId, AssetId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/assets/", AssetId, "/partners"],
    QS = lists:flatten([])++openapi_utils:optional_params(['start_index', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List business assets
%% Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
-spec business_assets/get(ctx:ctx(), binary()) -> {ok, openapi_business_assets_get_200_response:openapi_business_assets_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_assets/get(Ctx, BusinessId) ->
    business_assets/get(Ctx, BusinessId, #{}).

-spec business_assets/get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_business_assets_get_200_response:openapi_business_assets_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_assets/get(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/assets"],
    QS = lists:flatten([])++openapi_utils:optional_params(['permissions', 'child_asset_id', 'asset_group_id', 'asset_type', 'start_index', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get assets assigned to a member
%% Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
-spec business_member_assets/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_business_member_assets_get_200_response:openapi_business_member_assets_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_member_assets/get(Ctx, BusinessId, MemberId) ->
    business_member_assets/get(Ctx, BusinessId, MemberId, #{}).

-spec business_member_assets/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_business_member_assets_get_200_response:openapi_business_member_assets_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_member_assets/get(Ctx, BusinessId, MemberId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/members/", MemberId, "/assets"],
    QS = lists:flatten([])++openapi_utils:optional_params(['asset_type', 'start_index', 'bookmark', 'page_size'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete member access to asset
%% Terminate multiple members' access to an asset.
-spec business_members_asset_access/delete(ctx:ctx(), binary(), openapi_business_members_asset_access_delete_request:openapi_business_members_asset_access_delete_request()) -> {ok, openapi_delete_member_access_results_response_array:openapi_delete_member_access_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_members_asset_access/delete(Ctx, BusinessId, OpenapiBusinessMembersAssetAccessDeleteRequest) ->
    business_members_asset_access/delete(Ctx, BusinessId, OpenapiBusinessMembersAssetAccessDeleteRequest, #{}).

-spec business_members_asset_access/delete(ctx:ctx(), binary(), openapi_business_members_asset_access_delete_request:openapi_business_members_asset_access_delete_request(), maps:map()) -> {ok, openapi_delete_member_access_results_response_array:openapi_delete_member_access_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_members_asset_access/delete(Ctx, BusinessId, OpenapiBusinessMembersAssetAccessDeleteRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/members/assets/access"],
    QS = [],
    Headers = [],
    Body1 = OpenapiBusinessMembersAssetAccessDeleteRequest,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Assign/Update member asset permissions
%% Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
-spec business_members_asset_access/update(ctx:ctx(), binary(), openapi_update_member_asset_access_body:openapi_update_member_asset_access_body()) -> {ok, openapi_update_member_assets_results_response_array:openapi_update_member_assets_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_members_asset_access/update(Ctx, BusinessId, OpenapiUpdateMemberAssetAccessBody) ->
    business_members_asset_access/update(Ctx, BusinessId, OpenapiUpdateMemberAssetAccessBody, #{}).

-spec business_members_asset_access/update(ctx:ctx(), binary(), openapi_update_member_asset_access_body:openapi_update_member_asset_access_body(), maps:map()) -> {ok, openapi_update_member_assets_results_response_array:openapi_update_member_assets_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_members_asset_access/update(Ctx, BusinessId, OpenapiUpdateMemberAssetAccessBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/members/assets/access"],
    QS = [],
    Headers = [],
    Body1 = OpenapiUpdateMemberAssetAccessBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get assets assigned to a partner or assets assigned by a partner
%% Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
-spec business_partner_asset_access/get(ctx:ctx(), binary(), binary()) -> {ok, openapi_business_partner_asset_access_get_200_response:openapi_business_partner_asset_access_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_partner_asset_access/get(Ctx, BusinessId, PartnerId) ->
    business_partner_asset_access/get(Ctx, BusinessId, PartnerId, #{}).

-spec business_partner_asset_access/get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_business_partner_asset_access_get_200_response:openapi_business_partner_asset_access_get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
business_partner_asset_access/get(Ctx, BusinessId, PartnerId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/partners/", PartnerId, "/assets"],
    QS = lists:flatten([])++openapi_utils:optional_params(['partner_type', 'asset_type', 'start_index', 'page_size', 'bookmark'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete partner access to asset
%% Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
-spec delete_partner_asset_access_handler_impl(ctx:ctx(), binary(), openapi_delete_partner_asset_access_body:openapi_delete_partner_asset_access_body()) -> {ok, openapi_delete_partner_assets_results_response_array:openapi_delete_partner_assets_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_partner_asset_access_handler_impl(Ctx, BusinessId, OpenapiDeletePartnerAssetAccessBody) ->
    delete_partner_asset_access_handler_impl(Ctx, BusinessId, OpenapiDeletePartnerAssetAccessBody, #{}).

-spec delete_partner_asset_access_handler_impl(ctx:ctx(), binary(), openapi_delete_partner_asset_access_body:openapi_delete_partner_asset_access_body(), maps:map()) -> {ok, openapi_delete_partner_assets_results_response_array:openapi_delete_partner_assets_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_partner_asset_access_handler_impl(Ctx, BusinessId, OpenapiDeletePartnerAssetAccessBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/partners/assets"],
    QS = [],
    Headers = [],
    Body1 = OpenapiDeletePartnerAssetAccessBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Assign/Update partner asset permissions
%% Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
-spec update_partner_asset_access_handler_impl(ctx:ctx(), binary(), openapi_update_partner_asset_access_body:openapi_update_partner_asset_access_body()) -> {ok, openapi_update_partner_assets_results_response_array:openapi_update_partner_assets_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_partner_asset_access_handler_impl(Ctx, BusinessId, OpenapiUpdatePartnerAssetAccessBody) ->
    update_partner_asset_access_handler_impl(Ctx, BusinessId, OpenapiUpdatePartnerAssetAccessBody, #{}).

-spec update_partner_asset_access_handler_impl(ctx:ctx(), binary(), openapi_update_partner_asset_access_body:openapi_update_partner_asset_access_body(), maps:map()) -> {ok, openapi_update_partner_assets_results_response_array:openapi_update_partner_assets_results_response_array(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_partner_asset_access_handler_impl(Ctx, BusinessId, OpenapiUpdatePartnerAssetAccessBody, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = patch,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/partners/assets"],
    QS = [],
    Headers = [],
    Body1 = OpenapiUpdatePartnerAssetAccessBody,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


