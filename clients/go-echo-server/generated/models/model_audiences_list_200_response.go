package models

type AudiencesList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []AdAccountsAudience `json:"items"`
}
