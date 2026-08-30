-module(openapi_filter_operator_type).

-include("openapi.hrl").

-export([openapi_filter_operator_type/0]).

-export_type([openapi_filter_operator_type/0]).

-type openapi_filter_operator_type() ::
  binary().

openapi_filter_operator_type() ->
  elements([<<"IS">>, <<"CONTAINS">>]).

