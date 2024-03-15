-module(openapi_audience_demographic_value).

-include("openapi.hrl").

-export([openapi_audience_demographic_value/0]).

-export([openapi_audience_demographic_value/1]).

-export_type([openapi_audience_demographic_value/0]).

-type openapi_audience_demographic_value() ::
  [ {'key', binary() }
  | {'name', binary() }
  | {'ratio', integer() }
  ].


openapi_audience_demographic_value() ->
    openapi_audience_demographic_value([]).

openapi_audience_demographic_value(Fields) ->
  Default = [ {'key', binary() }
            , {'name', binary() }
            , {'ratio', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

