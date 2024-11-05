package models

type AudienceUpdateRequest struct {

	// Ad account ID.
	AdAccountId string `json:"ad_account_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Audience name.
	Name string `json:"name,omitempty"`

	Rule AudienceRule `json:"rule,omitempty"`

	// Audience description.
	Description string `json:"description,omitempty"`

	OperationType AudienceUpdateOperationType `json:"operation_type,omitempty"`
}
