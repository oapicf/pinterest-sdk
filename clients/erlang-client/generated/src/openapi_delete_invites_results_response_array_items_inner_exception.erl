-module(openapi_delete_invites_results_response_array_items_inner_exception).

-export([encode/1]).

-export_type([openapi_delete_invites_results_response_array_items_inner_exception/0]).

-type openapi_delete_invites_results_response_array_items_inner_exception() ::
    #{ 'invite_id' => binary(),
       'message' => binary()
     }.

encode(#{ 'invite_id' := InviteId,
          'message' := Message
        }) ->
    #{ 'invite_id' => InviteId,
       'message' => Message
     }.
