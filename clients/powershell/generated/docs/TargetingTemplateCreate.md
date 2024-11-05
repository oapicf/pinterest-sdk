# TargetingTemplateCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Name of targeting template. | 
**AutoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/expanded-targeting&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;&quot;&quot;expanded targeting&quot;&quot;&lt;/a&gt;. | [optional] [default to $true]
**TargetingAttributes** | [**TargetingSpec**](TargetingSpec.md) |  | 
**PlacementGroup** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**Keywords** | [**TargetingTemplateKeyword[]**](TargetingTemplateKeyword.md) |  | [optional] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingTemplateCreate = Initialize-PSOpenAPIToolsTargetingTemplateCreate  -Name Gaming `
 -AutoTargetingEnabled null `
 -TargetingAttributes null `
 -PlacementGroup null `
 -Keywords [{value&#x3D;cats, match_type&#x3D;EXACT_NEGATIVE}] `
 -TrackingUrls null
```

- Convert the resource to JSON
```powershell
$TargetingTemplateCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

