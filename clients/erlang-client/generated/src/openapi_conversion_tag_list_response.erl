-module(openapi_conversion_tag_list_response).

-export([encode/1]).

-export_type([openapi_conversion_tag_list_response/0]).

-type openapi_conversion_tag_list_response() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
