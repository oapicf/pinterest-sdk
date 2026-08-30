-module(openapi_delete_partner_asset_access_item).

-export([encode/1]).

-export_type([openapi_delete_partner_asset_access_item/0]).

-type openapi_delete_partner_asset_access_item() ::
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
