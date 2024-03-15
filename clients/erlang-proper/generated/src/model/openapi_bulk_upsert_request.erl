-module(openapi_bulk_upsert_request).

-include("openapi.hrl").

-export([openapi_bulk_upsert_request/0]).

-export([openapi_bulk_upsert_request/1]).

-export_type([openapi_bulk_upsert_request/0]).

-type openapi_bulk_upsert_request() ::
  [ {'create', openapi_bulk_upsert_request_create:openapi_bulk_upsert_request_create() }
  | {'update', openapi_bulk_upsert_request_update:openapi_bulk_upsert_request_update() }
  ].


openapi_bulk_upsert_request() ->
    openapi_bulk_upsert_request([]).

openapi_bulk_upsert_request(Fields) ->
  Default = [ {'create', openapi_bulk_upsert_request_create:openapi_bulk_upsert_request_create() }
            , {'update', openapi_bulk_upsert_request_update:openapi_bulk_upsert_request_update() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

