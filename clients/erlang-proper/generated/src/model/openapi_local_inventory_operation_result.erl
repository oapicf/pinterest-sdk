-module(openapi_local_inventory_operation_result).

-include("openapi.hrl").

-export([openapi_local_inventory_operation_result/0]).

-export([openapi_local_inventory_operation_result/1]).

-export_type([openapi_local_inventory_operation_result/0]).

-type openapi_local_inventory_operation_result() ::
  [ {'errors', list(openapi_supplemental_item_validation_event:openapi_supplemental_item_validation_event()) }
  | {'item_id', binary() }
  | {'status', openapi_supplemental_item_processing_status:openapi_supplemental_item_processing_status() }
  | {'store_code', binary() }
  | {'supplemental_type', binary() }
  | {'warnings', list(openapi_supplemental_item_validation_event:openapi_supplemental_item_validation_event()) }
  ].


openapi_local_inventory_operation_result() ->
    openapi_local_inventory_operation_result([]).

openapi_local_inventory_operation_result(Fields) ->
  Default = [ {'errors', list(openapi_supplemental_item_validation_event:openapi_supplemental_item_validation_event()) }
            , {'item_id', binary() }
            , {'status', openapi_supplemental_item_processing_status:openapi_supplemental_item_processing_status() }
            , {'store_code', binary() }
            , {'supplemental_type', elements([<<"LOCAL_INVENTORY">>]) }
            , {'warnings', list(openapi_supplemental_item_validation_event:openapi_supplemental_item_validation_event()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

