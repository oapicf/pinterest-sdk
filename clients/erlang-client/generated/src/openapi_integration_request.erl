-module(openapi_integration_request).

-export([encode/1]).

-export_type([openapi_integration_request/0]).

-type openapi_integration_request() ::
    #{ 'additional_id_1' => binary(),
       'connected_advertiser_id' => binary(),
       'connected_lba_id' => binary(),
       'connected_merchant_id' => binary(),
       'connected_tag_id' => binary(),
       'external_business_id' => binary(),
       'partner_access_token' => binary(),
       'partner_access_token_expiry' => integer(),
       'partner_metadata' => binary(),
       'partner_primary_email' => binary(),
       'partner_refresh_token' => binary(),
       'partner_refresh_token_expiry' => integer(),
       'scopes' => binary()
     }.

encode(#{ 'additional_id_1' := AdditionalId1,
          'connected_advertiser_id' := ConnectedAdvertiserId,
          'connected_lba_id' := ConnectedLbaId,
          'connected_merchant_id' := ConnectedMerchantId,
          'connected_tag_id' := ConnectedTagId,
          'external_business_id' := ExternalBusinessId,
          'partner_access_token' := PartnerAccessToken,
          'partner_access_token_expiry' := PartnerAccessTokenExpiry,
          'partner_metadata' := PartnerMetadata,
          'partner_primary_email' := PartnerPrimaryEmail,
          'partner_refresh_token' := PartnerRefreshToken,
          'partner_refresh_token_expiry' := PartnerRefreshTokenExpiry,
          'scopes' := Scopes
        }) ->
    #{ 'additional_id_1' => AdditionalId1,
       'connected_advertiser_id' => ConnectedAdvertiserId,
       'connected_lba_id' => ConnectedLbaId,
       'connected_merchant_id' => ConnectedMerchantId,
       'connected_tag_id' => ConnectedTagId,
       'external_business_id' => ExternalBusinessId,
       'partner_access_token' => PartnerAccessToken,
       'partner_access_token_expiry' => PartnerAccessTokenExpiry,
       'partner_metadata' => PartnerMetadata,
       'partner_primary_email' => PartnerPrimaryEmail,
       'partner_refresh_token' => PartnerRefreshToken,
       'partner_refresh_token_expiry' => PartnerRefreshTokenExpiry,
       'scopes' => Scopes
     }.
