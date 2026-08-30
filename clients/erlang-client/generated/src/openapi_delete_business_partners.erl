-module(openapi_delete_business_partners).

-export([encode/1]).

-export_type([openapi_delete_business_partners/0]).

-type openapi_delete_business_partners() ::
    #{ 'deleted_partners' => list()
     }.

encode(#{ 'deleted_partners' := DeletedPartners
        }) ->
    #{ 'deleted_partners' => DeletedPartners
     }.
