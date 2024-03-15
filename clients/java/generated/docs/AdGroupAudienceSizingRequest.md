

# AdGroupAudienceSizingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional] |
|**placementGroup** | **PlacementGroupType** | &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. |  [optional] |
|**creativeTypes** | [**List&lt;CreativeTypesEnum&gt;**](#List&lt;CreativeTypesEnum&gt;) | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. |  [optional] |
|**targetingSpec** | [**TargetingSpec**](TargetingSpec.md) |  |  [optional] |
|**productGroupIds** | **List&lt;String&gt;** | Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. |  [optional] |
|**keywords** | [**List&lt;AdGroupAudienceSizingRequestKeywordsInner&gt;**](AdGroupAudienceSizingRequestKeywordsInner.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. |  [optional] |



## Enum: List&lt;CreativeTypesEnum&gt;

| Name | Value |
|---- | -----|
| REGULAR | &quot;REGULAR&quot; |
| VIDEO | &quot;VIDEO&quot; |
| SHOPPING | &quot;SHOPPING&quot; |
| CAROUSEL | &quot;CAROUSEL&quot; |
| MAX_VIDEO | &quot;MAX_VIDEO&quot; |
| SHOP_THE_PIN | &quot;SHOP_THE_PIN&quot; |
| COLLECTION | &quot;COLLECTION&quot; |
| IDEA | &quot;IDEA&quot; |



