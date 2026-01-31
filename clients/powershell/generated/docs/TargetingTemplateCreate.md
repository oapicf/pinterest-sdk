# TargetingTemplateCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/expanded-targeting&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;&quot;&quot;expanded targeting&quot;&quot;&lt;/a&gt;. | [optional] [default to $true]
**Keywords** | [**TargetingTemplateKeyword[]**](TargetingTemplateKeyword.md) |  | [optional] 
**Name** | **String** | Name of targeting template. | 
**PlacementGroup** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**TargetingAttributes** | [**TargetingSpec**](TargetingSpec.md) |  | 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingTemplateCreate = Initialize-PSOpenAPIToolsTargetingTemplateCreate  -AutoTargetingEnabled null `
 -Keywords [{value&#x3D;cats, match_type&#x3D;EXACT_NEGATIVE}] `
 -Name Gaming `
 -PlacementGroup null `
 -TargetingAttributes null `
 -TrackingUrls null
```

- Convert the resource to JSON
```powershell
$TargetingTemplateCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

