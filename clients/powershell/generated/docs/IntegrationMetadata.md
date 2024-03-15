# IntegrationMetadata
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
**PartnerAccessTokenExpiry** | **Decimal** |  | [optional] 
**PartnerRefreshTokenExpiry** | **Decimal** |  | [optional] 
**Scopes** | **String** |  | [optional] 
**CreatedTimestamp** | **Decimal** |  | [optional] 
**UpdatedTimestamp** | **Decimal** |  | [optional] 
**AdditionalId1** | **String** |  | [optional] 
**PartnerMetadata** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$IntegrationMetadata = Initialize-PSOpenAPIToolsIntegrationMetadata  -Id null `
 -ExternalBusinessId null `
 -ConnectedMerchantId null `
 -ConnectedUserId null `
 -ConnectedAdvertiserId null `
 -ConnectedLbaId null `
 -ConnectedTagId null `
 -PartnerAccessTokenExpiry null `
 -PartnerRefreshTokenExpiry null `
 -Scopes null `
 -CreatedTimestamp null `
 -UpdatedTimestamp null `
 -AdditionalId1 null `
 -PartnerMetadata null
```

- Convert the resource to JSON
```powershell
$IntegrationMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

