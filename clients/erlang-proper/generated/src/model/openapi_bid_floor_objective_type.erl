-module(openapi_bid_floor_objective_type).

-include("openapi.hrl").

-export([openapi_bid_floor_objective_type/0]).

-export_type([openapi_bid_floor_objective_type/0]).

-type openapi_bid_floor_objective_type() ::
  binary().

openapi_bid_floor_objective_type() ->
  elements([<<"AWARENESS">>, <<"CONSIDERATION">>, <<"WEB_CONVERSION">>, <<"CATALOG_SALES">>, <<"VIDEO_COMPLETION">>, <<"SALES">>]).

