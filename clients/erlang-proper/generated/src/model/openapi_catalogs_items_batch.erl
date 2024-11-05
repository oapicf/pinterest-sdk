-module(openapi_catalogs_items_batch).

-include("openapi.hrl").

-export([openapi_catalogs_items_batch/0]).

-export([openapi_catalogs_items_batch/1]).

-export_type([openapi_catalogs_items_batch/0]).

-type openapi_catalogs_items_batch() ::
  [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'batch_id', binary() }
  | {'created_time', datetime() }
  | {'completed_time', datetime() }
  | {'status', openapi_batch_operation_status:openapi_batch_operation_status() }
  | {'items', list(openapi_creative_assets_processing_record:openapi_creative_assets_processing_record()) }
  ].


openapi_catalogs_items_batch() ->
    openapi_catalogs_items_batch([]).

openapi_catalogs_items_batch(Fields) ->
  Default = [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'batch_id', binary() }
            , {'created_time', datetime() }
            , {'completed_time', datetime() }
            , {'status', openapi_batch_operation_status:openapi_batch_operation_status() }
            , {'items', list(openapi_creative_assets_processing_record:openapi_creative_assets_processing_record()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

