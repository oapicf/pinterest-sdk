-module(openapi_supplemental_items_batch_response).

-include("openapi.hrl").

-export([openapi_supplemental_items_batch_response/0]).

-export([openapi_supplemental_items_batch_response/1]).

-export_type([openapi_supplemental_items_batch_response/0]).

-type openapi_supplemental_items_batch_response() ::
  [ {'batch_id', binary() }
  | {'completed_time', datetime() }
  | {'created_time', datetime() }
  | {'operation_results', list(openapi_supplemental_operation_result:openapi_supplemental_operation_result()) }
  | {'status', openapi_supplemental_item_batch_operation_status:openapi_supplemental_item_batch_operation_status() }
  ].


openapi_supplemental_items_batch_response() ->
    openapi_supplemental_items_batch_response([]).

openapi_supplemental_items_batch_response(Fields) ->
  Default = [ {'batch_id', binary() }
            , {'completed_time', datetime() }
            , {'created_time', datetime() }
            , {'operation_results', list(openapi_supplemental_operation_result:openapi_supplemental_operation_result()) }
            , {'status', openapi_supplemental_item_batch_operation_status:openapi_supplemental_item_batch_operation_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

