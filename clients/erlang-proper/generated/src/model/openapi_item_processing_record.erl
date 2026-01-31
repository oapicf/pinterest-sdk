-module(openapi_item_processing_record).

-include("openapi.hrl").

-export([openapi_item_processing_record/0]).

-export([openapi_item_processing_record/1]).

-export_type([openapi_item_processing_record/0]).

-type openapi_item_processing_record() ::
  [ {'errors', list(openapi_item_validation_event:openapi_item_validation_event()) }
  | {'item_id', binary() }
  | {'status', openapi_item_processing_status:openapi_item_processing_status() }
  | {'warnings', list(openapi_item_validation_event:openapi_item_validation_event()) }
  ].


openapi_item_processing_record() ->
    openapi_item_processing_record([]).

openapi_item_processing_record(Fields) ->
  Default = [ {'errors', list(openapi_item_validation_event:openapi_item_validation_event()) }
            , {'item_id', binary() }
            , {'status', openapi_item_processing_status:openapi_item_processing_status() }
            , {'warnings', list(openapi_item_validation_event:openapi_item_validation_event()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

