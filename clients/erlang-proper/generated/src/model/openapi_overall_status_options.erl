-module(openapi_overall_status_options).

-include("openapi.hrl").

-export([openapi_overall_status_options/0]).

-export_type([openapi_overall_status_options/0]).

-type openapi_overall_status_options() ::
  binary().

openapi_overall_status_options() ->
  elements([<<"NEEDS_IMPROVEMENT">>, <<"FAIR">>, <<"GOOD">>]).

