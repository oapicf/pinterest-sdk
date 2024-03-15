-module(openapi_get_audiences_order_by).

-include("openapi.hrl").

-export([openapi_get_audiences_order_by/0]).

-export_type([openapi_get_audiences_order_by/0]).

-type openapi_get_audiences_order_by() ::
  binary().

openapi_get_audiences_order_by() ->
  elements([<<"NONE">>, <<"ID">>, <<"SIZE">>, <<"CREATION_DATE">>, <<"UPDATED_TIME">>, <<"NAME">>, <<"STATUS">>, <<"TYPE">>]).

