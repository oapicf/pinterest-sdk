-module(openapi_invite_status).

-include("openapi.hrl").

-export([openapi_invite_status/0]).

-export_type([openapi_invite_status/0]).

-type openapi_invite_status() ::
  binary().

openapi_invite_status() ->
  elements([<<"PENDING">>, <<"ACCEPTED">>, <<"DECLINED">>, <<"CANCELLED">>, <<"EXPIRED">>]).

