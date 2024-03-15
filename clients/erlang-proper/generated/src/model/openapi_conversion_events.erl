-module(openapi_conversion_events).

-include("openapi.hrl").

-export([openapi_conversion_events/0]).

-export([openapi_conversion_events/1]).

-export_type([openapi_conversion_events/0]).

-type openapi_conversion_events() ::
  [ {'data', list(openapi_conversion_events_data_inner:openapi_conversion_events_data_inner()) }
  ].


openapi_conversion_events() ->
    openapi_conversion_events([]).

openapi_conversion_events(Fields) ->
  Default = [ {'data', list(openapi_conversion_events_data_inner:openapi_conversion_events_data_inner(), 1, 1000) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

