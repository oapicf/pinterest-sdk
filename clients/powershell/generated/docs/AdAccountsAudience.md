# AdAccountsAudience
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Ad account ID. | [optional] 
**AudienceType** | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**CreatedByCompanyName** | **String** | The company that created this audience. | [optional] [readonly] 
**CreatedTimestamp** | **Int32** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**Description** | **String** | Audience description. | [optional] 
**Id** | **String** | Audience ID. | 
**IsNca** | **Boolean** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] [readonly] 
**Name** | **String** | Audience name. | [optional] 
**Rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 
**Size** | **Int32** | Audience size. | [optional] [readonly] 
**Status** | [**AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [readonly] 
**Type** | **String** | Always &quot;&quot;audience&quot;&quot;. | [optional] [readonly] 
**UpdatedTimestamp** | **Int32** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$AdAccountsAudience = Initialize-PSOpenAPIToolsAdAccountsAudience  -AdAccountId null `
 -AudienceType null `
 -CreatedByCompanyName null `
 -CreatedTimestamp null `
 -Description null `
 -Id null `
 -IsNca null `
 -Name null `
 -Rule null `
 -Size null `
 -Status null `
 -Type null `
 -UpdatedTimestamp null
```

- Convert the resource to JSON
```powershell
$AdAccountsAudience | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

