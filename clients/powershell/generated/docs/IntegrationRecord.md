# IntegrationRecord
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdditionalId1** | **String** |  | [optional] 
**ConnectedAdvertiserId** | **String** |  | [optional] 
**ConnectedLbaId** | **String** |  | [optional] 
**ConnectedMerchantId** | **String** |  | [optional] 
**ConnectedTagId** | **String** |  | [optional] 
**ConnectedUserId** | **String** |  | [optional] 
**CreatedTime** | **Int32** |  | [optional] 
**ExternalBusinessId** | **String** |  | [optional] 
**Id** | **String** | Integration record ID. | [readonly] 
**PartnerAccessToken** | **String** |  | [optional] 
**PartnerAccessTokenExpiry** | **Int32** |  | [optional] 
**PartnerMetadata** | **String** |  | [optional] 
**PartnerPrimaryEmail** | **String** |  | [optional] 
**PartnerRefreshToken** | **String** |  | [optional] 
**PartnerRefreshTokenExpiry** | **Int32** |  | [optional] 
**Scopes** | **String** |  | [optional] 
**UpdatedTime** | **Int32** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$IntegrationRecord = Initialize-PSOpenAPIToolsIntegrationRecord  -AdditionalId1 null `
 -ConnectedAdvertiserId null `
 -ConnectedLbaId null `
 -ConnectedMerchantId null `
 -ConnectedTagId null `
 -ConnectedUserId null `
 -CreatedTime null `
 -ExternalBusinessId null `
 -Id null `
 -PartnerAccessToken null `
 -PartnerAccessTokenExpiry null `
 -PartnerMetadata null `
 -PartnerPrimaryEmail null `
 -PartnerRefreshToken null `
 -PartnerRefreshTokenExpiry null `
 -Scopes null `
 -UpdatedTime null
```

- Convert the resource to JSON
```powershell
$IntegrationRecord | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

