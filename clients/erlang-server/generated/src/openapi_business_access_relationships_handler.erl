-module(openapi_business_access_relationships_handler).
-moduledoc """
Exposes the following operation IDs:

- `DELETE` to `/businesses/:business_id/members`, OperationId: `delete_business_membership`:
Terminate business memberships.
Terminate memberships between the specified members and your business.

- `DELETE` to `/businesses/:business_id/partners`, OperationId: `delete_business_partners`:
Terminate business partnerships.
Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

- `GET` to `/businesses/employers`, OperationId: `get/business_employers`:
List business employers for user.
Get all of the viewing user&#39;s business employers.

- `GET` to `/businesses/:business_id/members`, OperationId: `get/business_members`:
Get business members.
Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE

- `GET` to `/businesses/:business_id/partners`, OperationId: `get/business_partners`:
Get business partners.
Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.

- `PATCH` to `/businesses/:business_id/members`, OperationId: `update/business_memberships`:
Update member&#39;s business role.
Update a member&#39;s business role within the business.

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

-type class() :: 'businessAccessRelationships'.

-type operation_id() ::
    'delete_business_membership' %% Terminate business memberships
    | 'delete_business_partners' %% Terminate business partnerships
    | 'get/business_employers' %% List business employers for user
    | 'get/business_members' %% Get business members
    | 'get/business_partners' %% Get business partners
    | 'update/business_memberships'. %% Update member&#39;s business role


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
allowed_methods(Req, #state{operation_id = 'delete_business_membership'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'delete_business_partners'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'get/business_employers'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'get/business_members'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'get/business_partners'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'update/business_memberships'} = State) ->
    {[<<"PATCH">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'delete_business_membership' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'delete_business_partners' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'get/business_employers' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'get/business_members' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'get/business_partners' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'update/business_memberships' = OperationID,
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
content_types_accepted(Req, #state{operation_id = 'delete_business_membership'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'delete_business_partners'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'get/business_employers'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'get/business_members'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'get/business_partners'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'update/business_memberships'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'delete_business_membership'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'delete_business_partners'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'get/business_employers'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'get/business_members'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'get/business_partners'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'update/business_memberships'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'delete_business_membership'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'delete_business_partners'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'get/business_employers'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'get/business_members'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'get/business_partners'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'update/business_memberships'} = State) ->
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
    {Res, Req1, Context1} = Handler(businessAccessRelationships, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    {cowboy_req:resp_body(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(businessAccessRelationships, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
