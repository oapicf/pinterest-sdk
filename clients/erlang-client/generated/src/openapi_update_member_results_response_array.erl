-module(openapi_update_member_results_response_array).

-export([encode/1]).

-export_type([openapi_update_member_results_response_array/0]).

-type openapi_update_member_results_response_array() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
