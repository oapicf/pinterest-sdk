# IntegrationMetadataUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdditionalId1** | **String** |  | [optional] 
**ConnectedAdvertiserId** | **String** |  | [optional] 
**ConnectedLbaId** | **String** |  | [optional] 
**ConnectedMerchantId** | **String** |  | [optional] 
**ConnectedTagId** | **String** |  | [optional] 
**PartnerAccessToken** | **String** |  | [optional] 
**PartnerAccessTokenExpiry** | **Decimal** |  | [optional] 
**PartnerMetadata** | **String** |  | [optional] 
**PartnerPrimaryEmail** | **String** |  | [optional] 
**PartnerRefreshToken** | **String** |  | [optional] 
**PartnerRefreshTokenExpiry** | **Decimal** |  | [optional] 
**Scopes** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$IntegrationMetadataUpdate = Initialize-PSOpenAPIToolsIntegrationMetadataUpdate  -AdditionalId1 null `
 -ConnectedAdvertiserId null `
 -ConnectedLbaId null `
 -ConnectedMerchantId null `
 -ConnectedTagId null `
 -PartnerAccessToken null `
 -PartnerAccessTokenExpiry null `
 -PartnerMetadata null `
 -PartnerPrimaryEmail null `
 -PartnerRefreshToken null `
 -PartnerRefreshTokenExpiry null `
 -Scopes null
```

- Convert the resource to JSON
```powershell
$IntegrationMetadataUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

