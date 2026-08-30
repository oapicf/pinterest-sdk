-module(openapi_item_id_store_code_pair).

-include("openapi.hrl").

-export([openapi_item_id_store_code_pair/0]).

-export([openapi_item_id_store_code_pair/1]).

-export_type([openapi_item_id_store_code_pair/0]).

-type openapi_item_id_store_code_pair() ::
  [ {'item_id', binary() }
  | {'store_code', binary() }
  ].


openapi_item_id_store_code_pair() ->
    openapi_item_id_store_code_pair([]).

openapi_item_id_store_code_pair(Fields) ->
  Default = [ {'item_id', binary() }
            , {'store_code', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

