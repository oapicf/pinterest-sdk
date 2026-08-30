-module(openapi_store_metadata).

-include("openapi.hrl").

-export([openapi_store_metadata/0]).

-export([openapi_store_metadata/1]).

-export_type([openapi_store_metadata/0]).

-type openapi_store_metadata() ::
  [ {'geohash', binary() }
  | {'latitude', float() }
  | {'longitude', float() }
  | {'store_code', binary() }
  | {'store_id', binary() }
  | {'store_name', binary() }
  ].


openapi_store_metadata() ->
    openapi_store_metadata([]).

openapi_store_metadata(Fields) ->
  Default = [ {'geohash', binary() }
            , {'latitude', float() }
            , {'longitude', float() }
            , {'store_code', binary() }
            , {'store_id', binary() }
            , {'store_name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

