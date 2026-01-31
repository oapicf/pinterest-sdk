-module(openapi_integration_metadata).

-export([encode/1]).

-export_type([openapi_integration_metadata/0]).

-type openapi_integration_metadata() ::
    #{ 'additional_id_1' => binary(),
       'connected_advertiser_id' => binary(),
       'connected_lba_id' => binary(),
       'connected_merchant_id' => binary(),
       'connected_tag_id' => binary(),
       'connected_user_id' => binary(),
       'created_timestamp' => integer(),
       'external_business_id' => binary(),
       'id' => binary(),
       'partner_access_token_expiry' => integer(),
       'partner_metadata' => binary(),
       'partner_refresh_token_expiry' => integer(),
       'scopes' => binary(),
       'updated_timestamp' => integer()
     }.

encode(#{ 'additional_id_1' := AdditionalId1,
          'connected_advertiser_id' := ConnectedAdvertiserId,
          'connected_lba_id' := ConnectedLbaId,
          'connected_merchant_id' := ConnectedMerchantId,
          'connected_tag_id' := ConnectedTagId,
          'connected_user_id' := ConnectedUserId,
          'created_timestamp' := CreatedTimestamp,
          'external_business_id' := ExternalBusinessId,
          'id' := Id,
          'partner_access_token_expiry' := PartnerAccessTokenExpiry,
          'partner_metadata' := PartnerMetadata,
          'partner_refresh_token_expiry' := PartnerRefreshTokenExpiry,
          'scopes' := Scopes,
          'updated_timestamp' := UpdatedTimestamp
        }) ->
    #{ 'additional_id_1' => AdditionalId1,
       'connected_advertiser_id' => ConnectedAdvertiserId,
       'connected_lba_id' => ConnectedLbaId,
       'connected_merchant_id' => ConnectedMerchantId,
       'connected_tag_id' => ConnectedTagId,
       'connected_user_id' => ConnectedUserId,
       'created_timestamp' => CreatedTimestamp,
       'external_business_id' => ExternalBusinessId,
       'id' => Id,
       'partner_access_token_expiry' => PartnerAccessTokenExpiry,
       'partner_metadata' => PartnerMetadata,
       'partner_refresh_token_expiry' => PartnerRefreshTokenExpiry,
       'scopes' => Scopes,
       'updated_timestamp' => UpdatedTimestamp
     }.
