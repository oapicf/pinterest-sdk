-module(openapi_delete_business_membership_200_response).

-export([encode/1]).

-export_type([openapi_delete_business_membership_200_response/0]).

-type openapi_delete_business_membership_200_response() ::
    #{ 'deleted_members' => list()
     }.

encode(#{ 'deleted_members' := DeletedMembers
        }) ->
    #{ 'deleted_members' => DeletedMembers
     }.
