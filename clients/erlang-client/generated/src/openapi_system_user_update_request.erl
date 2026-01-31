-module(openapi_system_user_update_request).

-export([encode/1]).

-export_type([openapi_system_user_update_request/0]).

-type openapi_system_user_update_request() ::
    #{ 'name' := binary()
     }.

encode(#{ 'name' := Name
        }) ->
    #{ 'name' => Name
     }.
