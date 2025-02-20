package models

type AdGroupAudienceSizingRequest struct {

	// Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	AutoTargetingEnabled bool `json:"auto_targeting_enabled,omitempty"`

	// <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
	PlacementGroup PlacementGroupType `json:"placement_group,omitempty"`

	// Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
	CreativeTypes *[]string `json:"creative_types,omitempty"`

	TargetingSpec TargetingSpec `json:"targeting_spec,omitempty"`

	// Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
	ProductGroupIds *[]string `json:"product_group_ids,omitempty"`

	// Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
	Keywords *[]AdGroupAudienceSizingRequestKeywordsInner `json:"keywords,omitempty"`
}
