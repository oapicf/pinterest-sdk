-module(openapi_schedule_status).

-include("openapi.hrl").

-export([openapi_schedule_status/0]).

-export_type([openapi_schedule_status/0]).

-type openapi_schedule_status() ::
  binary().

openapi_schedule_status() ->
  elements([<<"DRAFT">>, <<"CREATED">>, <<"SCHEDULED">>, <<"ACTIVE">>, <<"COMPLETED">>, <<"FAILED">>, <<"CANCELED">>]).

