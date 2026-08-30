-module(openapi_optimization_type).

-include("openapi.hrl").

-export([openapi_optimization_type/0]).

-export_type([openapi_optimization_type/0]).

-type openapi_optimization_type() ::
  binary().

openapi_optimization_type() ->
  elements([<<"CLICKTHROUGH">>, <<"IMPRESSION">>, <<"WEB_CONVERSION">>, <<"ROAS">>, <<"OUTBOUND_CLICK">>]).

