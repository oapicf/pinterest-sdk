-module(openapi_bulk_download).

-include("openapi.hrl").

-export([openapi_bulk_download/0]).

-export([openapi_bulk_download/1]).

-export_type([openapi_bulk_download/0]).

-type openapi_bulk_download() ::
  [ {'request_id', binary() }
  ].


openapi_bulk_download() ->
    openapi_bulk_download([]).

openapi_bulk_download(Fields) ->
  Default = [ {'request_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

