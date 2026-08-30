package models

// AdAccountCreate - Resource create operation model.
type AdAccountCreate struct {

	Country Country `json:"country,omitempty"`

	Currency Currency `json:"currency,omitempty"`

	// Ad account name.
	Name string `json:"name,omitempty"`

	// Advertiser's owning user ID.
	OwnerUserId string `json:"owner_user_id,omitempty" validate:"regexp=^\\d+$"`

	// The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
	TimeZone string `json:"time_zone,omitempty"`
}
