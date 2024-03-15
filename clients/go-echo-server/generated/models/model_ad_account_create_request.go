package models

type AdAccountCreateRequest struct {

	Country Country `json:"country,omitempty"`

	// Ad Account name.
	Name string `json:"name,omitempty"`

	// Advertiser's owning user ID.
	OwnerUserId string `json:"owner_user_id,omitempty"`
}
