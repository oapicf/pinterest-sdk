-module(openapi_numeric_filter_operator_type).

-include("openapi.hrl").

-export([openapi_numeric_filter_operator_type/0]).

-export_type([openapi_numeric_filter_operator_type/0]).

-type openapi_numeric_filter_operator_type() ::
  binary().

openapi_numeric_filter_operator_type() ->
  elements([<<"GREATER_THAN">>, <<"GREATER_THAN_OR_EQUALS">>, <<"LESS_THAN">>, <<"LESS_THAN_OR_EQUALS">>]).

