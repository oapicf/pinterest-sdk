package models

type UserFollowingGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// Users
	Items []UserSummary `json:"items"`
}
