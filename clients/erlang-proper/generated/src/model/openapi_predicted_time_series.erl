-module(openapi_predicted_time_series).

-include("openapi.hrl").

-export([openapi_predicted_time_series/0]).

-export([openapi_predicted_time_series/1]).

-export_type([openapi_predicted_time_series/0]).

-type openapi_predicted_time_series() ::
  [ {'date', date() }
  ].


openapi_predicted_time_series() ->
    openapi_predicted_time_series([]).

openapi_predicted_time_series(Fields) ->
  Default = [ {'date', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

