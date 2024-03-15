-module(openapi_bulk_upsert_status).

-include("openapi.hrl").

-export([openapi_bulk_upsert_status/0]).

-export_type([openapi_bulk_upsert_status/0]).

-type openapi_bulk_upsert_status() ::
  binary().

openapi_bulk_upsert_status() ->
  elements([<<"RUNNING">>, <<"SUCCEEDED">>, <<"FAILED">>]).

