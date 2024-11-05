-module(openapi_delete_partners_response).

-export([encode/1]).

-export_type([openapi_delete_partners_response/0]).

-type openapi_delete_partners_response() ::
    #{ 'deleted_partners' => list()
     }.

encode(#{ 'deleted_partners' := DeletedPartners
        }) ->
    #{ 'deleted_partners' => DeletedPartners
     }.
