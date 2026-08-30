-module(openapi_invite_filter_status).

-include("openapi.hrl").

-export([openapi_invite_filter_status/0]).

-export_type([openapi_invite_filter_status/0]).

-type openapi_invite_filter_status() ::
  binary().

openapi_invite_filter_status() ->
  elements([<<"PENDING">>, <<"EXPIRED">>]).

