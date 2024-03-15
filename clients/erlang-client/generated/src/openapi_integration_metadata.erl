-module(openapi_integration_metadata).

-export([encode/1]).

-export_type([openapi_integration_metadata/0]).

-type openapi_integration_metadata() ::
    #{ 'id' => binary(),
       'external_business_id' => binary(),
       'connected_merchant_id' => binary(),
       'connected_user_id' => binary(),
       'connected_advertiser_id' => binary(),
       'connected_lba_id' => binary(),
       'connected_tag_id' => binary(),
       'partner_access_token_expiry' => integer(),
       'partner_refresh_token_expiry' => integer(),
       'scopes' => binary(),
       'created_timestamp' => integer(),
       'updated_timestamp' => integer(),
       'additional_id_1' => binary(),
       'partner_metadata' => binary()
     }.

encode(#{ 'id' := Id,
          'external_business_id' := ExternalBusinessId,
          'connected_merchant_id' := ConnectedMerchantId,
          'connected_user_id' := ConnectedUserId,
          'connected_advertiser_id' := ConnectedAdvertiserId,
          'connected_lba_id' := ConnectedLbaId,
          'connected_tag_id' := ConnectedTagId,
          'partner_access_token_expiry' := PartnerAccessTokenExpiry,
          'partner_refresh_token_expiry' := PartnerRefreshTokenExpiry,
          'scopes' := Scopes,
          'created_timestamp' := CreatedTimestamp,
          'updated_timestamp' := UpdatedTimestamp,
          'additional_id_1' := AdditionalId1,
          'partner_metadata' := PartnerMetadata
        }) ->
    #{ 'id' => Id,
       'external_business_id' => ExternalBusinessId,
       'connected_merchant_id' => ConnectedMerchantId,
       'connected_user_id' => ConnectedUserId,
       'connected_advertiser_id' => ConnectedAdvertiserId,
       'connected_lba_id' => ConnectedLbaId,
       'connected_tag_id' => ConnectedTagId,
       'partner_access_token_expiry' => PartnerAccessTokenExpiry,
       'partner_refresh_token_expiry' => PartnerRefreshTokenExpiry,
       'scopes' => Scopes,
       'created_timestamp' => CreatedTimestamp,
       'updated_timestamp' => UpdatedTimestamp,
       'additional_id_1' => AdditionalId1,
       'partner_metadata' => PartnerMetadata
     }.
