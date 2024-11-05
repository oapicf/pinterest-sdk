package models

type GetInvites200Response struct {

	// List of invite and request data.
	Items []InviteResponse `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
