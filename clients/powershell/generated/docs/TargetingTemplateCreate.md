# TargetingTemplateCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Also known as [&quot;&quot;expanded targeting&quot;&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to $true]
**Keywords** | [**TargetingTemplateKeyword[]**](TargetingTemplateKeyword.md) |  | [optional] 
**Name** | **String** | targeting template name | 
**PlacementGroup** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**TargetingAttributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingTemplateCreate = Initialize-PSOpenAPIToolsTargetingTemplateCreate  -AutoTargetingEnabled null `
 -Keywords null `
 -Name null `
 -PlacementGroup null `
 -TargetingAttributes null `
 -TrackingUrls null
```

- Convert the resource to JSON
```powershell
$TargetingTemplateCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

