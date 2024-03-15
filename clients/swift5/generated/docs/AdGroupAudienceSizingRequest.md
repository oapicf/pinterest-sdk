# AdGroupAudienceSizingRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoTargetingEnabled** | **Bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**placementGroup** | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] [default to "ALL"]
**creativeTypes** | **[String]** | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**targetingSpec** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**productGroupIds** | **[String]** | Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] 
**keywords** | [AdGroupAudienceSizingRequestKeywordsInner] | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


