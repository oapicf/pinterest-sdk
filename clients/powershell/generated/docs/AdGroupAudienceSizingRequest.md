# AdGroupAudienceSizingRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/expanded-targeting&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;&quot;&quot;expanded targeting&quot;&quot;&lt;/a&gt;. | [optional] [default to $true]
**PlacementGroup** | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;&quot;&quot;/docs/redoc/#section/Placement-group&quot;&quot;&gt;Placement group&lt;/a&gt;. | [optional] [default to "ALL"]
**CreativeTypes** | **String[]** | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**TargetingSpec** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**ProductGroupIds** | **String[]** | Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] 
**Keywords** | [**AdGroupAudienceSizingRequestKeywordsInner[]**](AdGroupAudienceSizingRequestKeywordsInner.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdGroupAudienceSizingRequest = Initialize-PSOpenAPIToolsAdGroupAudienceSizingRequest  -AutoTargetingEnabled true `
 -PlacementGroup null `
 -CreativeTypes null `
 -TargetingSpec null `
 -ProductGroupIds null `
 -Keywords null
```

- Convert the resource to JSON
```powershell
$AdGroupAudienceSizingRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

