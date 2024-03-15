package models

type CatalogsHotelAddress struct {

	// Primary street address of hotel.
	Addr1 string `json:"addr1,omitempty"`

	// City where the hotel is located.
	City string `json:"city,omitempty"`

	// State, county, province, where the hotel is located.
	Region string `json:"region,omitempty"`

	// Country where the hotel is located.
	Country string `json:"country,omitempty"`

	// Required for countries with a postal code system. Postal or zip code of the hotel.
	PostalCode string `json:"postal_code,omitempty"`
}
