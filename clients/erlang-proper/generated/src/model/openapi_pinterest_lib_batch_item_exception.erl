-module(openapi_pinterest_lib_batch_item_exception).

-include("openapi.hrl").

-export([openapi_pinterest_lib_batch_item_exception/0]).

-export([openapi_pinterest_lib_batch_item_exception/1]).

-export_type([openapi_pinterest_lib_batch_item_exception/0]).

-type openapi_pinterest_lib_batch_item_exception() ::
  [ {'code', integer() }
  | {'message', binary() }
  ].


openapi_pinterest_lib_batch_item_exception() ->
    openapi_pinterest_lib_batch_item_exception([]).

openapi_pinterest_lib_batch_item_exception(Fields) ->
  Default = [ {'code', integer() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

