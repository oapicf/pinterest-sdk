-module(openapi_conversion_objective_type).

-include("openapi.hrl").

-export([openapi_conversion_objective_type/0]).

-export_type([openapi_conversion_objective_type/0]).

-type openapi_conversion_objective_type() ::
  binary().

openapi_conversion_objective_type() ->
  elements([<<"AWARENESS">>, <<"CONSIDERATION">>, <<"WEB_CONVERSION">>, <<"CATALOG_SALES">>, <<"VIDEO_COMPLETION">>, <<"APP_INSTALL">>, <<"SALES">>, <<"LEADS">>, <<"CTV_CONSIDERATION">>]).

