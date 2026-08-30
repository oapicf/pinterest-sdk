-module(openapi_custom_conversion_event_metrics).

-include("openapi.hrl").

-export([openapi_custom_conversion_event_metrics/0]).

-export([openapi_custom_conversion_event_metrics/1]).

-export_type([openapi_custom_conversion_event_metrics/0]).

-type openapi_custom_conversion_event_metrics() ::
  [ {'custom_event_metrics_type', openapi_ade_column_type:openapi_ade_column_type() }
  | {'custom_event_name', binary() }
  ].


openapi_custom_conversion_event_metrics() ->
    openapi_custom_conversion_event_metrics([]).

openapi_custom_conversion_event_metrics(Fields) ->
  Default = [ {'custom_event_metrics_type', openapi_ade_column_type:openapi_ade_column_type() }
            , {'custom_event_name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

