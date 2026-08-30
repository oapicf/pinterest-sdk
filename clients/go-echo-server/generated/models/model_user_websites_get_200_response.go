package models

type UserWebsitesGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []UserWebsite `json:"items"`
}
