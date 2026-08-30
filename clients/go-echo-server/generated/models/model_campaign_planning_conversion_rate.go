package models

// CampaignPlanningConversionRate - Conversion rate estimate for a specific conversion event and attribution window combination.
type CampaignPlanningConversionRate struct {

	AttributionWindows CampaignPlanningConversionAttribution `json:"attribution_windows"`

	ConversionEvent CampaignPlanningConversionEvent `json:"conversion_event"`

	// Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
	ConversionRate float32 `json:"conversion_rate"`
}
