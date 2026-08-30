-module(openapi_advertiser_defined_event_processing_record).

-include("openapi.hrl").

-export([openapi_advertiser_defined_event_processing_record/0]).

-export([openapi_advertiser_defined_event_processing_record/1]).

-export_type([openapi_advertiser_defined_event_processing_record/0]).

-type openapi_advertiser_defined_event_processing_record() ::
  [ {'exceptions', list(binary()) }
  | {'name', binary() }
  | {'status', binary() }
  ].


openapi_advertiser_defined_event_processing_record() ->
    openapi_advertiser_defined_event_processing_record([]).

openapi_advertiser_defined_event_processing_record(Fields) ->
  Default = [ {'exceptions', list(binary()) }
            , {'name', binary() }
            , {'status', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

