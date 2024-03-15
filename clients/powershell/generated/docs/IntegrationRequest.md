# IntegrationRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExternalBusinessId** | **String** | External business ID for the integration. | [optional] 
**ConnectedMerchantId** | **String** |  | [optional] 
**ConnectedAdvertiserId** | **String** |  | [optional] 
**ConnectedLbaId** | **String** |  | [optional] 
**ConnectedTagId** | **String** |  | [optional] 
**PartnerAccessToken** | **String** |  | [optional] 
**PartnerRefreshToken** | **String** |  | [optional] 
**PartnerPrimaryEmail** | **String** |  | [optional] 
**PartnerAccessTokenExpiry** | **Int32** |  | [optional] 
**PartnerRefreshTokenExpiry** | **Int32** |  | [optional] 
**Scopes** | **String** |  | [optional] 
**AdditionalId1** | **String** |  | [optional] 
**PartnerMetadata** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$IntegrationRequest = Initialize-PSOpenAPIToolsIntegrationRequest  -ExternalBusinessId null `
 -ConnectedMerchantId null `
 -ConnectedAdvertiserId null `
 -ConnectedLbaId null `
 -ConnectedTagId null `
 -PartnerAccessToken null `
 -PartnerRefreshToken null `
 -PartnerPrimaryEmail null `
 -PartnerAccessTokenExpiry null `
 -PartnerRefreshTokenExpiry null `
 -Scopes null `
 -AdditionalId1 null `
 -PartnerMetadata null
```

- Convert the resource to JSON
```powershell
$IntegrationRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

