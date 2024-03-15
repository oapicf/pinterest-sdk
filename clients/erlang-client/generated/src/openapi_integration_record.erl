-module(openapi_integration_record).

-export([encode/1]).

-export_type([openapi_integration_record/0]).

-type openapi_integration_record() ::
    #{ 'id' => binary(),
       'external_business_id' => binary(),
       'connected_merchant_id' => binary(),
       'connected_user_id' => binary(),
       'connected_advertiser_id' => binary(),
       'connected_lba_id' => binary(),
       'connected_tag_id' => binary(),
       'partner_access_token' => binary(),
       'partner_refresh_token' => binary(),
       'partner_primary_email' => binary(),
       'partner_access_token_expiry' => integer(),
       'partner_refresh_token_expiry' => integer(),
       'scopes' => binary(),
       'partner_metadata' => binary(),
       'additional_id_1' => binary(),
       'created_time' => integer(),
       'updated_time' => integer()
     }.

encode(#{ 'id' := Id,
          'external_business_id' := ExternalBusinessId,
          'connected_merchant_id' := ConnectedMerchantId,
          'connected_user_id' := ConnectedUserId,
          'connected_advertiser_id' := ConnectedAdvertiserId,
          'connected_lba_id' := ConnectedLbaId,
          'connected_tag_id' := ConnectedTagId,
          'partner_access_token' := PartnerAccessToken,
          'partner_refresh_token' := PartnerRefreshToken,
          'partner_primary_email' := PartnerPrimaryEmail,
          'partner_access_token_expiry' := PartnerAccessTokenExpiry,
          'partner_refresh_token_expiry' := PartnerRefreshTokenExpiry,
          'scopes' := Scopes,
          'partner_metadata' := PartnerMetadata,
          'additional_id_1' := AdditionalId1,
          'created_time' := CreatedTime,
          'updated_time' := UpdatedTime
        }) ->
    #{ 'id' => Id,
       'external_business_id' => ExternalBusinessId,
       'connected_merchant_id' => ConnectedMerchantId,
       'connected_user_id' => ConnectedUserId,
       'connected_advertiser_id' => ConnectedAdvertiserId,
       'connected_lba_id' => ConnectedLbaId,
       'connected_tag_id' => ConnectedTagId,
       'partner_access_token' => PartnerAccessToken,
       'partner_refresh_token' => PartnerRefreshToken,
       'partner_primary_email' => PartnerPrimaryEmail,
       'partner_access_token_expiry' => PartnerAccessTokenExpiry,
       'partner_refresh_token_expiry' => PartnerRefreshTokenExpiry,
       'scopes' => Scopes,
       'partner_metadata' => PartnerMetadata,
       'additional_id_1' => AdditionalId1,
       'created_time' => CreatedTime,
       'updated_time' => UpdatedTime
     }.
