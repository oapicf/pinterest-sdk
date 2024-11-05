-module(openapi_delete_partners_request).

-export([encode/1]).

-export_type([openapi_delete_partners_request/0]).

-type openapi_delete_partners_request() ::
    #{ 'partner_ids' := list(),
       'partner_type' => binary()
     }.

encode(#{ 'partner_ids' := PartnerIds,
          'partner_type' := PartnerType
        }) ->
    #{ 'partner_ids' => PartnerIds,
       'partner_type' => PartnerType
     }.
