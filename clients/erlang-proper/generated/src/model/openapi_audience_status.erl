-module(openapi_audience_status).

-include("openapi.hrl").

-export([openapi_audience_status/0]).

-export_type([openapi_audience_status/0]).

-type openapi_audience_status() ::
  binary().

openapi_audience_status() ->
  elements([<<"INITIALIZING">>, <<"READY">>, <<"TOO_SMALL">>, <<"ELIGIBLE">>, <<"PERSONAS_INELIGIBLE_SIZE">>, <<"PERSONAS_INITIALIZING">>]).

