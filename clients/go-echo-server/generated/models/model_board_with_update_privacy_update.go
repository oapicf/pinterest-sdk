package models

// BoardWithUpdatePrivacyUpdate - Resource create or update operation model.
type BoardWithUpdatePrivacyUpdate struct {

	Description *string `json:"description,omitempty"`

	//      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
	Name string `json:"name,omitempty"`

	Privacy BoardUpdatePrivacy `json:"privacy,omitempty"`
}
