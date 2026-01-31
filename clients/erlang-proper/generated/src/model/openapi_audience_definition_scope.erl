-module(openapi_audience_definition_scope).

-include("openapi.hrl").

-export([openapi_audience_definition_scope/0]).

-export([openapi_audience_definition_scope/1]).

-export_type([openapi_audience_definition_scope/0]).

-type openapi_audience_definition_scope() ::
  [ {'scope', binary() }
  ].


openapi_audience_definition_scope() ->
    openapi_audience_definition_scope([]).

openapi_audience_definition_scope(Fields) ->
  Default = [ {'scope', elements([<<"PARTNER">>, <<"PINTEREST">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

