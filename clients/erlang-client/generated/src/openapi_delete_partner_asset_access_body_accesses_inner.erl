-module(openapi_delete_partner_asset_access_body_accesses_inner).

-export([encode/1]).

-export_type([openapi_delete_partner_asset_access_body_accesses_inner/0]).

-type openapi_delete_partner_asset_access_body_accesses_inner() ::
    #{ 'asset_id' := binary(),
       'partner_id' := binary(),
       'partner_type' => binary()
     }.

encode(#{ 'asset_id' := AssetId,
          'partner_id' := PartnerId,
          'partner_type' := PartnerType
        }) ->
    #{ 'asset_id' => AssetId,
       'partner_id' => PartnerId,
       'partner_type' => PartnerType
     }.
