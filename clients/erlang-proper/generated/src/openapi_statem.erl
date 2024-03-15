-module(openapi_statem).

-behaviour(proper_statem).

-include("openapi.hrl").
-include_lib("proper/include/proper_common.hrl").
-include_lib("stdlib/include/assert.hrl").

-compile(export_all).
-compile(nowarn_export_all).

-include("openapi_statem.hrl").

%%==============================================================================
%% The statem's property
%%==============================================================================

prop_main() ->
  setup(),
  ?FORALL( Cmds
         , proper_statem:commands(?MODULE)
         , begin
             cleanup(),
             { History
             , State
             , Result
             } = proper_statem:run_commands(?MODULE, Cmds),
             ?WHENFAIL(
                io:format("History: ~p\nState: ~p\nResult: ~p\nCmds: ~p\n",
                          [ History
                          , State
                          , Result
                          , proper_statem:command_names(Cmds)
                          ]),
                proper:aggregate( proper_statem:command_names(Cmds)
                                , Result =:= ok
                                )
               )
           end
         ).

%%==============================================================================
%% Setup
%%==============================================================================

setup() -> ok.

%%==============================================================================
%% Cleanup
%%==============================================================================

cleanup() -> ok.

%%==============================================================================
%% Initial State
%%==============================================================================

initial_state() -> #{}.

%%==============================================================================
%% boards_user_follows/list
%%==============================================================================

boards_user_follows/list() ->
  openapi_api:boards_user_follows/list().

boards_user_follows/list_args(_S) ->
  [].

%%==============================================================================
%% follow_user/update
%%==============================================================================

follow_user/update(Username, OpenapiFollowUserRequest) ->
  openapi_api:follow_user/update(Username, OpenapiFollowUserRequest).

follow_user/update_args(_S) ->
  [binary(), openapi_follow_user_request:openapi_follow_user_request()].

%%==============================================================================
%% followers/list
%%==============================================================================

followers/list() ->
  openapi_api:followers/list().

followers/list_args(_S) ->
  [].

%%==============================================================================
%% linked_business_accounts/get
%%==============================================================================

linked_business_accounts/get() ->
  openapi_api:linked_business_accounts/get().

linked_business_accounts/get_args(_S) ->
  [].

%%==============================================================================
%% unverify_website/delete
%%==============================================================================

unverify_website/delete(Website) ->
  openapi_api:unverify_website/delete(Website).

unverify_website/delete_args(_S) ->
  [binary()].

%%==============================================================================
%% user_account/analytics
%%==============================================================================

user_account/analytics(StartDate, EndDate) ->
  openapi_api:user_account/analytics(StartDate, EndDate).

user_account/analytics_args(_S) ->
  [date(), date()].

%%==============================================================================
%% user_account/analytics/top_pins
%%==============================================================================

user_account/analytics/top_pins(StartDate, EndDate, SortBy) ->
  openapi_api:user_account/analytics/top_pins(StartDate, EndDate, SortBy).

user_account/analytics/top_pins_args(_S) ->
  [date(), date(), binary()].

%%==============================================================================
%% user_account/analytics/top_video_pins
%%==============================================================================

user_account/analytics/top_video_pins(StartDate, EndDate, SortBy) ->
  openapi_api:user_account/analytics/top_video_pins(StartDate, EndDate, SortBy).

user_account/analytics/top_video_pins_args(_S) ->
  [date(), date(), binary()].

%%==============================================================================
%% user_account/followed_interests
%%==============================================================================

user_account/followed_interests(Username) ->
  openapi_api:user_account/followed_interests(Username).

user_account/followed_interests_args(_S) ->
  [binary()].

%%==============================================================================
%% user_account/get
%%==============================================================================

user_account/get() ->
  openapi_api:user_account/get().

user_account/get_args(_S) ->
  [].

%%==============================================================================
%% user_following/get
%%==============================================================================

user_following/get() ->
  openapi_api:user_following/get().

user_following/get_args(_S) ->
  [].

%%==============================================================================
%% user_websites/get
%%==============================================================================

user_websites/get() ->
  openapi_api:user_websites/get().

user_websites/get_args(_S) ->
  [].

%%==============================================================================
%% verify_website/update
%%==============================================================================

verify_website/update(OpenapiUserWebsiteVerifyRequest) ->
  openapi_api:verify_website/update(OpenapiUserWebsiteVerifyRequest).

verify_website/update_args(_S) ->
  [openapi_user_website_verify_request:openapi_user_website_verify_request()].

%%==============================================================================
%% website_verification/get
%%==============================================================================

website_verification/get() ->
  openapi_api:website_verification/get().

website_verification/get_args(_S) ->
  [].

