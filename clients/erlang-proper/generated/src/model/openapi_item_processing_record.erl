-module(openapi_item_processing_record).

-include("openapi.hrl").

-export([openapi_item_processing_record/0]).

-export([openapi_item_processing_record/1]).

-export_type([openapi_item_processing_record/0]).

-type openapi_item_processing_record() ::
  [ {'item_id', binary() }
  | {'errors', list(openapi_item_validation_event:openapi_item_validation_event()) }
  | {'warnings', list(openapi_item_validation_event:openapi_item_validation_event()) }
  | {'status', openapi_item_processing_status:openapi_item_processing_status() }
  ].


openapi_item_processing_record() ->
    openapi_item_processing_record([]).

openapi_item_processing_record(Fields) ->
  Default = [ {'item_id', binary() }
            , {'errors', list(openapi_item_validation_event:openapi_item_validation_event()) }
            , {'warnings', list(openapi_item_validation_event:openapi_item_validation_event()) }
            , {'status', openapi_item_processing_status:openapi_item_processing_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

