-module(openapi_grid_click_type).

-include("openapi.hrl").

-export([openapi_grid_click_type/0]).

-export_type([openapi_grid_click_type/0]).

-type openapi_grid_click_type() ::
  binary().

openapi_grid_click_type() ->
  elements([<<"CLOSEUP">>, <<"DIRECT_TO_DESTINATION">>]).

