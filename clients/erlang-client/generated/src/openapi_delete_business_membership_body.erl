-module(openapi_delete_business_membership_body).

-export([encode/1]).

-export_type([openapi_delete_business_membership_body/0]).

-type openapi_delete_business_membership_body() ::
    #{ 'members' := list()
     }.

encode(#{ 'members' := Members
        }) ->
    #{ 'members' => Members
     }.
