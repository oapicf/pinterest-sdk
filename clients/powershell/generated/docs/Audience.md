# Audience
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Ad account ID. | [optional] 
**Id** | **String** | Audience ID. | [optional] 
**Name** | **String** | Audience name. | [optional] 
**AudienceType** | **String** | &lt;a href&#x3D;&quot;&quot;/docs/reference/glossary/#Audience Types&quot;&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**Description** | **String** | Audience description. | [optional] 
**Rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] 
**Size** | **Int32** | Audience size. | [optional] 
**Status** | **String** | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] 
**Type** | **String** | Always &quot;&quot;audience&quot;&quot;. | [optional] 
**CreatedTimestamp** | **Int32** | Creation time. Unix timestamp in seconds. | [optional] 
**UpdatedTimestamp** | **Int32** | Last update time. Unix timestamp in seconds. | [optional] 

## Examples

- Prepare the resource
```powershell
$Audience = Initialize-PSOpenAPIToolsAudience  -AdAccountId 549755885175 `
 -Id 1234 `
 -Name ACME Tools `
 -AudienceType null `
 -Description People who love making quilts. `
 -Rule null `
 -Size 1000 `
 -Status null `
 -Type audience `
 -CreatedTimestamp 1451431341 `
 -UpdatedTimestamp 1451431341
```

- Convert the resource to JSON
```powershell
$Audience | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

