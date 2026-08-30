-module(openapi_audience_insights_scope_and_type_get_200_response).

-include("openapi.hrl").

-export([openapi_audience_insights_scope_and_type_get_200_response/0]).

-export([openapi_audience_insights_scope_and_type_get_200_response/1]).

-export_type([openapi_audience_insights_scope_and_type_get_200_response/0]).

-type openapi_audience_insights_scope_and_type_get_200_response() ::
  [ {'items', list(openapi_audience_definition:openapi_audience_definition()) }
  ].


openapi_audience_insights_scope_and_type_get_200_response() ->
    openapi_audience_insights_scope_and_type_get_200_response([]).

openapi_audience_insights_scope_and_type_get_200_response(Fields) ->
  Default = [ {'items', list(openapi_audience_definition:openapi_audience_definition()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

