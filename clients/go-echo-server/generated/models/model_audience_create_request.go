package models

type AudienceCreateRequest struct {

	// Ad account ID.
	AdAccountId string `json:"ad_account_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Audience name.
	Name string `json:"name"`

	Rule AudienceRule `json:"rule"`

	// Audience description.
	Description string `json:"description,omitempty"`

	AudienceType AudienceCreateRequest1AudienceType `json:"audience_type"`
}
