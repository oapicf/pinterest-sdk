package models

type GetInvites200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []InviteResponse `json:"items"`
}
