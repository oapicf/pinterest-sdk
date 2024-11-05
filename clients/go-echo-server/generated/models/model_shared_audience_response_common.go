package models

type SharedAudienceResponseCommon struct {

	// Audience ID that was shared
	AudienceId string `json:"audience_id,omitempty"`

	Permissions []Role `json:"permissions,omitempty"`
}
