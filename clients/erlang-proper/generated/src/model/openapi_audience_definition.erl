-module(openapi_audience_definition).

-include("openapi.hrl").

-export([openapi_audience_definition/0]).

-export([openapi_audience_definition/1]).

-export_type([openapi_audience_definition/0]).

-type openapi_audience_definition() ::
  [ {'date', binary() }
  | {'type', binary() }
  | {'scope', binary() }
  ].


openapi_audience_definition() ->
    openapi_audience_definition([]).

openapi_audience_definition(Fields) ->
  Default = [ {'date', binary() }
            , {'type', binary() }
            , {'scope', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

