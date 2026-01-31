package models

type InviteBusinessRoleBinding struct {

	// Unique identifier of the invite/request.
	Id string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`

	InviteData BaseInviteDataResponseInviteData `json:"invite_data,omitempty"`

	// Indicates whether the invite/request was received.
	IsReceivedInvite bool `json:"is_received_invite,omitempty"`

	// Metadata for the user that updated the invite/request.
	User map[string]interface{} `json:"user,omitempty"`

	// Unique identifier for the business that created the invite/request.
	CreatedByBusinessId string `json:"created_by_business_id,omitempty"`

	// Unique identifier for the user that created the invite/request.
	CreatedByUserId string `json:"created_by_user_id,omitempty"`
}
