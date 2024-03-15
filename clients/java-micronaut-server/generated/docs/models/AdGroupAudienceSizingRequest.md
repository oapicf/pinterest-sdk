

# AdGroupAudienceSizingRequest

The class is defined in **[AdGroupAudienceSizingRequest.java](../../src/main/java/org/openapitools/model/AdGroupAudienceSizingRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoTargetingEnabled** | `Boolean` | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional property]
**placementGroup** | `PlacementGroupType` | &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. |  [optional property]
**creativeTypes** | [**List&lt;CreativeTypesEnum&gt;**](#List&lt;CreativeTypesEnum&gt;) | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. |  [optional property]
**targetingSpec** | [`TargetingSpec`](TargetingSpec.md) |  |  [optional property]
**productGroupIds** | `List&lt;String&gt;` | Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. |  [optional property]
**keywords** | [`List&lt;AdGroupAudienceSizingRequestKeywordsInner&gt;`](AdGroupAudienceSizingRequestKeywordsInner.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. |  [optional property]



## List&lt;CreativeTypesEnum&gt;

Name | Value
---- | -----
REGULAR | `"REGULAR"`
VIDEO | `"VIDEO"`
SHOPPING | `"SHOPPING"`
CAROUSEL | `"CAROUSEL"`
MAX_VIDEO | `"MAX_VIDEO"`
SHOP_THE_PIN | `"SHOP_THE_PIN"`
COLLECTION | `"COLLECTION"`
IDEA | `"IDEA"`





