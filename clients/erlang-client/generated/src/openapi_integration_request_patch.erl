-module(openapi_integration_request_patch).

-export([encode/1]).

-export_type([openapi_integration_request_patch/0]).

-type openapi_integration_request_patch() ::
    #{ 'connected_merchant_id' => binary(),
       'connected_advertiser_id' => binary(),
       'connected_lba_id' => binary(),
       'connected_tag_id' => binary(),
       'partner_access_token' => binary(),
       'partner_refresh_token' => binary(),
       'partner_primary_email' => binary(),
       'partner_access_token_expiry' => integer(),
       'partner_refresh_token_expiry' => integer(),
       'scopes' => binary(),
       'additional_id_1' => binary(),
       'partner_metadata' => binary()
     }.

encode(#{ 'connected_merchant_id' := ConnectedMerchantId,
          'connected_advertiser_id' := ConnectedAdvertiserId,
          'connected_lba_id' := ConnectedLbaId,
          'connected_tag_id' := ConnectedTagId,
          'partner_access_token' := PartnerAccessToken,
          'partner_refresh_token' := PartnerRefreshToken,
          'partner_primary_email' := PartnerPrimaryEmail,
          'partner_access_token_expiry' := PartnerAccessTokenExpiry,
          'partner_refresh_token_expiry' := PartnerRefreshTokenExpiry,
          'scopes' := Scopes,
          'additional_id_1' := AdditionalId1,
          'partner_metadata' := PartnerMetadata
        }) ->
    #{ 'connected_merchant_id' => ConnectedMerchantId,
       'connected_advertiser_id' => ConnectedAdvertiserId,
       'connected_lba_id' => ConnectedLbaId,
       'connected_tag_id' => ConnectedTagId,
       'partner_access_token' => PartnerAccessToken,
       'partner_refresh_token' => PartnerRefreshToken,
       'partner_primary_email' => PartnerPrimaryEmail,
       'partner_access_token_expiry' => PartnerAccessTokenExpiry,
       'partner_refresh_token_expiry' => PartnerRefreshTokenExpiry,
       'scopes' => Scopes,
       'additional_id_1' => AdditionalId1,
       'partner_metadata' => PartnerMetadata
     }.
