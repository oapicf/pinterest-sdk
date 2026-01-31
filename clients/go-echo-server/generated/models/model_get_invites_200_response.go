package models

type GetInvites200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// List of invite and request data.
	Items []InviteResponse `json:"items"`
}
