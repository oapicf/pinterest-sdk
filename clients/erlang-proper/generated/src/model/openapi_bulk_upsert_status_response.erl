-module(openapi_bulk_upsert_status_response).

-include("openapi.hrl").

-export([openapi_bulk_upsert_status_response/0]).

-export([openapi_bulk_upsert_status_response/1]).

-export_type([openapi_bulk_upsert_status_response/0]).

-type openapi_bulk_upsert_status_response() ::
  [ {'status', openapi_bulk_upsert_status:openapi_bulk_upsert_status() }
  | {'result_url', binary() }
  ].


openapi_bulk_upsert_status_response() ->
    openapi_bulk_upsert_status_response([]).

openapi_bulk_upsert_status_response(Fields) ->
  Default = [ {'status', openapi_bulk_upsert_status:openapi_bulk_upsert_status() }
            , {'result_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

