package models

type AdAccountsAudiencesSharedAccountsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []SharedAudienceAccount `json:"items"`
}
