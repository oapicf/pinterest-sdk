package models

// AudienceInsightsResponse - Audience interests and demographics.
type AudienceInsightsResponse struct {

	// Category interest distribution
	Categories []AudienceCategory `json:"categories,omitempty"`

	Demographics AudienceDemographics `json:"demographics,omitempty"`

	Type AudienceInsightType `json:"type,omitempty"`

	// Generation date
	Date *string `json:"date,omitempty" validate:"regexp=^\\\\d{4}-\\\\d{2}-\\\\d{2}$"`

	// Population count.
	Size int32 `json:"size,omitempty"`

	// Indicates whether the audience size has been rounded up to the next highest upper boundary.
	SizeIsUpperBound bool `json:"size_is_upper_bound,omitempty"`
}
