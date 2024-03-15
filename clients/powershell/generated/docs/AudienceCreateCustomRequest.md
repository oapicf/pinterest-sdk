# AudienceCreateCustomRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Ad account ID. | [optional] 
**Name** | **String** | Audience name. | 
**Rule** | [**AudienceRule**](AudienceRule.md) |  | 
**SharingType** | [**AudienceSharingType**](AudienceSharingType.md) |  | 
**DataParty** | [**AudienceDataParty**](AudienceDataParty.md) |  | 
**Category** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceCreateCustomRequest = Initialize-PSOpenAPIToolsAudienceCreateCustomRequest  -AdAccountId 549755885175 `
 -Name string `
 -Rule null `
 -SharingType null `
 -DataParty null `
 -Category DLX Demographics
```

- Convert the resource to JSON
```powershell
$AudienceCreateCustomRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

