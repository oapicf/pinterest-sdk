-module(openapi_delete_partner_asset_access_body_accesses_inner).

-export([encode/1]).

-export_type([openapi_delete_partner_asset_access_body_accesses_inner/0]).

-type openapi_delete_partner_asset_access_body_accesses_inner() ::
    #{ 'partner_id' := binary(),
       'asset_id' := binary(),
       'partner_type' => binary()
     }.

encode(#{ 'partner_id' := PartnerId,
          'asset_id' := AssetId,
          'partner_type' := PartnerType
        }) ->
    #{ 'partner_id' => PartnerId,
       'asset_id' => AssetId,
       'partner_type' => PartnerType
     }.
