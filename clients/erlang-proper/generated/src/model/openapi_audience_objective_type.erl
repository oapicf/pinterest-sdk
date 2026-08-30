-module(openapi_audience_objective_type).

-include("openapi.hrl").

-export([openapi_audience_objective_type/0]).

-export_type([openapi_audience_objective_type/0]).

-type openapi_audience_objective_type() ::
  binary().

openapi_audience_objective_type() ->
  elements([<<"AWARENESS">>, <<"CONSIDERATION">>, <<"WEB_CONVERSION">>, <<"CATALOG_SALES">>, <<"VIDEO_COMPLETION">>, <<"SALES">>]).

