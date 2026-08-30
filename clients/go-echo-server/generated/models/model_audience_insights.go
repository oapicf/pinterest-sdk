package models

// AudienceInsights - Audience interests and demographics.
type AudienceInsights struct {

	// Category interest distribution
	Categories []AudienceCategory `json:"categories,omitempty"`

	// Generation date
	Date *string `json:"date,omitempty" validate:"regexp=^\\d{4}-\\d{2}-\\d{2}$"`

	Demographics AudienceDemographics `json:"demographics,omitempty"`

	// Population count.
	Size int32 `json:"size,omitempty"`

	// Indicates whether the audience size has been rounded up to the next highest upper boundary.
	SizeIsUpperBound bool `json:"size_is_upper_bound,omitempty"`

	Type AudienceInsightType `json:"type,omitempty"`
}
