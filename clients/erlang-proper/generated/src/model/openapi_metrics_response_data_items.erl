-module(openapi_metrics_response_data_items).

-include("openapi.hrl").

-export([openapi_metrics_response_data_items/0]).

-export([openapi_metrics_response_data_items/1]).

-export_type([openapi_metrics_response_data_items/0]).

-type openapi_metrics_response_data_items() ::
  [ {'metrics', map() }
  | {'targeting_type', binary() }
  | {'targeting_value', binary() }
  ].


openapi_metrics_response_data_items() ->
    openapi_metrics_response_data_items([]).

openapi_metrics_response_data_items(Fields) ->
  Default = [ {'metrics', map() }
            , {'targeting_type', binary() }
            , {'targeting_value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

