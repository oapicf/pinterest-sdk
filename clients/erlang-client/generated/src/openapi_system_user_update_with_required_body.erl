-module(openapi_system_user_update_with_required_body).

-export([encode/1]).

-export_type([openapi_system_user_update_with_required_body/0]).

-type openapi_system_user_update_with_required_body() ::
    #{ 'name' := binary()
     }.

encode(#{ 'name' := Name
        }) ->
    #{ 'name' => Name
     }.
