package models

// AdGroupDeliveryEstimates - Ad group configuration for delivery estimates.
type AdGroupDeliveryEstimates struct {

	AutoTargetingEnabled bool `json:"auto_targeting_enabled,omitempty"`

	// Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
	CreativeTypes []AdGroupAudienceSizingCreativeTypes `json:"creative_types,omitempty"`

	// Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
	Keywords *[]AdGroupDeliveryEstimatesKeywordsItems `json:"keywords,omitempty"`

	// Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
	MonthlyFrequencyCap int32 `json:"monthly_frequency_cap,omitempty"`

	OptimizationGoalMetadata OptimizationGoalMetadata `json:"optimization_goal_metadata,omitempty"`

	// Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
	OptimizationType OptimizationType `json:"optimization_type,omitempty"`

	PlacementGroup PlacementGroupType `json:"placement_group,omitempty"`

	// [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
	ProductGroupIds []string `json:"product_group_ids,omitempty"`

	TargetingSpec TargetingSpecOptimal `json:"targeting_spec,omitempty"`
}
