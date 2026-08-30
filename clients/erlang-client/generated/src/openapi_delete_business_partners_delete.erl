-module(openapi_delete_business_partners_delete).

-export([encode/1]).

-export_type([openapi_delete_business_partners_delete/0]).

-type openapi_delete_business_partners_delete() ::
    #{ 'partner_ids' := list(),
       'partner_type' => openapi_nullable_partner_type:openapi_nullable_partner_type()
     }.

encode(#{ 'partner_ids' := PartnerIds,
          'partner_type' := PartnerType
        }) ->
    #{ 'partner_ids' => PartnerIds,
       'partner_type' => PartnerType
     }.
