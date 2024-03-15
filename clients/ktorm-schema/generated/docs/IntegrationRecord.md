
# Table `IntegrationRecord`
(mapped from: IntegrationRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** |  |  [optional]
**externalBusinessId** | external_business_id | text |  | **kotlin.String** |  |  [optional]
**connectedMerchantId** | connected_merchant_id | text |  | **kotlin.String** |  |  [optional]
**connectedUserId** | connected_user_id | text |  | **kotlin.String** |  |  [optional] [readonly]
**connectedAdvertiserId** | connected_advertiser_id | text |  | **kotlin.String** |  |  [optional] [readonly]
**connectedLbaId** | connected_lba_id | text |  | **kotlin.String** |  |  [optional]
**connectedTagId** | connected_tag_id | text |  | **kotlin.String** |  |  [optional]
**partnerAccessToken** | partner_access_token | text |  | **kotlin.String** |  |  [optional]
**partnerRefreshToken** | partner_refresh_token | text |  | **kotlin.String** |  |  [optional]
**partnerPrimaryEmail** | partner_primary_email | text |  | **kotlin.String** |  |  [optional]
**partnerAccessTokenExpiry** | partner_access_token_expiry | int |  | **kotlin.Int** |  |  [optional]
**partnerRefreshTokenExpiry** | partner_refresh_token_expiry | int |  | **kotlin.Int** |  |  [optional]
**scopes** | scopes | text |  | **kotlin.String** |  |  [optional]
**partnerMetadata** | partner_metadata | text |  | **kotlin.String** |  |  [optional]
**additionalId1** | additional_id_1 | text |  | **kotlin.String** |  |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** |  |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** |  |  [optional]



















