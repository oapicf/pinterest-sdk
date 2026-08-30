-module(openapi_discount_status).

-include("openapi.hrl").

-export([openapi_discount_status/0]).

-export_type([openapi_discount_status/0]).

-type openapi_discount_status() ::
  binary().

openapi_discount_status() ->
  elements([<<"OTHER">>, <<"ACTIVE">>, <<"PAUSED">>, <<"SCHEDULED">>, <<"EXPIRED">>]).

