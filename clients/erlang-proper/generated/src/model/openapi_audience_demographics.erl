-module(openapi_audience_demographics).

-include("openapi.hrl").

-export([openapi_audience_demographics/0]).

-export([openapi_audience_demographics/1]).

-export_type([openapi_audience_demographics/0]).

-type openapi_audience_demographics() ::
  [ {'ages', list(openapi_audience_demographic_value:openapi_audience_demographic_value()) }
  | {'genders', list(openapi_audience_demographic_value:openapi_audience_demographic_value()) }
  | {'devices', list(openapi_audience_demographic_value:openapi_audience_demographic_value()) }
  | {'metros', list(openapi_audience_demographic_value:openapi_audience_demographic_value()) }
  | {'countries', list(openapi_audience_demographic_value:openapi_audience_demographic_value()) }
  ].


openapi_audience_demographics() ->
    openapi_audience_demographics([]).

openapi_audience_demographics(Fields) ->
  Default = [ {'ages', list(openapi_audience_demographic_value:openapi_audience_demographic_value()) }
            , {'genders', list(openapi_audience_demographic_value:openapi_audience_demographic_value()) }
            , {'devices', list(openapi_audience_demographic_value:openapi_audience_demographic_value()) }
            , {'metros', list(openapi_audience_demographic_value:openapi_audience_demographic_value()) }
            , {'countries', list(openapi_audience_demographic_value:openapi_audience_demographic_value()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

