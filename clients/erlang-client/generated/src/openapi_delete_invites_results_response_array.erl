-module(openapi_delete_invites_results_response_array).

-export([encode/1]).

-export_type([openapi_delete_invites_results_response_array/0]).

-type openapi_delete_invites_results_response_array() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
