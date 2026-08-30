-module(openapi_label_status_bulk_update).

-include("openapi.hrl").

-export([openapi_label_status_bulk_update/0]).

-export_type([openapi_label_status_bulk_update/0]).

-type openapi_label_status_bulk_update() ::
  binary().

openapi_label_status_bulk_update() ->
  elements([<<"ARCHIVED">>]).

