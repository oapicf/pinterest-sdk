-module(openapi_members_to_delete_body).

-export([encode/1]).

-export_type([openapi_members_to_delete_body/0]).

-type openapi_members_to_delete_body() ::
    #{ 'members' := list()
     }.

encode(#{ 'members' := Members
        }) ->
    #{ 'members' => Members
     }.
