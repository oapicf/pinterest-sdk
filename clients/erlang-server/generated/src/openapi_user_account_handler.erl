-module(openapi_user_account_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/user_account/following/boards`, OperationId: `boards_user_follows/list`:
List following boards.
Get a list of the boards a user follows. The request returns a board summary object array.

- `POST` to `/user_account/following/:username`, OperationId: `follow_user/update`:
Follow user.
&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.

- `GET` to `/user_account/followers`, OperationId: `followers/list`:
List followers.
Get a list of your followers.

- `GET` to `/user_account/businesses`, OperationId: `linked_business_accounts/get`:
List linked businesses.
Get a list of your linked business accounts.

- `DELETE` to `/user_account/websites`, OperationId: `unverify_website/delete`:
Unverify website.
Unverifu a website verified by the signed-in user.

- `GET` to `/user_account/analytics`, OperationId: `user_account/analytics`:
Get user account analytics.
Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

- `GET` to `/user_account/analytics/top_pins`, OperationId: `user_account/analytics/top_pins`:
Get user account top pins analytics.
Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

- `GET` to `/user_account/analytics/top_video_pins`, OperationId: `user_account/analytics/top_video_pins`:
Get user account top video pins analytics.
Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

- `GET` to `/users/:username/interests/follow`, OperationId: `user_account/followed_interests`:
List following interests.
Get a list of a user&#39;s following interests in one place.

- `GET` to `/user_account`, OperationId: `user_account/get`:
Get user account.
Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

- `GET` to `/user_account/following`, OperationId: `user_following/get`:
List following.
Get a list of who a certain user follows.

- `GET` to `/user_account/websites`, OperationId: `user_websites/get`:
Get user websites.
Get user websites, claimed or not

- `POST` to `/user_account/websites`, OperationId: `verify_website/update`:
Verify website.
Verify a website as a signed-in user.

- `GET` to `/user_account/websites/verification`, OperationId: `website_verification/get`:
Get user verification code for website claiming.
Get verification code for user to install on the website to claim it.

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

-type class() :: 'userAccount'.

-type operation_id() ::
    'boards_user_follows/list' %% List following boards
    | 'follow_user/update' %% Follow user
    | 'followers/list' %% List followers
    | 'linked_business_accounts/get' %% List linked businesses
    | 'unverify_website/delete' %% Unverify website
    | 'user_account/analytics' %% Get user account analytics
    | 'user_account/analytics/top_pins' %% Get user account top pins analytics
    | 'user_account/analytics/top_video_pins' %% Get user account top video pins analytics
    | 'user_account/followed_interests' %% List following interests
    | 'user_account/get' %% Get user account
    | 'user_following/get' %% List following
    | 'user_websites/get' %% Get user websites
    | 'verify_website/update' %% Verify website
    | 'website_verification/get'. %% Get user verification code for website claiming


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
allowed_methods(Req, #state{operation_id = 'boards_user_follows/list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'follow_user/update'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'followers/list'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'linked_business_accounts/get'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'unverify_website/delete'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'user_account/analytics'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'user_account/analytics/top_pins'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'user_account/analytics/top_video_pins'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'user_account/followed_interests'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'user_account/get'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'user_following/get'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'user_websites/get'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'verify_website/update'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'website_verification/get'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'boards_user_follows/list' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'follow_user/update' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'followers/list' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'linked_business_accounts/get' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'unverify_website/delete' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'user_account/analytics' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'user_account/analytics/top_pins' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'user_account/analytics/top_video_pins' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'user_account/followed_interests' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'user_account/get' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'user_following/get' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'user_websites/get' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'verify_website/update' = OperationID,
                     api_key_handler = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, "authorization", Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'website_verification/get' = OperationID,
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
content_types_accepted(Req, #state{operation_id = 'boards_user_follows/list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'follow_user/update'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'followers/list'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'linked_business_accounts/get'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'unverify_website/delete'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'user_account/analytics'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'user_account/analytics/top_pins'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'user_account/analytics/top_video_pins'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'user_account/followed_interests'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'user_account/get'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'user_following/get'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'user_websites/get'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'verify_website/update'} = State) ->
    {[
      {<<"application/json">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'website_verification/get'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'boards_user_follows/list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'follow_user/update'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'followers/list'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'linked_business_accounts/get'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'unverify_website/delete'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'user_account/analytics'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'user_account/analytics/top_pins'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'user_account/analytics/top_video_pins'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'user_account/followed_interests'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'user_account/get'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'user_following/get'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'user_websites/get'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'verify_website/update'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'website_verification/get'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'boards_user_follows/list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'follow_user/update'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'followers/list'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'linked_business_accounts/get'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'unverify_website/delete'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'user_account/analytics'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'user_account/analytics/top_pins'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'user_account/analytics/top_video_pins'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'user_account/followed_interests'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'user_account/get'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'user_following/get'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'user_websites/get'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'verify_website/update'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'website_verification/get'} = State) ->
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
    {Res, Req1, Context1} = Handler(userAccount, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    {cowboy_req:resp_body(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(userAccount, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
