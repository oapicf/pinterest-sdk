-module(openapi_invite_type).

-include("openapi.hrl").

-export([openapi_invite_type/0]).

-export_type([openapi_invite_type/0]).

-type openapi_invite_type() ::
  binary().

openapi_invite_type() ->
  elements([<<"MEMBER_INVITE">>, <<"PARTNER_INVITE">>, <<"PARTNER_REQUEST">>]).

