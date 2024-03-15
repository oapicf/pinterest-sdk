-module(openapi_hotel_processing_record).

-include("openapi.hrl").

-export([openapi_hotel_processing_record/0]).

-export([openapi_hotel_processing_record/1]).

-export_type([openapi_hotel_processing_record/0]).

-type openapi_hotel_processing_record() ::
  [ {'hotel_id', binary() }
  | {'errors', list(openapi_item_validation_event:openapi_item_validation_event()) }
  | {'warnings', list(openapi_item_validation_event:openapi_item_validation_event()) }
  | {'status', openapi_item_processing_status:openapi_item_processing_status() }
  ].


openapi_hotel_processing_record() ->
    openapi_hotel_processing_record([]).

openapi_hotel_processing_record(Fields) ->
  Default = [ {'hotel_id', binary() }
            , {'errors', list(openapi_item_validation_event:openapi_item_validation_event()) }
            , {'warnings', list(openapi_item_validation_event:openapi_item_validation_event()) }
            , {'status', openapi_item_processing_status:openapi_item_processing_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

