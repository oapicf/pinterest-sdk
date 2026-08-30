package models

// AdGroupAudienceSizingCreate - Resource create operation model.
type AdGroupAudienceSizingCreate struct {

	// Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
	AutoTargetingEnabled bool `json:"auto_targeting_enabled,omitempty"`

	// Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
	CreativeTypes *[]AdGroupAudienceSizingCreativeTypes `json:"creative_types,omitempty"`

	// Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
	Keywords *[]AdGroupAudienceSizingKeyword `json:"keywords,omitempty"`

	// [Placement group](/docs/redoc/#section/Placement-group).
	PlacementGroup AdgroupPlacementGroupType `json:"placement_group,omitempty"`

	// Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
	ProductGroupIds *[]string `json:"product_group_ids,omitempty"`

	TargetingSpec TargetingSpecOptimal `json:"targeting_spec,omitempty"`
}
