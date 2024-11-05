-module(openapi_create_invites_results_response_array_items_inner_invite).

-export([encode/1]).

-export_type([openapi_create_invites_results_response_array_items_inner_invite/0]).

-type openapi_create_invites_results_response_array_items_inner_invite() ::
    #{ 'id' => binary(),
       'user' => openapi_business_access_user_summary:openapi_business_access_user_summary()
     }.

encode(#{ 'id' := Id,
          'user' := User
        }) ->
    #{ 'id' => Id,
       'user' => User
     }.
