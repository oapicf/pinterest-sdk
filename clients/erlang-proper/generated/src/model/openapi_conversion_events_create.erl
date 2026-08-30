-module(openapi_conversion_events_create).

-include("openapi.hrl").

-export([openapi_conversion_events_create/0]).

-export([openapi_conversion_events_create/1]).

-export_type([openapi_conversion_events_create/0]).

-type openapi_conversion_events_create() ::
  [ {'data', list(openapi_conversion_events_data_items:openapi_conversion_events_data_items()) }
  ].


openapi_conversion_events_create() ->
    openapi_conversion_events_create([]).

openapi_conversion_events_create(Fields) ->
  Default = [ {'data', list(openapi_conversion_events_data_items:openapi_conversion_events_data_items(), 1, 1000) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

