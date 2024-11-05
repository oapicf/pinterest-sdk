-module(openapi_audience_sharing_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/ad_accounts/:ad_account_id/audiences/shared/accounts`, OperationId: `ad_accounts_audiences_shared_accounts/list`:
List accounts with access to an audience owned by an ad account.
List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

- `GET` to `/businesses/:business_id/audiences/shared/accounts`, OperationId: `business_account_audiences_shared_accounts/list`:
List accounts with access to an audience owned by a business.
List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

- `GET` to `/businesses/:business_id/audiences`, OperationId: `shared_audiences_for_business/list`:
List received audiences for a business.
Get a list of received audiences for the given business.

- `PATCH` to `/ad_accounts/:ad_account_id/audiences/ad_accounts/shared`, OperationId: `update_ad_account_to_ad_account_shared_audience`:
Update audience sharing between ad accounts.
From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

- `PATCH` to `/ad_accounts/:ad_account_id/audiences/businesses/shared`, OperationId: `update_ad_account_to_business_shared_audience`:
Update audience sharing from an ad account to businesses.
From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

- `PATCH` to `/businesses/:business_id/audiences/ad_accounts/shared`, OperationId: `update_business_to_ad_account_shared_audience`:
Update audience sharing from a business to ad accounts.
From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

- `PATCH` to `/businesses/:business_id/audiences/businesses/shared`, OperationId: `update_business_to_business_shared_audience`:
Update audience sharing between businesses.
From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

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

-type class() :: 'audienceSharing'.

-type operation_id() ::
    'ad_accounts_audiences_shared_accounts/list' %% List accounts with access to an audience owned by an ad account
    | 'business_account_audiences_shared_accounts/list' %% List accounts with access to an audience owned by a business
    | 'shared_audiences_for_business/list' %% List received audiences for a business
    | 'update_ad_account_to_ad_account_shared_audience' %% Update audience sharing between ad accounts
    | 'update_ad_account_to_business_shared_audience' %% Update audience sharing from an ad account to businesses
    | 'update_business_to_ad_account_shared_audience' %% Update audience sharing from a business to ad accounts
    | 'update_business_to_business_shared_audience'. %% Update audience sharing between businesses


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
allowed_methods(Req, #state{operation_id = 'ad_accounts_audiences_shared_accounts/list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'business_account_audiences_shared_accounts/list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'shared_audiences_for_business/list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'update_ad_account_to_ad_account_shared_audience'} = State) ->
    {[<<"PATCH">>], Req, State};
allowed_methods(Req, #state{operation_id = 'update_ad_account_to_business_shared_audience'} = State) ->
    {[<<"PATCH">>], Req, State};
allowed_methods(Req, #state{operation_id = 'update_business_to_ad_account_shared_audience'} = State) ->
    {[<<"PATCH">>], Req, State};
allowed_methods(Req, #state{operation_id = 'update_business_to_business_shared_audience'} = State) ->
    {[<<"PATCH">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'ad_accounts_audiences_shared_accounts/list' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'business_account_audiences_shared_accounts/list' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'shared_audiences_for_business/list' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'update_ad_account_to_ad_account_shared_audience' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'update_ad_account_to_business_shared_audience' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'update_business_to_ad_account_shared_audience' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'update_business_to_business_shared_audience' = OperationID,
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
content_types_accepted(Req, #state{operation_id = 'ad_accounts_audiences_shared_accounts/list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'business_account_audiences_shared_accounts/list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'shared_audiences_for_business/list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'update_ad_account_to_ad_account_shared_audience'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'update_ad_account_to_business_shared_audience'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'update_business_to_ad_account_shared_audience'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'update_business_to_business_shared_audience'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'ad_accounts_audiences_shared_accounts/list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'business_account_audiences_shared_accounts/list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'shared_audiences_for_business/list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'update_ad_account_to_ad_account_shared_audience'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'update_ad_account_to_business_shared_audience'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'update_business_to_ad_account_shared_audience'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'update_business_to_business_shared_audience'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'ad_accounts_audiences_shared_accounts/list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'business_account_audiences_shared_accounts/list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'shared_audiences_for_business/list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'update_ad_account_to_ad_account_shared_audience'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'update_ad_account_to_business_shared_audience'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'update_business_to_ad_account_shared_audience'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'update_business_to_business_shared_audience'} = State) ->
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
    {Res, Req1, Context1} = Handler(audienceSharing, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    {cowboy_req:resp_body(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(audienceSharing, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
