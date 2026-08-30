-module(openapi_update_business_memberships_response).

-export([encode/1]).

-export_type([openapi_update_business_memberships_response/0]).

-type openapi_update_business_memberships_response() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
