# AudienceCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Ad account ID. | [optional] 
**Name** | **String** | Audience name. | 
**Rule** | [**AudienceRule**](AudienceRule.md) |  | 
**AudienceType** | [**AudienceType**](AudienceType.md) | &lt;a href&#x3D;&quot;&quot;/docs/reference/glossary/#Audience Types&quot;&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive. | 
**Description** | **String** | Audience description. | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceCreateRequest = Initialize-PSOpenAPIToolsAudienceCreateRequest  -AdAccountId 549755885175 `
 -Name string `
 -Rule null `
 -AudienceType null `
 -Description string
```

- Convert the resource to JSON
```powershell
$AudienceCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

