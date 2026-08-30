-module(openapi_delivery_estimate_objective_type).

-include("openapi.hrl").

-export([openapi_delivery_estimate_objective_type/0]).

-export_type([openapi_delivery_estimate_objective_type/0]).

-type openapi_delivery_estimate_objective_type() ::
  binary().

openapi_delivery_estimate_objective_type() ->
  elements([<<"AWARENESS">>, <<"CONSIDERATION">>, <<"CATALOG_SALES">>, <<"WEB_CONVERSION">>]).

