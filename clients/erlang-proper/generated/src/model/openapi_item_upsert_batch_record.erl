-module(openapi_item_upsert_batch_record).

-include("openapi.hrl").

-export([openapi_item_upsert_batch_record/0]).

-export([openapi_item_upsert_batch_record/1]).

-export_type([openapi_item_upsert_batch_record/0]).

-type openapi_item_upsert_batch_record() ::
  [ {'item_id', binary() }
  | {'attributes', openapi_item_attributes_request:openapi_item_attributes_request() }
  ].


openapi_item_upsert_batch_record() ->
    openapi_item_upsert_batch_record([]).

openapi_item_upsert_batch_record(Fields) ->
  Default = [ {'item_id', binary() }
            , {'attributes', openapi_item_attributes_request:openapi_item_attributes_request() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

