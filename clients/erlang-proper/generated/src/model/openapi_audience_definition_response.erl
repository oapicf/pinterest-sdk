-module(openapi_audience_definition_response).

-include("openapi.hrl").

-export([openapi_audience_definition_response/0]).

-export([openapi_audience_definition_response/1]).

-export_type([openapi_audience_definition_response/0]).

-type openapi_audience_definition_response() ::
  [ {'items', list(openapi_audience_definition:openapi_audience_definition()) }
  ].


openapi_audience_definition_response() ->
    openapi_audience_definition_response([]).

openapi_audience_definition_response(Fields) ->
  Default = [ {'items', list(openapi_audience_definition:openapi_audience_definition()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

