-module(openapi_bulk_upsert_response).

-include("openapi.hrl").

-export([openapi_bulk_upsert_response/0]).

-export([openapi_bulk_upsert_response/1]).

-export_type([openapi_bulk_upsert_response/0]).

-type openapi_bulk_upsert_response() ::
  [ {'request_id', binary() }
  ].


openapi_bulk_upsert_response() ->
    openapi_bulk_upsert_response([]).

openapi_bulk_upsert_response(Fields) ->
  Default = [ {'request_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

