-module(openapi_catalogs_hotel_items_batch).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_items_batch/0]).

-export([openapi_catalogs_hotel_items_batch/1]).

-export_type([openapi_catalogs_hotel_items_batch/0]).

-type openapi_catalogs_hotel_items_batch() ::
  [ {'batch_id', binary() }
  | {'created_time', datetime() }
  | {'completed_time', datetime() }
  | {'status', openapi_batch_operation_status:openapi_batch_operation_status() }
  | {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'items', list(openapi_hotel_processing_record:openapi_hotel_processing_record()) }
  ].


openapi_catalogs_hotel_items_batch() ->
    openapi_catalogs_hotel_items_batch([]).

openapi_catalogs_hotel_items_batch(Fields) ->
  Default = [ {'batch_id', binary() }
            , {'created_time', datetime() }
            , {'completed_time', datetime() }
            , {'status', openapi_batch_operation_status:openapi_batch_operation_status() }
            , {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'items', list(openapi_hotel_processing_record:openapi_hotel_processing_record()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

