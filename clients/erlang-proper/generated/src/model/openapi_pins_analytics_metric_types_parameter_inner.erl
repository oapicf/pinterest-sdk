-module(openapi_pins_analytics_metric_types_parameter_inner).

-include("openapi.hrl").

-export([openapi_pins_analytics_metric_types_parameter_inner/0]).

-export([openapi_pins_analytics_metric_types_parameter_inner/1]).

-export_type([openapi_pins_analytics_metric_types_parameter_inner/0]).

-type openapi_pins_analytics_metric_types_parameter_inner() ::
  [ 
  ].


openapi_pins_analytics_metric_types_parameter_inner() ->
    openapi_pins_analytics_metric_types_parameter_inner([]).

openapi_pins_analytics_metric_types_parameter_inner(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

