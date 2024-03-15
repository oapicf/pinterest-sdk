package models

type UserFollowingGet200Response struct {

	// Users
	Items []UserSummary `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
