-module(openapi_local_inventory_items_batch).

-include("openapi.hrl").

-export([openapi_local_inventory_items_batch/0]).

-export([openapi_local_inventory_items_batch/1]).

-export_type([openapi_local_inventory_items_batch/0]).

-type openapi_local_inventory_items_batch() ::
  [ {'batch_id', binary() }
  | {'completed_time', datetime() }
  | {'created_time', datetime() }
  | {'operation_results', list(openapi_supplemental_operation_result:openapi_supplemental_operation_result()) }
  | {'status', openapi_supplemental_item_batch_operation_status:openapi_supplemental_item_batch_operation_status() }
  ].


openapi_local_inventory_items_batch() ->
    openapi_local_inventory_items_batch([]).

openapi_local_inventory_items_batch(Fields) ->
  Default = [ {'batch_id', binary() }
            , {'completed_time', datetime() }
            , {'created_time', datetime() }
            , {'operation_results', list(openapi_supplemental_operation_result:openapi_supplemental_operation_result()) }
            , {'status', openapi_supplemental_item_batch_operation_status:openapi_supplemental_item_batch_operation_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

