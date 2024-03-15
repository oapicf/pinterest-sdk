# AD_GROUP_AUDIENCE_SIZING_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **BOOLEAN** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**placement_group** | [**PLACEMENT_GROUP_TYPE**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] [default to ALL]
**creative_types** | [**LIST [STRING_32]**](STRING_32.md) | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to null]
**targeting_spec** | [**TARGETING_SPEC**](TargetingSpec.md) |  | [optional] [default to null]
**product_group_ids** | [**LIST [STRING_32]**](STRING_32.md) | Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] [default to null]
**keywords** | [**LIST [AD_GROUP_AUDIENCE_SIZING_REQUEST_KEYWORDS_INNER]**](AdGroupAudienceSizingRequest_keywords_inner.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


