-module(openapi_audience_insight_category_array_response).

-export([encode/1]).

-export_type([openapi_audience_insight_category_array_response/0]).

-type openapi_audience_insight_category_array_response() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
