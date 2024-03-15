
# Table `AdGroupAudienceSizingRequest`
(mapped from: AdGroupAudienceSizingRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**autoTargetingEnabled** | auto_targeting_enabled | boolean |  | **kotlin.Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional]
**placementGroup** | placement_group | long |  | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. |  [optional] [foreignkey]
**creativeTypes** | `One-To-Many` | `----` | `----`  | [**creative_types**](#kotlin.Array&lt;CreativeTypes&gt;) | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. |  [optional]
**targetingSpec** | targeting_spec | long |  | [**TargetingSpec**](TargetingSpec.md) |  |  [optional] [foreignkey]
**productGroupIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. |  [optional]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupAudienceSizingRequestKeywordsInner&gt;**](AdGroupAudienceSizingRequestKeywordsInner.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. |  [optional]




# **Table `AdGroupAudienceSizingRequestCreativeTypes`**
(mapped from: AdGroupAudienceSizingRequestCreativeTypes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupAudienceSizingRequest | adGroupAudienceSizingRequest | long | | kotlin.Long | Primary Key | *one*
creativeTypes | creativeTypes | text | | kotlin.String | Foreign Key | *many*




# **Table `AdGroupAudienceSizingRequestProductGroupIds`**
(mapped from: AdGroupAudienceSizingRequestProductGroupIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupAudienceSizingRequest | adGroupAudienceSizingRequest | long | | kotlin.Long | Primary Key | *one*
productGroupIds | productGroupIds | text | | kotlin.String | Foreign Key | *many*



# **Table `AdGroupAudienceSizingRequestAdGroupAudienceSizingRequestKeywordsInner`**
(mapped from: AdGroupAudienceSizingRequestAdGroupAudienceSizingRequestKeywordsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupAudienceSizingRequest | adGroupAudienceSizingRequest | long | | kotlin.Long | Primary Key | *one*
adGroupAudienceSizingRequestKeywordsInner | adGroupAudienceSizingRequestKeywordsInner | long | | kotlin.Long | Foreign Key | *many*



