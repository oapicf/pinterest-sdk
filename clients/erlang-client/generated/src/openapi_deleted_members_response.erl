-module(openapi_deleted_members_response).

-export([encode/1]).

-export_type([openapi_deleted_members_response/0]).

-type openapi_deleted_members_response() ::
    #{ 'deleted_members' => list()
     }.

encode(#{ 'deleted_members' := DeletedMembers
        }) ->
    #{ 'deleted_members' => DeletedMembers
     }.
