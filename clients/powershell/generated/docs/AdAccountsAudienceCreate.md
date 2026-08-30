# AdAccountsAudienceCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Ad account ID. | [optional] 
**AudienceType** | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**Description** | **String** | Audience description. | [optional] 
**Name** | **String** | Audience name. | [optional] 
**Rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccountsAudienceCreate = Initialize-PSOpenAPIToolsAdAccountsAudienceCreate  -AdAccountId null `
 -AudienceType null `
 -Description null `
 -Name null `
 -Rule null
```

- Convert the resource to JSON
```powershell
$AdAccountsAudienceCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

