-module(openapi_audience_definition_response).

-export([encode/1]).

-export_type([openapi_audience_definition_response/0]).

-type openapi_audience_definition_response() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
