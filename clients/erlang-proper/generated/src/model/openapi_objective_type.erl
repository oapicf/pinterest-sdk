-module(openapi_objective_type).

-include("openapi.hrl").

-export([openapi_objective_type/0]).

-export_type([openapi_objective_type/0]).

-type openapi_objective_type() ::
  binary().

openapi_objective_type() ->
  elements([<<"AWARENESS">>, <<"CONSIDERATION">>, <<"VIDEO_VIEW">>, <<"WEB_CONVERSION">>, <<"CATALOG_SALES">>, <<"WEB_SESSIONS">>]).

