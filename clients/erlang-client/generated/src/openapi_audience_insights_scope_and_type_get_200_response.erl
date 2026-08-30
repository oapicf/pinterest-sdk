-module(openapi_audience_insights_scope_and_type_get_200_response).

-export([encode/1]).

-export_type([openapi_audience_insights_scope_and_type_get_200_response/0]).

-type openapi_audience_insights_scope_and_type_get_200_response() ::
    #{ 'items' := list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
