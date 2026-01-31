# IntegrationMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdditionalId1** | **String** |  | [optional] 
**ConnectedAdvertiserId** | **String** |  | [optional] [readonly] 
**ConnectedLbaId** | **String** |  | [optional] 
**ConnectedMerchantId** | **String** |  | [optional] 
**ConnectedTagId** | **String** |  | [optional] 
**ConnectedUserId** | **String** |  | [optional] [readonly] 
**CreatedTimestamp** | **Decimal** |  | [optional] 
**ExternalBusinessId** | **String** |  | [optional] 
**Id** | **String** |  | [optional] 
**PartnerAccessTokenExpiry** | **Decimal** |  | [optional] 
**PartnerMetadata** | **String** |  | [optional] 
**PartnerRefreshTokenExpiry** | **Decimal** |  | [optional] 
**Scopes** | **String** |  | [optional] 
**UpdatedTimestamp** | **Decimal** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$IntegrationMetadata = Initialize-PSOpenAPIToolsIntegrationMetadata  -AdditionalId1 null `
 -ConnectedAdvertiserId null `
 -ConnectedLbaId null `
 -ConnectedMerchantId null `
 -ConnectedTagId null `
 -ConnectedUserId null `
 -CreatedTimestamp null `
 -ExternalBusinessId null `
 -Id null `
 -PartnerAccessTokenExpiry null `
 -PartnerMetadata null `
 -PartnerRefreshTokenExpiry null `
 -Scopes null `
 -UpdatedTimestamp null
```

- Convert the resource to JSON
```powershell
$IntegrationMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

