# TargetingTemplateCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | targeting template name | [optional] 
**AutoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/expanded-targeting&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;&quot;&quot;expanded targeting&quot;&quot;&lt;/a&gt;. | [optional] [default to $true]
**TargetingAttributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**PlacementGroup** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**Keywords** | [**TargetingTemplateKeyword[]**](TargetingTemplateKeyword.md) |  | [optional] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingTemplateCommon = Initialize-PSOpenAPIToolsTargetingTemplateCommon  -Name Gaming `
 -AutoTargetingEnabled null `
 -TargetingAttributes null `
 -PlacementGroup null `
 -Keywords [{&quot;value&quot;:&quot;cats&quot;,&quot;match_type&quot;:&quot;EXACT_NEGATIVE&quot;}] `
 -TrackingUrls null
```

- Convert the resource to JSON
```powershell
$TargetingTemplateCommon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

