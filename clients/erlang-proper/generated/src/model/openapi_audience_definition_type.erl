-module(openapi_audience_definition_type).

-include("openapi.hrl").

-export([openapi_audience_definition_type/0]).

-export([openapi_audience_definition_type/1]).

-export_type([openapi_audience_definition_type/0]).

-type openapi_audience_definition_type() ::
  [ {'scope', binary() }
  ].


openapi_audience_definition_type() ->
    openapi_audience_definition_type([]).

openapi_audience_definition_type(Fields) ->
  Default = [ {'scope', elements([<<"IMPRESSION_PLUS_ENGAGEMENT">>, <<"ENGAGEMENT">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

