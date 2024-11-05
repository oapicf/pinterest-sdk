package models

type AdAccountsAudiencesSharedAccountsList200Response struct {

	Items []SharedAudienceAccount `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
