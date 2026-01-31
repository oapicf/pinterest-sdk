package models

// AdAccountCreate - Resource create operation model.
type AdAccountCreate struct {

	Country Country `json:"country,omitempty"`

	Currency Currency `json:"currency,omitempty"`

	// Ad account name.
	Name string `json:"name,omitempty"`

	// Advertiser's owning user ID.
	OwnerUserId string `json:"owner_user_id,omitempty" validate:"regexp=^\\\\d+$"`
}
