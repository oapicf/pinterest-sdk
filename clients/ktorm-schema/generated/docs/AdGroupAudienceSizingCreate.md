
# Table `AdGroupAudienceSizingCreate`
(mapped from: AdGroupAudienceSizingCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**autoTargetingEnabled** | auto_targeting_enabled | boolean |  | **kotlin.Boolean** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). |  [optional]
**creativeTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupAudienceSizingCreativeTypes&gt;**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. |  [optional]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupAudienceSizingKeyword&gt;**](AdGroupAudienceSizingKeyword.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. |  [optional]
**placementGroup** | placement_group | long |  | [**AdgroupPlacementGroupType**](AdgroupPlacementGroupType.md) | [Placement group](/docs/redoc/#section/Placement-group). |  [optional] [foreignkey]
**productGroupIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. |  [optional]
**targetingSpec** | targeting_spec | long |  | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  |  [optional] [foreignkey]



# **Table `AdGroupAudienceSizingCreateAdGroupAudienceSizingCreativeTypes`**
(mapped from: AdGroupAudienceSizingCreateAdGroupAudienceSizingCreativeTypes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupAudienceSizingCreate | adGroupAudienceSizingCreate | long | | kotlin.Long | Primary Key | *one*
adGroupAudienceSizingCreativeTypes | adGroupAudienceSizingCreativeTypes | long | | kotlin.Long | Foreign Key | *many*



# **Table `AdGroupAudienceSizingCreateAdGroupAudienceSizingKeyword`**
(mapped from: AdGroupAudienceSizingCreateAdGroupAudienceSizingKeyword)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupAudienceSizingCreate | adGroupAudienceSizingCreate | long | | kotlin.Long | Primary Key | *one*
adGroupAudienceSizingKeyword | adGroupAudienceSizingKeyword | long | | kotlin.Long | Foreign Key | *many*




# **Table `AdGroupAudienceSizingCreateProductGroupIds`**
(mapped from: AdGroupAudienceSizingCreateProductGroupIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupAudienceSizingCreate | adGroupAudienceSizingCreate | long | | kotlin.Long | Primary Key | *one*
productGroupIds | productGroupIds | text | | kotlin.String | Foreign Key | *many*




