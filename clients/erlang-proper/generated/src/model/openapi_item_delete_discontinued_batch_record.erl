-module(openapi_item_delete_discontinued_batch_record).

-include("openapi.hrl").

-export([openapi_item_delete_discontinued_batch_record/0]).

-export([openapi_item_delete_discontinued_batch_record/1]).

-export_type([openapi_item_delete_discontinued_batch_record/0]).

-type openapi_item_delete_discontinued_batch_record() ::
  [ {'item_id', binary() }
  ].


openapi_item_delete_discontinued_batch_record() ->
    openapi_item_delete_discontinued_batch_record([]).

openapi_item_delete_discontinued_batch_record(Fields) ->
  Default = [ {'item_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

