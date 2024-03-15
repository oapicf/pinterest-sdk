package models

type UserWebsitesGet200Response struct {

	Items []UserWebsiteSummary `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
