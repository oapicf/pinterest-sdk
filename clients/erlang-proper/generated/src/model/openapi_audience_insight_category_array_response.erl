-module(openapi_audience_insight_category_array_response).

-include("openapi.hrl").

-export([openapi_audience_insight_category_array_response/0]).

-export([openapi_audience_insight_category_array_response/1]).

-export_type([openapi_audience_insight_category_array_response/0]).

-type openapi_audience_insight_category_array_response() ::
  [ {'items', list(openapi_audience_insight_category_common:openapi_audience_insight_category_common()) }
  ].


openapi_audience_insight_category_array_response() ->
    openapi_audience_insight_category_array_response([]).

openapi_audience_insight_category_array_response(Fields) ->
  Default = [ {'items', list(openapi_audience_insight_category_common:openapi_audience_insight_category_common()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

