-module(openapi_business_access_assets_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/businesses/:business_id/asset_groups`, OperationId: `asset_group/create`:
Create a new asset group..
Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.

- `DELETE` to `/businesses/:business_id/asset_groups`, OperationId: `asset_group/delete`:
Delete asset groups..
Delete a batch of asset groups.

- `PATCH` to `/businesses/:business_id/asset_groups`, OperationId: `asset_group/update`:
Update asset groups..
Update a batch of asset groups with the specified parameters.

- `GET` to `/businesses/:business_id/assets/:asset_id/members`, OperationId: `business_asset_members/get`:
Get members with access to asset.
Get all the members the requesting business has granted access to on the given asset.

- `GET` to `/businesses/:business_id/assets/:asset_id/partners`, OperationId: `business_asset_partners/get`:
Get partners with access to asset.
Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

- `GET` to `/businesses/:business_id/assets`, OperationId: `business_assets/get`:
List business assets.
Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

- `GET` to `/businesses/:business_id/members/:member_id/assets`, OperationId: `business_member_assets/get`:
Get assets assigned to a member.
Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

- `DELETE` to `/businesses/:business_id/members/assets/access`, OperationId: `business_members_asset_access/delete`:
Delete member access to asset.
Terminate multiple members&#39; access to an asset.

- `PATCH` to `/businesses/:business_id/members/assets/access`, OperationId: `business_members_asset_access/update`:
Assign/Update member asset permissions.
Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 

- `GET` to `/businesses/:business_id/partners/:partner_id/assets`, OperationId: `business_partner_asset_access/get`:
Get assets assigned to a partner or assets assigned by a partner.
Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.

- `DELETE` to `/businesses/:business_id/partners/assets`, OperationId: `delete_partner_asset_access_handler_impl`:
Delete partner access to asset.
Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.

- `PATCH` to `/businesses/:business_id/partners/assets`, OperationId: `update_partner_asset_access_handler_impl`:
Assign/Update partner asset permissions.
Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

""".

-behaviour(cowboy_rest).

-include_lib("kernel/include/logger.hrl").

%% Cowboy REST callbacks
-export([init/2]).
-export([allowed_methods/2]).
-export([content_types_accepted/2]).
-export([content_types_provided/2]).
-export([delete_resource/2]).
-export([is_authorized/2]).
-export([valid_content_headers/2]).
-export([handle_type_accepted/2, handle_type_provided/2]).

-ignore_xref([handle_type_accepted/2, handle_type_provided/2]).

-export_type([class/0, operation_id/0]).

-type class() :: 'businessAccessAssets'.

-type operation_id() ::
    'asset_group/create' %% Create a new asset group.
    | 'asset_group/delete' %% Delete asset groups.
    | 'asset_group/update' %% Update asset groups.
    | 'business_asset_members/get' %% Get members with access to asset
    | 'business_asset_partners/get' %% Get partners with access to asset
    | 'business_assets/get' %% List business assets
    | 'business_member_assets/get' %% Get assets assigned to a member
    | 'business_members_asset_access/delete' %% Delete member access to asset
    | 'business_members_asset_access/update' %% Assign/Update member asset permissions
    | 'business_partner_asset_access/get' %% Get assets assigned to a partner or assets assigned by a partner
    | 'delete_partner_asset_access_handler_impl' %% Delete partner access to asset
    | 'update_partner_asset_access_handler_impl'. %% Assign/Update partner asset permissions


-record(state,
        {operation_id :: operation_id(),
         accept_callback :: openapi_logic_handler:accept_callback(),
         provide_callback :: openapi_logic_handler:provide_callback(),
         api_key_handler :: openapi_logic_handler:api_key_callback(),
         context = #{} :: openapi_logic_handler:context()}).

-type state() :: #state{}.

-spec init(cowboy_req:req(), openapi_router:init_opts()) ->
    {cowboy_rest, cowboy_req:req(), state()}.
init(Req, {Operations, Module}) ->
    Method = cowboy_req:method(Req),
    OperationID = maps:get(Method, Operations, undefined),
    ?LOG_INFO(#{what => "Attempt to process operation",
                method => Method,
                operation_id => OperationID}),
    State = #state{operation_id = OperationID,
                   accept_callback = fun Module:accept_callback/4,
                   provide_callback = fun Module:provide_callback/4,
                   api_key_handler = fun Module:authorize_api_key/2},
    {cowboy_rest, Req, State}.

-spec allowed_methods(cowboy_req:req(), state()) ->
    {[binary()], cowboy_req:req(), state()}.
allowed_methods(Req, #state{operation_id = 'asset_group/create'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'asset_group/delete'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'asset_group/update'} = State) ->
    {[<<"PATCH">>], Req, State};
allowed_methods(Req, #state{operation_id = 'business_asset_members/get'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'business_asset_partners/get'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'business_assets/get'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'business_member_assets/get'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'business_members_asset_access/delete'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'business_members_asset_access/update'} = State) ->
    {[<<"PATCH">>], Req, State};
allowed_methods(Req, #state{operation_id = 'business_partner_asset_access/get'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'delete_partner_asset_access_handler_impl'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'update_partner_asset_access_handler_impl'} = State) ->
    {[<<"PATCH">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'asset_group/create' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'asset_group/delete' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'asset_group/update' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'business_asset_members/get' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'business_asset_partners/get' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'business_assets/get' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'business_member_assets/get' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'business_members_asset_access/delete' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'business_members_asset_access/update' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'business_partner_asset_access/get' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'delete_partner_asset_access_handler_impl' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'update_partner_asset_access_handler_impl' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'asset_group/create'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'asset_group/delete'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'asset_group/update'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'business_asset_members/get'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'business_asset_partners/get'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'business_assets/get'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'business_member_assets/get'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'business_members_asset_access/delete'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'business_members_asset_access/update'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'business_partner_asset_access/get'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'delete_partner_asset_access_handler_impl'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'update_partner_asset_access_handler_impl'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'asset_group/create'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'asset_group/delete'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'asset_group/update'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'business_asset_members/get'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'business_asset_partners/get'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'business_assets/get'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'business_member_assets/get'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'business_members_asset_access/delete'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'business_members_asset_access/update'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'business_partner_asset_access/get'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'delete_partner_asset_access_handler_impl'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'update_partner_asset_access_handler_impl'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'asset_group/create'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'asset_group/delete'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'asset_group/update'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'business_asset_members/get'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'business_asset_partners/get'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'business_assets/get'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'business_member_assets/get'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'business_members_asset_access/delete'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'business_members_asset_access/update'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'business_partner_asset_access/get'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'delete_partner_asset_access_handler_impl'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'update_partner_asset_access_handler_impl'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, State) ->
    {[], Req, State}.

-spec delete_resource(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
delete_resource(Req, State) ->
    {Res, Req1, State1} = handle_type_accepted(Req, State),
    {true =:= Res, Req1, State1}.

-spec handle_type_accepted(cowboy_req:req(), state()) ->
    { openapi_logic_handler:accept_callback_return(), cowboy_req:req(), state()}.
handle_type_accepted(Req, #state{operation_id = OperationID,
                                 accept_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(businessAccessAssets, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    {cowboy_req:resp_body(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(businessAccessAssets, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
