# IntegrationRecord
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | [optional] 
**ExternalBusinessId** | **String** |  | [optional] 
**ConnectedMerchantId** | **String** |  | [optional] 
**ConnectedUserId** | **String** |  | [optional] [readonly] 
**ConnectedAdvertiserId** | **String** |  | [optional] [readonly] 
**ConnectedLbaId** | **String** |  | [optional] 
**ConnectedTagId** | **String** |  | [optional] 
**PartnerAccessToken** | **String** |  | [optional] 
**PartnerRefreshToken** | **String** |  | [optional] 
**PartnerPrimaryEmail** | **String** |  | [optional] 
**PartnerAccessTokenExpiry** | **Int32** |  | [optional] 
**PartnerRefreshTokenExpiry** | **Int32** |  | [optional] 
**Scopes** | **String** |  | [optional] 
**PartnerMetadata** | **String** |  | [optional] 
**AdditionalId1** | **String** |  | [optional] 
**CreatedTime** | **Int32** |  | [optional] 
**UpdatedTime** | **Int32** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$IntegrationRecord = Initialize-PSOpenAPIToolsIntegrationRecord  -Id null `
 -ExternalBusinessId null `
 -ConnectedMerchantId null `
 -ConnectedUserId null `
 -ConnectedAdvertiserId null `
 -ConnectedLbaId null `
 -ConnectedTagId null `
 -PartnerAccessToken null `
 -PartnerRefreshToken null `
 -PartnerPrimaryEmail null `
 -PartnerAccessTokenExpiry null `
 -PartnerRefreshTokenExpiry null `
 -Scopes null `
 -PartnerMetadata null `
 -AdditionalId1 null `
 -CreatedTime null `
 -UpdatedTime null
```

- Convert the resource to JSON
```powershell
$IntegrationRecord | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

